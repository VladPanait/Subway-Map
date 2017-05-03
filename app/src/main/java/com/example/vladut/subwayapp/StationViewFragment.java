package com.example.vladut.subwayapp;


import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.sql.Time;

/**
 * Created by Vladut on 5/1/2017.
 */

public class StationViewFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.station_fragment, container, false);

        TextView tv = (TextView)myView.findViewById(R.id.direction_1);
        tv.setText("Preciziei - 5.00");
        tv.setBackgroundColor(Color.BLACK);
        tv.setTextColor(Color.YELLOW);
        tv.setTextSize(50);


        return myView;
    }
}
