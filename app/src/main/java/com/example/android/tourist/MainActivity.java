package com.example.android.tourist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<City> countryList = new ArrayList<City>();

        countryList.add(new City(getString(R.string.cityOne), R.drawable.paris));
        countryList.add(new City(getString(R.string.cityTwo), R.drawable.berlin));
        countryList.add(new City(getString(R.string.cityThree), R.drawable.barcelona));
        countryList.add(new City(getString(R.string.cityFour), R.drawable.prague));
        countryList.add(new City(getString(R.string.cityFive), R.drawable.lisbon));
        countryList.add(new City(getString(R.string.citySix), R.drawable.london));
        countryList.add(new City(getString(R.string.citySeven), R.drawable.rome));
        countryList.add(new City(getString(R.string.cityEight), R.drawable.amsterdam));



        final CityAdapter arrayAdapter = new CityAdapter(this, countryList);

        GridView citysGridyView = findViewById(R.id.cityGridView);

        citysGridyView.setAdapter(arrayAdapter);

    }
}