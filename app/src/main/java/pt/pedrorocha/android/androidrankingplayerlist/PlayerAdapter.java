package pt.pedrorocha.android.androidrankingplayerlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import java.util.List;


public class PlayerAdapter extends RecyclerView.Adapter<PlayerAdapter.ViewHolder> {

    private List<Player> playersList;
    private Context context;

    public PlayerAdapter(Context context, List<Player> playersList) {
        this.playersList = playersList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.players_ranking_card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.nameView.setText(playersList.get(position).getName());
        holder.emailView.setText(playersList.get(position).getEmail());
        holder.ageView.setText(String.valueOf(playersList.get(position).getAge() + " years old"));
        holder.pointsView.setText(String.valueOf(playersList.get(position).getPoints() + " points"));
        Glide.with(context).load(playersList.get(position).getPhotoUrl()).into(holder.avatarView);
    }

    @Override
    public int getItemCount() {
        return playersList.size();
    }
    //Implementation View holder ( our card holder)
    public class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView nameView;
        private final TextView emailView;
        private final TextView ageView;
        private final TextView pointsView;
        private final ImageView avatarView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            nameView = itemView.findViewById(R.id.text_name);
            emailView = itemView.findViewById(R.id.text_email);
            ageView = itemView.findViewById(R.id.text_age);
            pointsView = itemView.findViewById(R.id.text_points);
            avatarView = itemView.findViewById(R.id.image_avatar);

        }
    }
}
