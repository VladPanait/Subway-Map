package com.example.vladut.subwayapp;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

    /**
     * Created by Vladut on 5/1/2017.
     */

    public class MapViewFragment extends Fragment {

        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View myView = inflater.inflate(R.layout.map_fragment, container, false);

            return myView;
        }
    }
