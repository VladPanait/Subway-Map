package com.example.vladut.subwayapp;


import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

import java.sql.Time;
import java.util.Calendar;

/**
 * Created by Vladut on 5/1/2017.
 */

public class StationViewFragment extends Fragment {

    private static String TAG = "StationView";
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View myView = inflater.inflate(R.layout.station_fragment, container, false);


        final Spinner mySpinner=(Spinner) myView.findViewById(R.id.spinner);
        final String M1 = "M1";
        final String M2 = "M2";
        final String M3 = "M3";
        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String text = mySpinner.getSelectedItem().toString();
                Log.d(TAG, "Spinner text: " + text);
                if(text.compareTo(M1) == 0){
                    timeOnM1(myView);
                    Log.d(TAG, "timeOnM1");
                }
                else if(text.compareTo(M2) == 0){
                    Log.d(TAG, "timeOnM2");
                    timeOnM2(myView);
                }
                else if(text.compareTo(M3) == 0) {
                    Log.d(TAG, "timeOnM3");
                    timeOnM3(myView);
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
                return;
            }
        });

        return myView;
    }

    public void timeOnM1(View myView)
    {
        String start = "Dristor 1 - ";
        String finish = "Republica - ";

        String printStringStart = "";
        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        int minute = Calendar.getInstance().get(Calendar.MINUTE);
        int nextTrain = 0;
        int curentTime = hour*60+minute;

        if(curentTime > 5*60 && curentTime < 6*60 + 30)
        {
            nextTrain = 5*60;
            while(nextTrain <= curentTime)
            {
                nextTrain += 9;
            }
            printStringStart += nextTrain/60;
            printStringStart += ":";
            if(nextTrain%60 < 10)
                printStringStart += "0";
            printStringStart += nextTrain%60;
        }
        if(curentTime > 6*60 + 30 && curentTime < 7*60)
        {
            nextTrain = 6*60 + 30;
            while(nextTrain <= curentTime)
            {
                nextTrain += 8;
            }
            printStringStart += nextTrain/60;
            printStringStart += ":";
            if(nextTrain%60 < 10)
                printStringStart += "0";
            printStringStart += nextTrain%60;
        }
        if(curentTime > 7*60&& curentTime < 9*60 + 40)
        {
            nextTrain = 7*60;
            while(nextTrain <= curentTime)
            {
                nextTrain += 6;
            }
            printStringStart += nextTrain/60;
            printStringStart += ":";
            if(nextTrain%60 < 10)
                printStringStart += "0";
            printStringStart += nextTrain%60;
        }

        if(curentTime > 9*60 + 40&& curentTime < 11*60)
        {
            nextTrain = 9*60 + 40;
            while(nextTrain <= curentTime)
            {
                nextTrain += 6;
            }
            printStringStart += nextTrain/60;
            printStringStart += ":";
            if(nextTrain%60 < 10)
                printStringStart += "0";
            printStringStart += nextTrain%60;
        }
        if(curentTime > 11*60 && curentTime < 13*60 + 40)
        {
            nextTrain = 11*60;
            while(nextTrain <= curentTime)
            {
                nextTrain += 10;
            }
            printStringStart += nextTrain/60;
            printStringStart += ":";
            if(nextTrain%60 < 10)
                printStringStart += "0";
            printStringStart += nextTrain%60;
        }
        if(curentTime > 13*60 + 40 && curentTime < 15*60 + 40)
        {
            nextTrain = 13*60 + 40;
            while(nextTrain <= curentTime)
            {
                nextTrain += 9;
            }
            printStringStart += nextTrain/60;
            printStringStart += ":";
            if(nextTrain%60 < 10)
                printStringStart += "0";
            printStringStart += nextTrain%60;
        }
        if(curentTime > 15*60 + 40 && curentTime < 20*60)
        {
            nextTrain = 15*60 + 40;
            while(nextTrain <= curentTime)
            {
                nextTrain += 6;
            }
            printStringStart += nextTrain/60;
            printStringStart += ":";
            if(nextTrain%60 < 10)
                printStringStart += "0";
            printStringStart += nextTrain%60;
        }
        if(curentTime > 20*60 && curentTime < 21*60 + 30)
        {
            nextTrain = 20*60;
            while(nextTrain <= curentTime)
            {
                nextTrain += 9;
            }
            printStringStart += nextTrain/60;
            printStringStart += ":";
            if(nextTrain%60 < 10)
                printStringStart += "0";
            printStringStart += nextTrain%60;
        }
        if(curentTime > 21*60 + 30 && curentTime < 22*60)
        {
            nextTrain = 21*60 + 30;
            while(nextTrain <= curentTime)
            {
                nextTrain += 10;
            }
            printStringStart += nextTrain/60;
            printStringStart += ":";
            if(nextTrain%60 < 10)
                printStringStart += "0";
            printStringStart += nextTrain%60;
        }
        if(curentTime > 22*60 && curentTime < 23*60 + 30)
        {
            nextTrain = 22*60;
            while(nextTrain <= curentTime)
            {
                nextTrain += 12;
            }
            printStringStart += nextTrain/60;
            printStringStart += ":";
            if(nextTrain%60 < 10)
                printStringStart += "0";
            printStringStart += nextTrain%60;
        }


        TextView tv = (TextView)myView.findViewById(R.id.direction_1);
        tv.setText(start + printStringStart);
        tv.setBackgroundColor(Color.BLACK);
        tv.setTextColor(Color.YELLOW);
        tv.setTextSize(50);

        TextView tv2 = (TextView)myView.findViewById(R.id.direction_2);
        tv2.setText(finish + printStringStart);
        tv2.setBackgroundColor(Color.BLACK);
        tv2.setTextColor(Color.YELLOW);
        tv2.setTextSize(50);

    }

    public void timeOnM2(View myView)
    {
        String start = "Berceni - ";
        String finish = "Pipera - ";

        String printStringStart = "";
        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        int minute = Calendar.getInstance().get(Calendar.MINUTE);
        int nextTrain = 0;
        int curentTime = hour*60+minute;

        if(curentTime > 5*60 && curentTime < 6*60)
        {
            nextTrain = 5*60;
            while(nextTrain <= curentTime)
            {
                nextTrain += 10;
            }
            printStringStart += nextTrain/60;
            printStringStart += ":";
            if(nextTrain%60 < 10)
                printStringStart += "0";
            printStringStart += nextTrain%60;
        }
        if(curentTime > 6*60 && curentTime < 6*60 + 40)
        {
            nextTrain = 6*60;
            while(nextTrain <= curentTime)
            {
                nextTrain += 7;
            }
            printStringStart += nextTrain/60;
            printStringStart += ":";
            if(nextTrain%60 < 10)
                printStringStart += "0";
            printStringStart += nextTrain%60;
        }
        if(curentTime > 6*60 + 40 && curentTime < 9*60 + 20)
        {
            nextTrain = 6*60 + 40;
            while(nextTrain <= curentTime)
            {
                nextTrain += 3;
            }
            printStringStart += nextTrain/60;
            printStringStart += ":";
            if(nextTrain%60 < 10)
                printStringStart += "0";
            printStringStart += nextTrain%60;
        }

        if(curentTime > 9*60 + 20&& curentTime < 10*60 + 30)
        {
            nextTrain = 9*60 + 20;
            while(nextTrain <= curentTime)
            {
                nextTrain += 5;
            }
            printStringStart += nextTrain/60;
            printStringStart += ":";
            if(nextTrain%60 < 10)
                printStringStart += "0";
            printStringStart += nextTrain%60;
        }
        if(curentTime > 10*60 + 30 && curentTime < 13*60)
        {
            nextTrain = 10*60 + 30;
            while(nextTrain <= curentTime)
            {
                nextTrain += 8;
            }
            printStringStart += nextTrain/60;
            printStringStart += ":";
            if(nextTrain%60 < 10)
                printStringStart += "0";
            printStringStart += nextTrain%60;
        }
        if(curentTime > 13*60 && curentTime < 14*60 + 45)
        {
            nextTrain = 13*60;
            while(nextTrain <= curentTime)
            {
                nextTrain += 6;
            }
            printStringStart += nextTrain/60;
            printStringStart += ":";
            if(nextTrain%60 < 10)
                printStringStart += "0";
            printStringStart += nextTrain%60;
        }
        if(curentTime > 14*60 + 45 && curentTime < 15*60 + 30)
        {
            nextTrain = 14*60 + 45;
            while(nextTrain <= curentTime)
            {
                nextTrain += 4;
            }
            printStringStart += nextTrain/60;
            printStringStart += ":";
            if(nextTrain%60 < 10)
                printStringStart += "0";
            printStringStart += nextTrain%60;
        }
        if(curentTime > 15*60 + 30 && curentTime < 19*60)
        {
            nextTrain = 15*60 + 30;
            while(nextTrain <= curentTime)
            {
                nextTrain += 3;
            }
            printStringStart += nextTrain/60;
            printStringStart += ":";
            if(nextTrain%60 < 10)
                printStringStart += "0";
            printStringStart += nextTrain%60;
        }
        if(curentTime > 19*60&& curentTime < 20*60)
        {
            nextTrain = 19*60;
            while(nextTrain <= curentTime)
            {
                nextTrain += 4;
            }
            printStringStart += nextTrain/60;
            printStringStart += ":";
            if(nextTrain%60 < 10)
                printStringStart += "0";
            printStringStart += nextTrain%60;
        }
        if(curentTime > 20*60 && curentTime < 21*60)
        {
            nextTrain = 20*60;
            while(nextTrain <= curentTime)
            {
                nextTrain += 6;
            }
            printStringStart += nextTrain/60;
            printStringStart += ":";
            if(nextTrain%60 < 10)
                printStringStart += "0";
            printStringStart += nextTrain%60;
        }
        if(curentTime > 21*60 && curentTime < 21*60 + 30)
        {
            nextTrain = 21*60;
            while(nextTrain <= curentTime)
            {
                nextTrain += 8;
            }
            printStringStart += nextTrain/60;
            printStringStart += ":";
            if(nextTrain%60 < 10)
                printStringStart += "0";
            printStringStart += nextTrain%60;
        }
        if(curentTime > 21*60 +30 && curentTime < 22*60)
        {
            nextTrain = 21*60 + 30;
            while(nextTrain <= curentTime)
            {
                nextTrain += 10;
            }
            printStringStart += nextTrain/60;
            printStringStart += ":";
            if(nextTrain%60 < 10)
                printStringStart += "0";
            printStringStart += nextTrain%60;
        }
        if(curentTime > 22*60 && curentTime < 23*60 + 30)
        {
            nextTrain = 22*60;
            while(nextTrain <= curentTime)
            {
                nextTrain += 11;
            }
            printStringStart += nextTrain/60;
            printStringStart += ":";
            if(nextTrain%60 < 10)
                printStringStart += "0";
            printStringStart += nextTrain%60;
        }


        TextView tv = (TextView)myView.findViewById(R.id.direction_1);
        tv.setText(start + printStringStart);
        tv.setBackgroundColor(Color.BLACK);
        tv.setTextColor(Color.BLUE);
        tv.setTextSize(50);

        TextView tv2 = (TextView)myView.findViewById(R.id.direction_2);
        tv2.setText(finish + printStringStart);
        tv2.setBackgroundColor(Color.BLACK);
        tv2.setTextColor(Color.BLUE);
        tv2.setTextSize(50);

    }

    public void timeOnM3(View myView)
    {
        String start = "Preciziei - ";
        String finish = "Anghel Saligny - ";

        String printStringStart = "";
        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        int minute = Calendar.getInstance().get(Calendar.MINUTE);
        int nextTrain = 0;
        int curentTime = hour*60+minute;

        if(curentTime > 5*60 && curentTime < 6*60 + 30)
        {
            nextTrain = 5*60;
            while(nextTrain <= curentTime)
            {
                nextTrain += 9;
            }
            printStringStart += nextTrain/60;
            printStringStart += ":";
            if(nextTrain%60 < 10)
                printStringStart += "0";
            printStringStart += nextTrain%60;
        }
        if(curentTime > 6*60 + 30 && curentTime < 7*60)
        {
            nextTrain = 6*60 + 30;
            while(nextTrain <= curentTime)
            {
                nextTrain += 8;
            }
            printStringStart += nextTrain/60;
            printStringStart += ":";
            if(nextTrain%60 < 10)
                printStringStart += "0";
            printStringStart += nextTrain%60;
        }
        if(curentTime > 7*60&& curentTime < 9*60 + 40)
        {
            nextTrain = 7*60;
            while(nextTrain <= curentTime)
            {
                nextTrain += 6;
            }
            printStringStart += nextTrain/60;
            printStringStart += ":";
            if(nextTrain%60 < 10)
                printStringStart += "0";
            printStringStart += nextTrain%60;
        }

        if(curentTime > 9*60 + 40&& curentTime < 11*60)
        {
            nextTrain = 9*60 + 40;
            while(nextTrain <= curentTime)
            {
                nextTrain += 6;
            }
            printStringStart += nextTrain/60;
            printStringStart += ":";
            if(nextTrain%60 < 10)
                printStringStart += "0";
            printStringStart += nextTrain%60;
        }
        if(curentTime > 11*60 && curentTime < 13*60 + 40)
        {
            nextTrain = 11*60;
            while(nextTrain <= curentTime)
            {
                nextTrain += 10;
            }
            printStringStart += nextTrain/60;
            printStringStart += ":";
            if(nextTrain%60 < 10)
                printStringStart += "0";
            printStringStart += nextTrain%60;
        }
        if(curentTime > 13*60 + 40 && curentTime < 15*60 + 40)
        {
            nextTrain = 13*60 + 40;
            while(nextTrain <= curentTime)
            {
                nextTrain += 9;
            }
            printStringStart += nextTrain/60;
            printStringStart += ":";
            if(nextTrain%60 < 10)
                printStringStart += "0";
            printStringStart += nextTrain%60;
        }
        if(curentTime > 15*60 + 40 && curentTime < 20*60)
        {
            nextTrain = 15*60 + 40;
            while(nextTrain <= curentTime)
            {
                nextTrain += 6;
            }
            printStringStart += nextTrain/60;
            printStringStart += ":";
            if(nextTrain%60 < 10)
                printStringStart += "0";
            printStringStart += nextTrain%60;
        }
        if(curentTime > 20*60 && curentTime < 21*60 + 30)
        {
            nextTrain = 20*60;
            while(nextTrain <= curentTime)
            {
                nextTrain += 9;
            }
            printStringStart += nextTrain/60;
            printStringStart += ":";
            if(nextTrain%60 < 10)
                printStringStart += "0";
            printStringStart += nextTrain%60;
        }
        if(curentTime > 21*60 + 30 && curentTime < 22*60)
        {
            nextTrain = 21*60 + 30;
            while(nextTrain <= curentTime)
            {
                nextTrain += 10;
            }
            printStringStart += nextTrain/60;
            printStringStart += ":";
            if(nextTrain%60 < 10)
                printStringStart += "0";
            printStringStart += nextTrain%60;
        }
        if(curentTime > 22*60 && curentTime < 23*60 + 30)
        {
            nextTrain = 22*60;
            while(nextTrain <= curentTime)
            {
                nextTrain += 12;
            }
            printStringStart += nextTrain/60;
            printStringStart += ":";
            if(nextTrain%60 < 10)
                printStringStart += "0";
            printStringStart += nextTrain%60;
        }


        TextView tv = (TextView)myView.findViewById(R.id.direction_1);
        tv.setText(start + printStringStart);
        tv.setBackgroundColor(Color.BLACK);
        tv.setTextColor(Color.RED);
        tv.setTextSize(50);

        TextView tv2 = (TextView)myView.findViewById(R.id.direction_2);
        tv2.setText(finish + printStringStart);
        tv2.setBackgroundColor(Color.BLACK);
        tv2.setTextColor(Color.RED);
        tv2.setTextSize(50);

    }
}
