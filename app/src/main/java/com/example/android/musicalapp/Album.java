package com.example.android.musicalapp;

import java.util.ArrayList;

public class Album {

    private String albumName;
    private int albumYear;
    private ArrayList<Song> albumSongs;

    public Album(String albumName, int albumYear) {
        this.albumName = albumName;
        this.albumYear = albumYear;
        this.albumSongs = new ArrayList<>();

    }

    public void addSong(Song song){
        this.albumSongs.add(song);
    }

    public ArrayList<Song> getAlbumSongs(){
        return this.albumSongs;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public int getAlbumYear() {
        return albumYear;
    }

    public void setAlbumYear(int albumYear) {
        this.albumYear = albumYear;
    }
}
