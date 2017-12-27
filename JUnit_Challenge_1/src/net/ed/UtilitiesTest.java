package net.ed;

import static org.junit.Assert.*;

public class UtilitiesTest {

    @org.junit.Test
    public void everyNthChar() {
        fail("Test not implemented yet");
    }

    @org.junit.Test
    public void removePairs() {
        Utilities util = new Utilities();
//        assertEquals("ABCDEF", util.removePairs("AABCDDEFF"));
//        assertEquals("ABCABDEF", util.removePairs("ABCCABDEEF"));
        assertNull("String is null", util.removePairs(null));
    }

    @org.junit.Test
    public void converter() {
        fail("Test not implemented yet");
    }

    @org.junit.Test
    public void nullIfOddLength() {
        fail("Test not implemented yet");
    }
}