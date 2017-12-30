package net.ed;

import java.util.ArrayList;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class AlbumTest {

    private static ArrayList<Album> albums = new ArrayList<Album>();
    private static Album album = new Album("Purple Rain", "Prince and the Revolution");
    private static LinkedList<Song> playList = new LinkedList<Song>();

    @org.junit.Test
    public void addSong() {
        Album album = new Album("Purple Rain", "Prince and the Revolution");
        boolean addasong = album.addSong("Lets Go Crazy", 3.54);
        assertTrue(addasong);
//        boolean addanothersong = album.addSong("Take Me with U", 4.39);
//        assertTrue(addanothersong);
    }

    @org.junit.Test
    public void addToPlayList() {
        album.addSong("Lets Go Crazy", 3.54);
        albums.add(album);
        albums.get(0).addToPlayList("Lets Go Crazy", playList);
        assertSame("Lets Got Crazy", "Lets Go Crazy");
    }



}