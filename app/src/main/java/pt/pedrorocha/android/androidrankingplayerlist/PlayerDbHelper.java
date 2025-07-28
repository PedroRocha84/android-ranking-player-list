package pt.pedrorocha.android.androidrankingplayerlist;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class PlayerDbHelper extends SQLiteOpenHelper {

    private SQLiteDatabase db;

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "players.db";

    public PlayerDbHelper( Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String query = "CREATE TABLE " +
                PlayerDbSchema.PlayerTable.TABLE_NAME + " ( " +
                PlayerDbSchema.PlayerTable._ID + "INTEGER PRIMARY KEY, " +
                PlayerDbSchema.PlayerTable.COLUMN_NAME + " TEXT, " +
                PlayerDbSchema.PlayerTable.COLUMN_EMAIL + " TEXT, " +
                PlayerDbSchema.PlayerTable.COLUMN_AGE + " TEXT, " +
                PlayerDbSchema.PlayerTable.COLUMN_POINTS + " TEXT, " +
                PlayerDbSchema.PlayerTable.COLUMN_PHOTO_URL + " TEXT)";

        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + PlayerDbSchema.PlayerTable.TABLE_NAME);
        onCreate(db);
    }
}
