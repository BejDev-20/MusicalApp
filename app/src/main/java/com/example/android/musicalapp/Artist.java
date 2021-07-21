package com.example.android.musicalapp;

import java.util.ArrayList;

public class Artist {

    private String artistName;
    private int yearCreated;
    private Genre artistGenre;
    private ArrayList<Album> albums;

    public Artist(String artistName, int yearCreated, Genre artistGenre) {
        this.artistName = artistName;
        this.yearCreated = yearCreated;
        this.artistGenre = artistGenre;
        this.albums = new ArrayList<>();
    }

    public void addAlbum(Album album){
        this.albums.add(album);
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public int getYearCreated() {
        return yearCreated;
    }

    public void setYearCreated(int yearCreated) {
        this.yearCreated = yearCreated;
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(ArrayList<Album> albums) {
        this.albums = albums;
    }

    public Genre getArtistGenre() {
        return artistGenre;
    }

    public void setArtistGenre(Genre artistGenre) {
        this.artistGenre = artistGenre;
    }
}
