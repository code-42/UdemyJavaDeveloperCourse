package net.ed;

public abstract class ListItems {

    private ListItems nextItem = null;
    private ListItems prevItem = null;

    abstract ListItems next();
    abstract ListItems previous();



}
