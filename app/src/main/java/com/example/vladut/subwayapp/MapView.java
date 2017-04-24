package com.example.vladut.subwayapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.view.View;
import java.util.*;

/**
 * Created by Vladut on 4/19/2017.
 */

public class MapView extends View {
    Paint myPaint = new Paint();

    ArrayList<PointF> points = new ArrayList<>();


    public MapView(Context context) {
        super(context);
        myPaint.setColor(Color.BLACK);
        myPaint.setStrokeWidth(10);
        myPaint.setColor(0xffff0000);
    }


    public void AddArrayListValues()
    {
        points.add(new PointF(100, 100));
        points.add(new PointF(200, 200));
        points.add(new PointF(300, 300));
        points.add(new PointF(300, 400));
        points.add(new PointF(400, 500));
        points.add(new PointF(500, 600));
        points.add(new PointF(600, 700));
        points.add(new PointF(700, 800));
    }


    @Override
    public void onDraw(Canvas canvas) {
        points.clear();
        AddArrayListValues();
        for(int i=0; i<points.size()-1; i++)
        {
            canvas.drawCircle(points.get(i).x, points.get(i).y, 20, myPaint); //drawing the stations
            canvas.drawLine(points.get(i).x, points.get(i).y, points.get(i+1).x, points.get(i+1).y, myPaint); //drawing the road between stations
        }


    }







}
