package net.ed;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyLinkedListTest {


    // First instantiate a new object of type MyLinkedList
    MyLinkedList list = new MyLinkedList(null);

    String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";

    @Test
    public void getRoot() {
        assertNull(list.getRoot());
    }

    @Test
    public void addItem() {
        // Make an array of Strings from  stringData
        list.addItem(new Node("Me"));
        System.out.println(list.getRoot().getValue());
        String expected = list.getRoot().getValue().toString();
        String actual = list.getRoot().getValue().toString();
        assertEquals(expected, actual);
    }

    @Test
    public void removeItem() {
        fail("Test not yet implemented");
    }

    @Test
    public void traverse() {
        fail("Test not yet implemented");
    }
}