package com.example.vladut.subwayapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.PointF;

/**
 * Created by Vladut on 4/25/2017.
 */

public class DBAdapter {
    private static final String TABLE_POINTS = "points";
    private static final String COLUMN_ID = "ID";

    private static final String DB_NAME = "map.db";
    private static final int DB_VERSION = 1;

    // Database creation sql statement
    public static final String DB_CREATE = "create table "
            + TABLE_POINTS + "( " + COLUMN_ID
            + " integer primary key autoincrement, " + "X integer,"
            + " Y integer);";

    public SQLiteDatabase myDB;
    private final Context myContext;
    private DBHelper dbHelper;

    public DBAdapter(Context context)
    {
        myContext = context;
        dbHelper = new DBHelper(myContext, DB_NAME, null, DB_VERSION);
    }

    public void open() throws SQLException {
        myDB = dbHelper.getWritableDatabase();
    }

    public void close()
    {
        dbHelper.close();
        myDB.close();
    }

    public void insertPoint(PointF P)
    {
        ContentValues values = new ContentValues();

        values.put("X", P.x);
        values.put("Y", P.y);

        myDB.insert(DB_NAME, null, values);
    }

    public void deletePoint(int ID)
    {
        myDB.delete(DB_NAME, COLUMN_ID + " = " + ID, null);
        System.out.println("Point having the id: " + ID + ", deleted!");
    }


}
