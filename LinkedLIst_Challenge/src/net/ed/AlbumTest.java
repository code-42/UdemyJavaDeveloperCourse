package net.ed;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AlbumTest {

//    private static ArrayList<Album> albums = new ArrayList<Album>();

//    @org.junit.Before
//    public void setUp() throws Exception {
//    }

    @org.junit.Test
    public void addSong() {
        Album album = new Album("Purple Rain", "Prince and the Revolution");
        boolean addasong = album.addSong("Take Me with U", 3.54);
        assertFalse(addasong);
    }

//    @org.junit.After
//    public void tearDown() throws Exception {
//    }
}