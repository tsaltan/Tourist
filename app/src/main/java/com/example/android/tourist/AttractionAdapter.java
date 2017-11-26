package com.example.android.tourist;

import android.content.Context;
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

public class AttractionAdapter extends ArrayAdapter<Attraction>{


    public AttractionAdapter(Context context, ArrayList<Attraction> attractions){
        super(context, 0, attractions);

    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View itemView = convertView;

        if(itemView == null) {
            itemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        //Get the current attraction. ? how does this work @tilbe
        Attraction currentAttraction =  getItem(position);

        TextView attractionName = itemView.findViewById(R.id.attractionName);
        attractionName.setText(currentAttraction.getmName());
        TextView attractionScore = itemView.findViewById(R.id.scoreText);
        attractionScore.setText(currentAttraction.getmRating());
        TextView attractionInfo = itemView.findViewById(R.id.attractionInfoText);
        attractionInfo.setText(currentAttraction.getmInfo());
        TextView distanceText = itemView.findViewById(R.id.attractionDistanceText);
        distanceText.setText(currentAttraction.getmDistance());

        ImageView attractionImage = itemView.findViewById(R.id.listImageView);
        attractionImage.setImageResource(currentAttraction.getmImageId());


        return itemView;

    }
}
