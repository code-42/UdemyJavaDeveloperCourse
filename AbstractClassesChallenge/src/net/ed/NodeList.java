package net.ed;

import java.util.List;

/**
 * Defines an interface that any structure using a Node object will implement
 *
 */

public interface NodeList {

    /**
     * Root (or head in BST) gets the actual ListItem itself
     * Any data structure we create must have a starting node
     * Traverse() for actually going through the list
     * starting at the root and print out the value of each item
     * @return
     */
    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);
}
