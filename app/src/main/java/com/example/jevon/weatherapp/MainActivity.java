package com.example.jevon.weatherapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.SearchView;

import com.google.android.gms.location.places.ui.PlaceAutocompleteFragment;

public class MainActivity extends AppCompatActivity {

   PlaceAutocompleteFragment autocompleteFragment;
    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        autocompleteFragment = (PlaceAutocompleteFragment) getFragmentManager().findFragmentById(R.id.place_autocomplete_fragment);
        frameLayout = findViewById(R.id.fragment_container);
    }

    private void setAutoCompleteListener() {
        
    }
}
