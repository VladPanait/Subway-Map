package com.example.vladut.subwayapp;

import android.graphics.PointF;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

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
                    return true;
                case R.id.navigation_dashboard:
                    HideMapViewFragment();
                    return true;
                case R.id.navigation_notifications:
                    HideMapViewFragment();
                    return true;
            }
            return false;
        }

    };

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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"OnCreate");
        setContentView(R.layout.activity_main);
        myDB = new DBHelper(this);
        Log.d(TAG,"new DBHelper");

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        myDB.clearStationTable();
        myDB.insertStation(new SubwayStation("first", new PointF(100, 100), 1));
        Log.d(TAG,"first insert");

        myDB.insertStation(new SubwayStation("second", new PointF(200, 200), 2));
//        Log.d(TAG,"second insert");

    }



}
