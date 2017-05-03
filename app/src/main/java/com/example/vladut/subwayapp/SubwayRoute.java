package com.example.vladut.subwayapp;

import java.util.ArrayList;

/**
 * Created by Vladut on 5/3/2017.
 */

// lasam ID-urile scoase din constructori?

public class SubwayRoute {
    private ArrayList<SubwayStation> routeStations;
    private String name;
    private String color;
    private int ID;

    public SubwayRoute(String name, ArrayList<SubwayStation> routeStations, String color)
    {
        this.name = name;
        this.routeStations = routeStations;
        this.color = color;
    }

    public String getName()
    {
        return name;
    }

    public int getID()
    {
        return ID;
    }

    public ArrayList<SubwayStation> getRouteStations()
    {
        return routeStations;
    }

    public String getColor()
    {
        return color;
    }

}
