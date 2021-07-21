package com.example.android.musicalapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ArtistAdapter extends ArrayAdapter<Artist> {

    public ArtistAdapter(Activity context, ArrayList<Artist> artistsList){
        super(context, 0, artistsList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_artist, parent, false);
        }

        // Get the {@link Wird} object located at this position in the list
        Artist currentArtist = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView artistNameTextView = (TextView) listItemView.findViewById(R.id.artist_name);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        artistNameTextView.setText(currentArtist.getArtistName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView artistGenreTextView = (TextView) listItemView.findViewById(R.id.genre);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        artistGenreTextView.setText(currentArtist.getArtistGenre().toString().substring(0, 1) +
                currentArtist.getArtistGenre().toString().substring(1).toLowerCase());

        return listItemView;
    }
}
