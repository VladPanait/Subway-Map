package com.example.vladut.subwayapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Vladut on 4/25/2017.
 */

public class DBAdapter {
    private static final String TABLE_POINTS = "points";
    private static final String COLUMN_ID = "id";

    private static final String DB_NAME = "map.db";
    private static final int DB_VERSION = 1;

    // Database creation sql statement
    public static final String DB_CREATE = "create table "
            + TABLE_POINTS + "( " + COLUMN_ID
            + " integer primary key autoincrement, " + "X integer,"
            + " Y integer);";

    public SQLiteDatabase myDB;
    //public final Context myContext;


}
