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
        myDB.insertStation(new SubwayStation("Preciziei", new PointF(80, 600)));
        Log.d(TAG,"first insert");

        myDB.insertStation(new SubwayStation("Pacii", new PointF(130, 550)));
        Log.d(TAG,"second insert");
        myDB.insertStation(new SubwayStation("Gorjului", new PointF(180, 550)));
        myDB.insertStation(new SubwayStation("Lujerului", new PointF(240, 550)));
        myDB.insertStation(new SubwayStation("Politehnica", new PointF(310, 550)));
        myDB.insertStation(new SubwayStation("Eroilor", new PointF(390, 550)));
        myDB.insertStation(new SubwayStation("Izvor", new PointF(460, 600)));
        myDB.insertStation(new SubwayStation("Unirii", new PointF(550, 670)));
        myDB.insertStation(new SubwayStation("Timpuri Noi", new PointF(640, 800)));
        myDB.insertStation(new SubwayStation("Mihai Bravu", new PointF(690, 790)));
        myDB.insertStation(new SubwayStation("Dristor", new PointF(780, 710)));
        myDB.insertStation(new SubwayStation("Nicolae Grigorescu", new PointF(860, 770)));
        myDB.insertStation(new SubwayStation("1 decembrie", new PointF(920, 770)));
        myDB.insertStation(new SubwayStation("Nicolae Teclu", new PointF(980, 770)));
        myDB.insertStation(new SubwayStation("Anghel Saligny", new PointF(1030, 770)));


        myDB.insertStation(new SubwayStation("Pipera", new PointF(610, 200)));
        myDB.insertStation(new SubwayStation("Aurel Vlaicu", new PointF(520, 300)));
        myDB.insertStation(new SubwayStation("Aviatorilor", new PointF(470, 380)));
        myDB.insertStation(new SubwayStation("Piata Victoriei", new PointF(470, 450)));
        myDB.insertStation(new SubwayStation("Piata Romana", new PointF(530, 540)));
        myDB.insertStation(new SubwayStation("Universitate", new PointF(550, 590)));
        myDB.insertStation(new SubwayStation("Unirii", new PointF(550, 670)));
        myDB.insertStation(new SubwayStation("Tineretului", new PointF(550, 780)));
        myDB.insertStation(new SubwayStation("Eroii revolutiei", new PointF(500, 850)));
        myDB.insertStation(new SubwayStation("Constantin Brancoveanu", new PointF(590, 980)));
        myDB.insertStation(new SubwayStation("Piata Sudului", new PointF(680, 1050)));
        myDB.insertStation(new SubwayStation("Aparatorii Patriei", new PointF(730, 1100)));
        myDB.insertStation(new SubwayStation("Dimitrie Leonida", new PointF(780, 1150)));
        myDB.insertStation(new SubwayStation("Berceni", new PointF(830, 1190)));


        myDB.insertStation(new SubwayStation("Dristor", new PointF(780, 710)));
        myDB.insertStation(new SubwayStation("Piata Muncii", new PointF(780, 600)));
        myDB.insertStation(new SubwayStation("Piata Iancului", new PointF(780, 540)));
        myDB.insertStation(new SubwayStation("Obor", new PointF(720, 490)));
        myDB.insertStation(new SubwayStation("Stefan cel Mare", new PointF(630, 450)));
        myDB.insertStation(new SubwayStation("Piata Victoriei", new PointF(470, 450)));
        myDB.insertStation(new SubwayStation("Gara de Nord", new PointF(360, 420)));
        myDB.insertStation(new SubwayStation("Basarab", new PointF(350, 370)));
        myDB.insertStation(new SubwayStation("Crangasi", new PointF(300, 400)));
        myDB.insertStation(new SubwayStation("Petrache Poenaru", new PointF(280, 440)));
        myDB.insertStation(new SubwayStation("Grozavesti", new PointF(330, 490)));
        myDB.insertStation(new SubwayStation("Eroilor", new PointF(390, 550)));
        myDB.insertStation(new SubwayStation("Izvor", new PointF(460, 600)));
        myDB.insertStation(new SubwayStation("Unirii", new PointF(550, 670)));
        myDB.insertStation(new SubwayStation("Timpuri Noi", new PointF(640, 800)));
        myDB.insertStation(new SubwayStation("Mihai Bravu", new PointF(690, 790)));
        myDB.insertStation(new SubwayStation("Dristor", new PointF(780, 710)));
        myDB.insertStation(new SubwayStation("Nicolae Grigorescu", new PointF(860, 770)));
        myDB.insertStation(new SubwayStation("Titan", new PointF(880, 690)));
        myDB.insertStation(new SubwayStation("Costin Georgian", new PointF(880, 610)));
        myDB.insertStation(new SubwayStation("Republica", new PointF(910, 540)));
        myDB.insertStation(new SubwayStation("Pantelimon", new PointF(960, 490)));



    }



}
