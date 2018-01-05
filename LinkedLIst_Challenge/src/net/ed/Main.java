package net.ed;

// Create a program that implements a playlist for songs
// Create a Song class having Title and Duration for a song.
// The program will have an Album class containing a list of songs.
// The albums will be stored in an ArrayList
// Songs from different albums can be added to the playlist and will appear in the list in the order
// they are added.
// Once the songs have been added to the playlist, create a menu of options to:-
// Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
// List the songs in the playlist
// A song must exist in an album before it can be added to the playlist (so you can only play songs that
// you own).
// Hint:  To replay a song, consider what happened when we went back and forth from a city before we
// started tracking the direction we were going.
// As an optional extra, provide an option to remove the current song from the playlist
// (hint: listiterator.remove()


import java.util.ArrayList;
import java.util.LinkedList;


public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {

        Album album = new Album("Purple Rain", "Prince and the Revolution");

        album.addSong("Lets Go Crazy", 4.39);
        album.addSong("Take Me with U", 3.54);
        album.addSong("The Beautiful Ones", 5.13);
        album.addSong("Computer Blue", 3.59);
        album.addSong("Darling Nikki", 4.14);

        albums.add(album);

        album = new Album("Abbey Road", "The Beatles");
        album.addSong("Mean Mr. Mustard", 1.06);
        album.addSong("Polyethelene Pam", 1.12);
        album.addSong("She Came In Through The Bathroom Window", 1.57);
        album.addSong("Her Majesty", 0.23);

        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("Lets Go Crazy", playList);

        play(playList);

    }

    private static void play(LinkedList<Song> playList) {
        System.out.println("They're playing our song");
    }

}
