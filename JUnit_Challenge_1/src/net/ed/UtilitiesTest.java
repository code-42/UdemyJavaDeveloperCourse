package net.ed;

import static org.junit.Assert.*;

public class UtilitiesTest {

    private Utilities util;

    @org.junit.Before
    public void setup(){
        util = new Utilities();
    }

    @org.junit.Test
    public void everyNthChar() {
//        Utilities utils = new Utilities();
//        char[] output = utils.everyNthChar(new char[] {'h', 'e', 'l', 'l', 'o'},2);
//        assertArrayEquals(new char[] {'e','l'},output);
        char[] charArr = {'h', 'e', 'l', 'l', 'o'};
        char[] result = util.everyNthChar(charArr,2);
        assertArrayEquals(new char[] {'e', 'l'}, result);
    }

    @org.junit.Test
    public void removePairs() {
//        Utilities util = new Utilities();
//        assertEquals("ABCDEF", util.removePairs("AABCDDEFF"));
//        assertEquals("ABCABDEF", util.removePairs("ABCCABDEEF"));
//        assertNull("String is null", util.removePairs(null));
        assertEquals("", util.removePairs(""));
    }

    @org.junit.Test
    public void converter() {
        // return (a/b) + (a * 30) -2;
//        Utilities util = new Utilities();
        int sum = util.converter(10,5);
        assertEquals(300,sum);
    }

    // Challenge #8 ArithmeticException (divide by 0)
    @org.junit.Test(expected = ArithmeticException.class)
    public void converter_arithmeticException() throws Exception {
//        Utilities util = new Utilities();
        util.converter(10,0);
    }

    @org.junit.Test
    public void nullIfOddLength() {
//        Utilities util = new Utilities();
        assertNull(util.nullIfOddLength("odd"));
        assertNotNull(util.nullIfOddLength("even"));
    }
}