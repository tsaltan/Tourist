package com.example.android.tourist;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;


public class FoodFragment extends Fragment {

    public FoodFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        final ArrayList<Attraction> attractions = new ArrayList<>();


        switch (MainActivity.clickedCountry){
            case "Berlin":
                attractions.add(new Attraction("Chicago Williams","American, Barbecue", "4,8", "Hannoversche Str. 2, 10115 Berlin, Germany", R.drawable.chicagowil));
                attractions.add(new Attraction("Chicago Williams","American, Barbecue", "4,8", "Hannoversche Str. 2, 10115 Berlin, Germany", R.drawable.chicagowil));
                attractions.add(new Attraction("Chicago Williams","American, Barbecue", "4,8", "Hannoversche Str. 2, 10115 Berlin, Germany", R.drawable.chicagowil));
                attractions.add(new Attraction("Chicago Williams","American, Barbecue", "4,8", "Hannoversche Str. 2, 10115 Berlin, Germany", R.drawable.chicagowil));
                attractions.add(new Attraction("Chicago Williams","American, Barbecue", "4,8", "Hannoversche Str. 2, 10115 Berlin, Germany", R.drawable.chicagowil));
                attractions.add(new Attraction("Chicago Williams","American, Barbecue", "4,8", "Hannoversche Str. 2, 10115 Berlin, Germany", R.drawable.chicagowil));
                attractions.add(new Attraction("Chicago Williams","American, Barbecue", "4,8", "Hannoversche Str. 2, 10115 Berlin, Germany", R.drawable.chicagowil));
                attractions.add(new Attraction("Chicago Williams","American, Barbecue", "4,8", "Hannoversche Str. 2, 10115 Berlin, Germany", R.drawable.chicagowil));
                attractions.add(new Attraction("Chicago Williams","American, Barbecue", "4,8", "Hannoversche Str. 2, 10115 Berlin, Germany", R.drawable.chicagowil));
                attractions.add(new Attraction("Chicago Williams","American, Barbecue", "4,8", "Hannoversche Str. 2, 10115 Berlin, Germany", R.drawable.chicagowil));
                attractions.add(new Attraction("Chicago Williams","American, Barbecue", "4,8", "Hannoversche Str. 2, 10115 Berlin, Germany", R.drawable.chicagowil));
                attractions.add(new Attraction("Chicago Williams","American, Barbecue", "4,8", "Hannoversche Str. 2, 10115 Berlin, Germany", R.drawable.chicagowil));
                attractions.add(new Attraction("Chicago Williams","American, Barbecue", "4,8", "Hannoversche Str. 2, 10115 Berlin, Germany", R.drawable.chicagowil));
                attractions.add(new Attraction("Chicago Williams","American, Barbecue", "4,8", "Hannoversche Str. 2, 10115 Berlin, Germany", R.drawable.chicagowil));
                break;
            case "Paris":
                attractions.add(new Attraction("Paris Williams","American, Barbecue", "4,8", "Hannoversche Str. 2, 10115 Berlin, Germany", R.drawable.chicagowil));
                attractions.add(new Attraction("Paris Williams","American, Barbecue", "4,8", "Hannoversche Str. 2, 10115 Berlin, Germany", R.drawable.chicagowil));
                attractions.add(new Attraction("Paris Williams","American, Barbecue", "4,8", "Hannoversche Str. 2, 10115 Berlin, Germany", R.drawable.chicagowil));
                attractions.add(new Attraction("Paris Williams","American, Barbecue", "4,8", "Hannoversche Str. 2, 10115 Berlin, Germany", R.drawable.chicagowil));
                attractions.add(new Attraction("Paris Williams","American, Barbecue", "4,8", "Hannoversche Str. 2, 10115 Berlin, Germany", R.drawable.chicagowil));
                attractions.add(new Attraction("Paris Williams","American, Barbecue", "4,8", "Hannoversche Str. 2, 10115 Berlin, Germany", R.drawable.chicagowil));
                attractions.add(new Attraction("Paris Williams","American, Barbecue", "4,8", "Hannoversche Str. 2, 10115 Berlin, Germany", R.drawable.chicagowil));
                attractions.add(new Attraction("Paris Williams","American, Barbecue", "4,8", "Hannoversche Str. 2, 10115 Berlin, Germany", R.drawable.chicagowil));
                attractions.add(new Attraction("Paris Williams","American, Barbecue", "4,8", "Hannoversche Str. 2, 10115 Berlin, Germany", R.drawable.chicagowil));
                attractions.add(new Attraction("Paris Williams","American, Barbecue", "4,8", "Hannoversche Str. 2, 10115 Berlin, Germany", R.drawable.chicagowil));
                attractions.add(new Attraction("Paris Williams","American, Barbecue", "4,8", "Hannoversche Str. 2, 10115 Berlin, Germany", R.drawable.chicagowil));
                attractions.add(new Attraction("Paris Williams","American, Barbecue", "4,8", "Hannoversche Str. 2, 10115 Berlin, Germany", R.drawable.chicagowil));
                break;
            case "Prague":
                attractions.add(new Attraction("prague Williams","American, Barbecue", "4,8", "Hannoversche Str. 2, 10115 Berlin, Germany", R.drawable.chicagowil));
                attractions.add(new Attraction("prague Williams","American, Barbecue", "4,8", "Hannoversche Str. 2, 10115 Berlin, Germany", R.drawable.chicagowil));
                attractions.add(new Attraction("prague Williams","American, Barbecue", "4,8", "Hannoversche Str. 2, 10115 Berlin, Germany", R.drawable.chicagowil));
                attractions.add(new Attraction("prague Williams","American, Barbecue", "4,8", "Hannoversche Str. 2, 10115 Berlin, Germany", R.drawable.chicagowil));
                attractions.add(new Attraction("prague Williams","American, Barbecue", "4,8", "Hannoversche Str. 2, 10115 Berlin, Germany", R.drawable.chicagowil));
                attractions.add(new Attraction("prague Williams","American, Barbecue", "4,8", "Hannoversche Str. 2, 10115 Berlin, Germany", R.drawable.chicagowil));
                attractions.add(new Attraction("prague Williams","American, Barbecue", "4,8", "Hannoversche Str. 2, 10115 Berlin, Germany", R.drawable.chicagowil));
                attractions.add(new Attraction("prague Williams","American, Barbecue", "4,8", "Hannoversche Str. 2, 10115 Berlin, Germany", R.drawable.chicagowil));
                attractions.add(new Attraction("prague Williams","American, Barbecue", "4,8", "Hannoversche Str. 2, 10115 Berlin, Germany", R.drawable.chicagowil));
              break;
            case "Barcelona":
                attractions.add(new Attraction("barcelona Williams","American, Barbecue", "4,8", "Hannoversche Str. 2, 10115 Berlin, Germany", R.drawable.chicagowil));
                attractions.add(new Attraction("barcelona Williams","American, Barbecue", "4,8", "Hannoversche Str. 2, 10115 Berlin, Germany", R.drawable.chicagowil));
                attractions.add(new Attraction("barcelona Williams","American, Barbecue", "4,8", "Hannoversche Str. 2, 10115 Berlin, Germany", R.drawable.chicagowil));
                attractions.add(new Attraction("barcelona Williams","American, Barbecue", "4,8", "Hannoversche Str. 2, 10115 Berlin, Germany", R.drawable.chicagowil));
                attractions.add(new Attraction("barcelona Williams","American, Barbecue", "4,8", "Hannoversche Str. 2, 10115 Berlin, Germany", R.drawable.chicagowil));
                attractions.add(new Attraction("barcelona Williams","American, Barbecue", "4,8", "Hannoversche Str. 2, 10115 Berlin, Germany", R.drawable.chicagowil));
                attractions.add(new Attraction("barcelona Williams","American, Barbecue", "4,8", "Hannoversche Str. 2, 10115 Berlin, Germany", R.drawable.chicagowil));
                attractions.add(new Attraction("barcelona Williams","American, Barbecue", "4,8", "Hannoversche Str. 2, 10115 Berlin, Germany", R.drawable.chicagowil));
                attractions.add(new Attraction("barcelona Williams","American, Barbecue", "4,8", "Hannoversche Str. 2, 10115 Berlin, Germany", R.drawable.chicagowil));
                attractions.add(new Attraction("barcelona Williams","American, Barbecue", "4,8", "Hannoversche Str. 2, 10115 Berlin, Germany", R.drawable.chicagowil));
                attractions.add(new Attraction("barcelona Williams","American, Barbecue", "4,8", "Hannoversche Str. 2, 10115 Berlin, Germany", R.drawable.chicagowil));
                attractions.add(new Attraction("barcelona Williams","American, Barbecue", "4,8", "Hannoversche Str. 2, 10115 Berlin, Germany", R.drawable.chicagowil));
                break;
        }

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions);

        ListView listView = rootView.findViewById(R.id.listViewFragment);

        listView.setAdapter(adapter);


        return rootView;
    }
}
