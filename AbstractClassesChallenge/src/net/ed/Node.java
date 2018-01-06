package net.ed;

/**
 * Concrete class that creates and implements the methods in the ListItem class
 * and can therefore be instantiated
 */
public class Node extends ListItem {

    /**
     * Constructor
     * @param value
     */
    public Node(Object value) {
        super(value);
    }

    /**
     * First create the stubs for the methods in parent class
     * 
     * @return
     */
    @Override
    ListItem next() {
        return null;
    }

    @Override
    ListItem setNext(ListItem item) {
        return null;
    }

    @Override
    ListItem previous() {
        return null;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        return null;
    }

    @Override
    int compareTo(ListItem item) {
        return 0;
    }
}
