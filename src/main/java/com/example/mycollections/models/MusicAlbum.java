package com.example.mycollections.models;

public class MusicAlbum extends LibraryItem {

    private String artist;
    private int tracks;

    public MusicAlbum (String name, String artist, int year, int tracks) {
        super(name, year);
        this.artist = artist;
        this.tracks = tracks;
    }
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getTracks() {
        return tracks;
    }

    public void setTracks(int tracks) {
        this.tracks = tracks;
    }

    @Override
    public String toString() {
        return name + " by " + artist;
    }
}
