package pt.pedrorocha.android.androidrankingplayerlist;

import android.provider.BaseColumns;

public final class PlayerDbSchema {

    private PlayerDbSchema()
    {}

    public static class PlayerTable implements BaseColumns{

        public static final String TABLE_NAME = "players";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_EMAIL = "email";
        public static final String COLUMN_AGE = "age";
        public static final String COLUMN_POINTS = "points";
        public static final String COLUMN_PHOTO_URL = "photoUrl";

    }
}

