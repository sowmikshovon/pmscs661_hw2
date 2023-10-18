package com.example.hw2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickSearchTeam (View view) {
        SportsExpert expert = new SportsExpert();
        TextView brands = findViewById(R.id.sportsList);
        Spinner sports = findViewById(R.id.Spinner);
        String sportsType = String.valueOf(sports.getSelectedItem());
        ArrayList<String> sportsList = expert.getBrands(sportsType);
        StringBuilder brandsFormatted = new StringBuilder();
        for (String brand : sportsList) {
            brandsFormatted.append(brand).append('\n');
        }
        brands.setText(brandsFormatted);
    }
}