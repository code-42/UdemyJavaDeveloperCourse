package net.ed;

import static org.junit.Assert.*;

public class UtilitiesTest {

    @org.junit.Test
    public void everyNthChar() {
        Utilities utils = new Utilities();
//        char[] output = utils.everyNthChar(new char[] {'h', 'e', 'l', 'l', 'o'},2);
//        assertArrayEquals(new char[] {'e','l'},output);
        char[] charArr = {'h', 'e', 'l', 'l', 'o'};
        char[] result = utils.everyNthChar(charArr,8);
        assertArrayEquals(new char[] {'e', 'l'}, result);
    }

    @org.junit.Test
    public void removePairs() {
        Utilities util = new Utilities();
//        assertEquals("ABCDEF", util.removePairs("AABCDDEFF"));
//        assertEquals("ABCABDEF", util.removePairs("ABCCABDEEF"));
//        assertNull("String is null", util.removePairs(null));
        assertEquals("", util.removePairs(""));
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