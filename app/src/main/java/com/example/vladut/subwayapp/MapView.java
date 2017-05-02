package com.example.vladut.subwayapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import java.util.*;

/**
 * Created by Vladut on 4/19/2017...
 */

public class MapView extends View {
    private static final String TAG = "MapView";

    Paint myPaint = new Paint();
    DBHelper myDB = new DBHelper(getContext());

    ArrayList<SubwayStation> stations = new ArrayList<>();


    public MapView(Context context, AttributeSet attrs) {
        super(context,attrs);
        init(context, attrs, 0);
        stations = new ArrayList<>();
        stations = myDB.ArrayListStations();
    }

    public MapView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context, attrs, defStyle);
        stations = new ArrayList<>();
        stations = myDB.ArrayListStations();
    }

    private void init(Context context, AttributeSet attrs, int defStyle) {
        myPaint.setColor(Color.BLACK);
        myPaint.setStrokeWidth(10);
        myPaint.setColor(0xffff0000);
    }

    public MapView(Context context) {
        super(context);
        stations = new ArrayList<>();
        stations = myDB.ArrayListStations();
    }


//    public void AddArrayListValues()
//    {
//        stations.add(new SubwayStation("first", new PointF(100, 100), 1));
//        stations.add(new SubwayStation("second", new PointF(200, 200), 2));
//        stations.add(new SubwayStation("third", new PointF(300, 300), 3));
//        stations.add(new SubwayStation("fourth", new PointF(300, 400), 4));
//        stations.add(new SubwayStation("fifth", new PointF(400, 500), 5));
//        stations.add(new SubwayStation("sixth", new PointF(500, 600), 6));
//        stations.add(new SubwayStation("seventh", new PointF(600, 700), 7));
//        stations.add(new SubwayStation("eighth", new PointF(100, 500), 8));
//    }


    @Override
    public void onDraw(Canvas canvas) {
//        stations.clear();
//        AddArrayListValues();
        for(int i=0; i<stations.size()-1; i++) {
            Log.d(TAG, stations.get(i).writeSS());
            //Log.d(TAG, "table count: " + myDB.getTableRowCount());

            canvas.drawCircle(stations.get(i).getP().x, stations.get(i).getP().y, 20, myPaint); //drawing the stations
            canvas.drawLine(stations.get(i).getP().x, stations.get(i).getP().y, stations.get(i + 1).getP().x, stations.get(i + 1).getP().y, myPaint); //drawing the road between stations
        }
        canvas.drawCircle(stations.get(stations.size()-1).getP().x, stations.get(stations.size()-1).getP().y, 20, myPaint);
    }

}
