package net.ed;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AlbumTest {

    @org.junit.Test
    public void addSong() {
        Album album = new Album("Purple Rain", "Prince and the Revolution");
        boolean addasong = album.addSong("Lets Go Crazy", 3.54);
        assertTrue(addasong);
        boolean addanothersong = album.addSong("Take Me with U", 4.39);
        assertTrue(addanothersong);
    }

}