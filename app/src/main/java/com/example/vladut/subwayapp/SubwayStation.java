package com.example.vladut.subwayapp;

import android.graphics.PointF;

/**
 * Created by Vladut on 4/26/2017.
 */

public class SubwayStation {

    private PointF P;
    private int ID;
    private String name;
    private double coordX;
    private double coordY;
//    private int route;

    public SubwayStation(String name, PointF P)
    {
        this.name = name;
        this.P = P;
//        this.coordX = coordX;
//        this.coordY = coordY;
//        this.route = route;
        //this.ID = ID;
    }

    public PointF getP()
    {
        return P;
    }

    public int getID()
    {
        return ID;
    }

//    public int getRoute()
//    {
//        return route;
//    }

    public double getCoordX()
    {
        return coordX;
    }

    public double getCoordY()
    {
        return coordY;
    }

    public String getName()
    {
        return name;
    }

    public String writeSS(){
        return "Nume: " + name + "; X: " + P.x;
    }
}

