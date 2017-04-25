package com.example.vladut.subwayapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Vladut on 4/25/2017.
 */

public class DBAdapter {
    private static final String TABLE_STATIONS = "STATIONS";
    private static final String COLUMN_ID = "ID";

    private static final String DB_NAME = "map.db";
    private static final int DB_VERSION = 1;

    // Database creation sql statement
    public static final String DB_CREATE = "create table "
            + TABLE_STATIONS + "( " + COLUMN_ID
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

    public void insertStation(SubwayStation station)
    {
        ContentValues values = new ContentValues();

        values.put("X", station.getP().x);
        values.put("Y", station.getP().y);

        myDB.insert(DB_NAME, null, values);
    }

    public void deleteStation(SubwayStation station)
    {
        myDB.delete(DB_NAME, COLUMN_ID + " = " + station.getID(), null);
        System.out.println("Station having the id: " + station.getID() + ", deleted!");
    }

//    public ArrayList<PointF> getStations()
//    {
//        ArrayList<PointF> allStations = new ArrayList<>();
//        Cursor cursor = myDB.rawQuery("SELECT * FROM STATIONS ");
//    }

}
