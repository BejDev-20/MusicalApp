package com.example.android.musicalapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class PlayerActivity extends AppCompatActivity {
    public static Song song;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player);
        if (song != null){
            TextView songName = (TextView) findViewById(R.id.song_name);
            songName.setText(song.getSongName());
            TextView song_genre = (TextView) findViewById(R.id.song_genre_artist);
            song_genre.setText(song.getArtist().getArtistGenre().toString().substring(0, 1) +
                    song.getArtist().getArtistGenre().toString().substring(1).toLowerCase() +
                    " \u25CF " + song.getArtist().getArtistName());        }
    }
}
