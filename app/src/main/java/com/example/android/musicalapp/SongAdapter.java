package com.example.android.musicalapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {
    public SongAdapter(Activity context, ArrayList<Song> songList){
        super(context, 0, songList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_song, parent, false);
        }

        // Get the {@link Wird} object located at this position in the list
        Song currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView songNameTextView = (TextView) listItemView.findViewById(R.id.song_name);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        songNameTextView.setText(currentSong.getSongName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView songGenreTextView = (TextView) listItemView.findViewById(R.id.genre);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        songGenreTextView.setText(currentSong.getArtist().getArtistGenre().toString().substring(0, 1) +
                    currentSong.getArtist().getArtistGenre().toString().substring(1).toLowerCase() +
                    " \u25CF " + currentSong.getArtist().getArtistName());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
