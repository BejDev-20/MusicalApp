package com.example.android.musicalapp;

import java.time.Duration;

public class Song {

    private String songName;
    private Album album;
    private Duration songLength;
    private Artist artist;

    public Song(String songName, Album album, Duration songLength, Artist artist) {
        this.songName = songName;
        this.album = album;
        this.songLength = songLength;
        this.artist = artist;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Duration getSongLength() {
        return songLength;
    }

    public void setSongLength(Duration songLength) {
        this.songLength = songLength;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }
}
