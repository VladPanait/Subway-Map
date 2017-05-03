package com.example.vladut.subwayapp;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    DBHelper myDB;
    private static final String TAG = "MainActivity";

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()) {
                case R.id.navigation_home:
                    ShowMapViewFragment();
                    HideStationFragment();
                    return true;
                case R.id.navigation_dashboard:
                    HideMapViewFragment();
                    ShowStationFragment();
                    return true;
            }
            return false;
        }

    };

    private void HideStationFragment(){
        View frag = findViewById(R.id.station_view_fragment);
        frag.setVisibility(View.INVISIBLE);
    }

    private void ShowStationFragment(){
        View frag = findViewById(R.id.station_view_fragment);
        frag.setVisibility(View.VISIBLE);
    }

    private void HideMapViewFragment()
    {
        View frag = findViewById(R.id.map_view_fragment);
        frag.setVisibility(View.GONE);
    }

    private void ShowMapViewFragment()
    {
        View frag = findViewById(R.id.map_view_fragment);
        frag.setVisibility(View.VISIBLE);
    }


    public void bntHelpClick(View view){
        Intent startNewActivity = new Intent(this, HelpActivity.class);
        startActivity(startNewActivity);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"OnCreate");
        setContentView(R.layout.activity_main);
        myDB = new DBHelper(this);
        Log.d(TAG,"new DBHelper");


        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        ShowMapViewFragment();
        HideStationFragment();
        myDB.clearStationTable();
        myDB.insertStation(new SubwayStation("Preciziei", new PointF(100, 600)));
        Log.d(TAG,"first insert");

        myDB.insertStation(new SubwayStation("Pacii", new PointF(170, 550)));
        Log.d(TAG,"second insert");
        myDB.insertStation(new SubwayStation("Gorjului", new PointF(240, 550)));
        myDB.insertStation(new SubwayStation("Lujerului", new PointF(310, 550)));
        myDB.insertStation(new SubwayStation("Politehnica", new PointF(390, 550)));
        myDB.insertStation(new SubwayStation("Eroilor", new PointF(500, 550)));
        myDB.insertStation(new SubwayStation("Izvor", new PointF(580, 600)));
        myDB.insertStation(new SubwayStation("Unirii", new PointF(690, 670)));
        myDB.insertStation(new SubwayStation("Timpuri Noi", new PointF(770, 800)));
        myDB.insertStation(new SubwayStation("Mihai Bravu", new PointF(840, 790)));
        myDB.insertStation(new SubwayStation("Dristor", new PointF(920, 710)));
        myDB.insertStation(new SubwayStation("Nicolae Grigorescu", new PointF(1070, 770)));
        myDB.insertStation(new SubwayStation("1 decembrie", new PointF(1140, 770)));
        myDB.insertStation(new SubwayStation("Nicolae Teclu", new PointF(1220, 770)));
        myDB.insertStation(new SubwayStation("Anghel Saligny", new PointF(1290, 770)));


        myDB.insertStation(new SubwayStation("Pipera", new PointF(550, 550)));
        myDB.insertStation(new SubwayStation("Aurel Vlaicu", new PointF(450, 650)));
        myDB.insertStation(new SubwayStation("Aviatorilor", new PointF(400, 700)));
        myDB.insertStation(new SubwayStation("Piata Victoriei", new PointF(400, 750)));
        myDB.insertStation(new SubwayStation("Piata Romana", new PointF(450, 780)));
        myDB.insertStation(new SubwayStation("Universitate", new PointF(450, 810)));
        myDB.insertStation(new SubwayStation("Unirii", new PointF(450, 850)));
        myDB.insertStation(new SubwayStation("Tineretului", new PointF(450, 950)));
        myDB.insertStation(new SubwayStation("Eroii revolutiei", new PointF(400, 1000)));
        myDB.insertStation(new SubwayStation("Constantin Brancoveanu", new PointF(550, 1050)));
        myDB.insertStation(new SubwayStation("Piata Sudului", new PointF(550, 1100)));
        myDB.insertStation(new SubwayStation("Aparatorii Patriei", new PointF(600, 1150)));
        myDB.insertStation(new SubwayStation("Dimitrie Leonida", new PointF(650, 1200)));
        myDB.insertStation(new SubwayStation("Berceni", new PointF(700, 1250)));


        myDB.insertStation(new SubwayStation("Dristor", new PointF(600, 900)));
        myDB.insertStation(new SubwayStation("Piata Muncii", new PointF(600, 900)));
        myDB.insertStation(new SubwayStation("Piata Iancului", new PointF(600, 850)));
        myDB.insertStation(new SubwayStation("Obor", new PointF(550, 800)));
        myDB.insertStation(new SubwayStation("Stefan cel Mare", new PointF(500, 750)));
        myDB.insertStation(new SubwayStation("Piata Victoriei", new PointF(400, 750)));
        myDB.insertStation(new SubwayStation("Gara de Nord", new PointF(350, 700)));
        myDB.insertStation(new SubwayStation("Basarab", new PointF(350, 650)));
        myDB.insertStation(new SubwayStation("Crangasi", new PointF(300, 700)));
        myDB.insertStation(new SubwayStation("Petrache Poenaru", new PointF(300, 750)));
        myDB.insertStation(new SubwayStation("Grozavesti", new PointF(350, 800)));
        myDB.insertStation(new SubwayStation("Eroilor", new PointF(350, 750)));
        myDB.insertStation(new SubwayStation("Izvor", new PointF(400, 800)));
        myDB.insertStation(new SubwayStation("Unirii", new PointF(450, 850)));
        myDB.insertStation(new SubwayStation("Timpuri Noi", new PointF(500, 950)));
        myDB.insertStation(new SubwayStation("Mihai Bravu", new PointF(550, 950)));
        myDB.insertStation(new SubwayStation("Dristor", new PointF(600, 900)));
        myDB.insertStation(new SubwayStation("Nicolae Grigorescu", new PointF(700, 950)));
        myDB.insertStation(new SubwayStation("Titan", new PointF(750, 900)));
        myDB.insertStation(new SubwayStation("Costin Georgian", new PointF(750, 850)));
        myDB.insertStation(new SubwayStation("Republica", new PointF(750, 800)));
        myDB.insertStation(new SubwayStation("Pantelimon", new PointF(800, 750)));



    }



}
