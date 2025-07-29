package pt.pedrorocha.android.androidrankingplayerlist;

import android.content.ContentValues;
import android.database.Cursor;
import android.util.Log;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlayerService {

    private final PlayerDbHelper dbHelper;
    private PlayerAdapter adapter;
    long id;

    public PlayerService(PlayerDbHelper dbHelper){ this.dbHelper = dbHelper; };

    public Player insert(Player player){

        ContentValues values = new ContentValues();

        values.put(PlayerDbSchema.PlayerTable.COLUMN_NAME, player.getName());
        values.put(PlayerDbSchema.PlayerTable.COLUMN_AGE, player.getAge());
        values.put(PlayerDbSchema.PlayerTable.COLUMN_EMAIL, player.getEmail());
        values.put(PlayerDbSchema.PlayerTable.COLUMN_POINTS, player.getPoints());
        values.put(PlayerDbSchema.PlayerTable.COLUMN_PHOTO_URL, player.getPhotoUrl());

        id = dbHelper.getDb().insert(PlayerDbSchema.PlayerTable.TABLE_NAME, null, values);
        player.setId(id);
        notifyChanges(adapter,id);
        return player;

    }

    public List<Player> list(){
            String[] projection = {
                    PlayerDbSchema.PlayerTable._ID,
                    PlayerDbSchema.PlayerTable.COLUMN_NAME,
                    PlayerDbSchema.PlayerTable.COLUMN_EMAIL,
                    PlayerDbSchema.PlayerTable.COLUMN_AGE,
                    PlayerDbSchema.PlayerTable.COLUMN_POINTS,
                    PlayerDbSchema.PlayerTable.COLUMN_PHOTO_URL };

            String sortOrder = PlayerDbSchema.PlayerTable.COLUMN_POINTS + " DESC";

            Cursor cursor = dbHelper.getDb().query(
                    PlayerDbSchema.PlayerTable.TABLE_NAME,
                    projection,                          // columns to query
                    null,                                // no where clause
                    null,                                // no values for where clause
                    null,                                // don't group rows
                    null,                                // don't filter group rows
                    sortOrder
            );

            List<Player> players = new ArrayList<>();

            int idIndex = cursor.getColumnIndexOrThrow(PlayerDbSchema.PlayerTable._ID);
            int nameIndex = cursor.getColumnIndexOrThrow(PlayerDbSchema.PlayerTable.COLUMN_NAME);
            int pointsIndex = cursor.getColumnIndexOrThrow(PlayerDbSchema.PlayerTable.COLUMN_POINTS);
            int emailIndex = cursor.getColumnIndexOrThrow(PlayerDbSchema.PlayerTable.COLUMN_EMAIL);
            int photoIndex = cursor.getColumnIndexOrThrow(PlayerDbSchema.PlayerTable.COLUMN_PHOTO_URL);
            int ageIndex = cursor.getColumnIndexOrThrow(PlayerDbSchema.PlayerTable.COLUMN_AGE);

            while (cursor.moveToNext()){
                Player player = new Player(cursor.getString(nameIndex),
                        cursor.getInt(pointsIndex),
                        cursor.getString(emailIndex),
                        cursor.getInt(ageIndex),
                        cursor.getString(photoIndex));
                player.setId(cursor.getLong(idIndex));

                players.add(player);
            }
            cursor.close();
            return players;
    }

    public void addAdapter(PlayerAdapter adapter) {
        this.adapter = adapter;
    }

    public void notifyChanges(PlayerAdapter adapter, long position){
        adapter.notifyItemChanged((int) position);
    }
}
