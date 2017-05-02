package com.example.vladut.subwayapp;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.graphics.PointF;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by Vladut on 4/25/2017.
 */

public class DBHelper extends SQLiteOpenHelper {

    private static final String TAG = "DBHelper";


    private static final String TABLE_NAME_STATIONS = "STATIONS";
    private static final String TABLE_NAME_ROUTE = "ROUTES";
    private static final String COL_ID = "ID";
    private static final String STATION_COL_NAME = "NAME";
    private static final String STATION_COL_X = "X";
    private static final String STATION_COL_Y = "Y";
    private static final String STATION_COL_COORD_X = "COORDX";
    private static final String STATION_COL_COORD_Y = "COORDY";
    private static final String STATION_ROUTE = "ROUTE";

    private static final String DB_NAME = "map.db";
    private static final int DB_VERSION = 1;

    public DBHelper(Context context)
    {
        super(context, DB_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL("create table " + TABLE_NAME_STATIONS + " (ID integer primary key autoincrement, NAME text, X float, Y float)");
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME_STATIONS);
        onCreate(db);
    }

    public boolean insertStation(SubwayStation station)
    {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(STATION_COL_NAME, station.getName());
        values.put(STATION_COL_X, station.getP().x);
        values.put(STATION_COL_Y, station.getP().y);

        long result = db.insert(TABLE_NAME_STATIONS, null, values);

        if(result == -1)
        {
            return false;
        }
        return true;
    }
    public void deleteStation(SubwayStation station) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(DB_NAME, COL_ID + " = " + station.getID(), null);
        System.out.println("Station having the id: " + station.getID() + ", deleted!");
    }

    public void clearStationTable()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_NAME_STATIONS, null, null);
    }


    public Cursor getAllStations()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select * from " + TABLE_NAME_STATIONS, null);
        return cursor;
    }

    public ArrayList<SubwayStation> ArrayListStations()
    {
        Cursor cursor = getAllStations();
        if (cursor.getCount() == 0)
        {
            //error message
            return null;
        }
        ArrayList<SubwayStation> allStations = new ArrayList<>();
        while(cursor.moveToNext())
        {
            SubwayStation ss = new SubwayStation(cursor.getString(1), new PointF(cursor.getFloat(2), cursor.getFloat(3)), cursor.getInt(0));
            allStations.add(ss);
        }
        return allStations;
    }

}
