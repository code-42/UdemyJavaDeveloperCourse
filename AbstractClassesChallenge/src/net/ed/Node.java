package net.ed;

/**
 * Concrete class that creates and implements the methods in the ListItem
 * abstract class and can therefore be instantiated and create objects of type Node
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
     * next() and setNext() and previous() and setPrevious() methods
     * are basically getters and setters
     *
     * @return
     */
    @Override
    ListItem next() {
        return this.rightLink;
    }

    @Override
    ListItem setNext(ListItem item) {
        this.rightLink = item;
        return this.rightLink;
    }

    @Override
    ListItem previous() {
        return leftLink;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        this.leftLink = item;
        return this.leftLink;
    }

    /**
     * Using the getValue() method to compare each item
     * But value is defined as type Object in ListItem class
     * But pass as String so need to cast as String in compareTo()
     * @param item
     * @return
     */
    @Override
    int compareTo(ListItem item) {
        if(item != null){
            return ((String) super.getValue()).compareTo((String) item.getValue());
        } else {
            return -1;
        }
    }
}
