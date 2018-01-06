package net.ed;

/**
 * Creates a new ListItem
 *
 */
public abstract class ListItems {

    private ListItems nextItem = null;
    private ListItems prevItem = null;

    /**
     * Moves to the next ListItem
     * Moves back to the previous ListItem
     *
     * @return
     */
    abstract ListItems next();
    abstract ListItems previous();



}
