package com.example.jevon.weatherapp;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Jevon on 4/27/18.
 */

public class ResultsFragment extends Fragment {

    ImageView placeImg;
    TextView placeText;
    ImageView weatherImg;
    TextView degreeText;
    TextView weatherConditionText;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.results_layout, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        placeImg = view.findViewById(R.id.place_img);
        placeText = view.findViewById(R.id.place_name);
        weatherImg = view.findViewById(R.id.weather_img);
        degreeText = view.findViewById(R.id.degree_text);
        weatherConditionText = view.findViewById(R.id.weather_condition_text);

    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}
