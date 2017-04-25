package com.example.vladut.subwayapp;

import android.graphics.PointF;

/**
 * Created by Vladut on 4/26/2017.
 */

public class SubwayStation {

    private PointF P;
    private int ID;

    public SubwayStation(PointF P, int ID)
    {
        this.P = P;
        this.ID = ID;
    }

    public PointF getP()
    {
        return P;
    }

    public int getID()
    {
        return ID;
    }


}

