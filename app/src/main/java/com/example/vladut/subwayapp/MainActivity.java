package com.example.vladut.subwayapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    DBHelper myDB;

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
        setContentView(R.layout.activity_main);
        myDB = new DBHelper(this);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


    }

}
