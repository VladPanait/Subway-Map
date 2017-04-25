package com.example.vladut.subwayapp;

import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;

/**
 * Created by Vladut on 4/25/2017.
 */

public class DBHelper extends SQLiteOpenHelper {
    public DBHelper(Context context, String name,CursorFactory factory, int version)
    {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL(DBAdapter.DB_CREATE);
    }
    public void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion) {}

}
