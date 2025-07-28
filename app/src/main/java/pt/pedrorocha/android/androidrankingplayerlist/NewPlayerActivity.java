package pt.pedrorocha.android.androidrankingplayerlist;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class NewPlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_player);

        Button btnSubmit = findViewById(R.id.buttonSubmit);
        TextView name = findViewById(R.id.editTextName);
        TextView email = findViewById(R.id.editTextEmail);
        TextView age = findViewById(R.id.editTextAge);
        TextView points = findViewById(R.id.editTextPoints);
        TextView photoUrl = findViewById(R.id.editTextPhotoUrl);

        btnSubmit.setOnClickListener(v->{
            String nameTxt = name.getText().toString().trim();
            String emailTxt = email.getText().toString().trim();
            String ageTxt = age.getText().toString().trim();
            String pointsTxt = points.getText().toString().trim();
            String photoUrlTxt = photoUrl.getText().toString().trim();

            int ageValue, pointsValue;
            try {
                ageValue = Integer.parseInt(ageTxt);
                pointsValue = Integer.parseInt(pointsTxt);
            } catch (NumberFormatException e) {
                Toast.makeText(this, "Age and points must be valid numbers", Toast.LENGTH_SHORT).show();
                return;
            }

            Player player = new Player(nameTxt, ageValue, emailTxt, pointsValue, photoUrlTxt);
            Player.addPlayer(player);

            Intent intent = new Intent(this, HomeActivity.class);
            startActivity(intent);

            finish();
        });

    }
}