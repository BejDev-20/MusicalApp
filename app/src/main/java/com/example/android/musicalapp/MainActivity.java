package com.example.android.musicalapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.time.Duration;
import java.util.ArrayList;

import static com.example.android.musicalapp.SongListActivity.songs;

public class MainActivity extends AppCompatActivity {

    public static ArrayList<Artist> artists = new ArrayList<>();
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);


        Artist imagineDragons = new Artist("Imagine Dragons", 2008, Genre.POP);
        Artist ic3pick = new Artist("IC3PICK", 2008, Genre.ELECTRO);
        Artist lukeBryan = new Artist("Luke Bryan", 2006, Genre.COUNTRY);
        Artist fingerEleven = new Artist("Finger Eleven", 1990, Genre.ROCK);

        Album evolveImagineDragons = new Album("Evolve", 2017);
        Album fairytaleIC3PICK = new Album("Fairytale", 2018);
        Album killTheLightsLukeBryan = new Album("Kill the Lights", 2015);
        Album themYouMeFingerEleven = new Album("Them vs. You vs. Me", 2009);

        Song thunder = new Song("Thunder", evolveImagineDragons, Duration.ofSeconds(187),
                                imagineDragons);
        Song believer = new Song("Believer", evolveImagineDragons, Duration.ofSeconds(204),
                                imagineDragons);
        Song deathNoMore = new Song("Death no more", fairytaleIC3PICK, Duration.ofSeconds(187),
                ic3pick);
        Song makeYouCry = new Song("Make you cry", fairytaleIC3PICK, Duration.ofSeconds(167),
                ic3pick);
        Song kickTheDustUp = new Song("Kick the Dust Up", killTheLightsLukeBryan,
                Duration.ofSeconds(190), lukeBryan);
        Song stripItDown = new Song("Strip It Down", killTheLightsLukeBryan,
                Duration.ofSeconds(241), lukeBryan);
        Song paralyzer = new Song("Paralyzer", themYouMeFingerEleven, Duration.ofSeconds(208),
                fingerEleven);
        Song fallingOn = new Song("Falling On", themYouMeFingerEleven, Duration.ofSeconds(187),
                fingerEleven);

        evolveImagineDragons.addSong(thunder);
        evolveImagineDragons.addSong(believer);
        fairytaleIC3PICK.addSong(deathNoMore);
        fairytaleIC3PICK.addSong(makeYouCry);
        killTheLightsLukeBryan.addSong(kickTheDustUp);
        killTheLightsLukeBryan.addSong(stripItDown);
        themYouMeFingerEleven.addSong(paralyzer);
        themYouMeFingerEleven.addSong(fallingOn);

        imagineDragons.addAlbum(evolveImagineDragons);
        ic3pick.addAlbum(fairytaleIC3PICK);
        lukeBryan.addAlbum(killTheLightsLukeBryan);
        fingerEleven.addAlbum(themYouMeFingerEleven);

        artists.add(imagineDragons);
        artists.add(ic3pick);
        artists.add(lukeBryan);
        artists.add(fingerEleven);

        ArtistAdapter adapter = new ArtistAdapter(this, artists);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                songs = adapter.getItem(position).getAlbums().get(0).getAlbumSongs();
                Intent songListIntent = new Intent(MainActivity.this, SongListActivity.class);
                startActivity(songListIntent);
            }
        });
    }
}