package net.ed;

/**
 * Base abstract class
 * Creates a new ListItem
 *
 */
public abstract class ListItem {

    /**
     * Holds references to objects of type ListItem
     * Protected so they can be accessed from the concrete subclasses
     * Private would block access
     */
    protected ListItem rightLink = null;
    protected ListItem leftLink = null;

    protected Object value;

    /**
     * Constructor with just the value field to set the value
     * Any concrete class that inherits from this class will
     * need this constructor that sets the value
     * @param value
     */
    public ListItem(Object value) {
        this.value = value;
    }

    /**
     * Abstract methods build structures that make the node's
     * next() and previous() methods point to eachother
     * Retruns the next ListItem
     * Saves the next ListItem
     * Retruns the previous ListItem
     * Saves the previous ListItem
     *
     * @return
     */
    abstract ListItem next();
    abstract ListItem setNext(ListItem item);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem item);

    /**
     * Compares the current list item to see if the object is the same
     * @param item
     * @return
     */
    abstract int compareTo(ListItem item);

    /**
     * getters and setters for value field
     * @return
     */
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
