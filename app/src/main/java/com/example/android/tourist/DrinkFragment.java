package com.example.android.tourist;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class DrinkFragment extends Fragment {


    public DrinkFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        final ArrayList<Attraction> attractions = new ArrayList<>();

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

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions);

        ListView listView = rootView.findViewById(R.id.listViewFragment);

        listView.setAdapter(adapter);


        return rootView;
    }
}
