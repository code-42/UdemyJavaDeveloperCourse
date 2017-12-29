package net.ed;

// The program will have an Album class containing a list of songs.

import java.util.ArrayList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    // Constructor but not all fields - leave out the songs ArrayList
    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        // Initialize ArrayList even though its not a parameter to the constructor
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration){
        // Make sure no duplicate songs
        try {
//            if (findSong(title) == null) {
                this.songs.add(new Song(title, duration));
                return true;
//            }
        }
        catch (NullPointerException e){
            System.out.println("31. Cant add " + title + " " + e);
        }
        return false;
    }

    private Song findSong(String title){
        // Make sure no duplicate songs
        for(Song checkedSong: this.songs){
            if(checkedSong.getTitle().equals(title)){
                return checkedSong;
            }
        }
        return null;
    }
}
