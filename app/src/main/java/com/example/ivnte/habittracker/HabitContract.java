package com.example.ivnte.habittracker;

import android.provider.BaseColumns;

/**
 * Created by ivnte on 2016-10-30.
 */
public class HabitContract {
    public static final String DB_NAME = "com.example.ivnte.habittracker.db";
    public static final int DB_VERSION = 1;

    public class HabitEntry implements BaseColumns {
        public static final String TABLE = "habits";

        public static final String COLUMN_HABIT_NAME = "habit";
        public static final String COLUMN_HABIT_FREQ = "freq";
    }
}
