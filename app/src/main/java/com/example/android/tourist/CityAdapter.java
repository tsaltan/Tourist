package com.example.android.tourist;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by alicantipi on 26.11.17.
 */

public class CityAdapter extends ArrayAdapter<City> {
    public CityAdapter(Activity context, ArrayList<City> cities) {
        super(context, 0, cities);

    }


    // nullable nedir ?
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        /*
        check if the view is empty, use if it is
         */
        View cityItemView = convertView;
        if(cityItemView == null) {
            cityItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.city_item, parent, false);
        }

        //Get the current country, casted to city. something is wrong.
        City currentCity =  getItem(position);

        // setting the textview
        TextView cityName = cityItemView.findViewById(R.id.cityName);
        cityName.setText(currentCity.getName());
        cityName.getBackground().setAlpha(650); // alpha for readability of the text

        // setting the imageView
        ImageView cityImage = cityItemView.findViewById(R.id.cityImage);
        cityImage.setImageResource(currentCity.getImageId());

        //return the view
        return cityItemView;
    }
}
