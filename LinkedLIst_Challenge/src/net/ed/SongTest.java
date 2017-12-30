package net.ed;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SongTest {

    @org.junit.Test
    public void getTitle() {
        Song song = new Song("Purple Rain", 8.41);
        String title = song.getTitle();
        assertEquals("Purple Rainn", title);
    }

}