package net.ed;

public class MyLinkedList implements NodeList {

    private ListItem root = null;

    public MyLinkedList(ListItem root){
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root == null){
            // The list was empty, so this item becomes the head of the list
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while (currentItem != null){
            int comparison = (currentItem.compareTo(newItem));
            if(comparison < 0){
                // See Video 65 @ 10:55 for explanation of ListIterator.compareTo() method
                // newItem is greater than currentItem, move right if possible
                // then compare again
                if(currentItem.next() != null){
                    currentItem = currentItem.next();
                } else {
                    // there is no next, so insert at the end of the list
                    currentItem.setNext(newItem);
                    newItem.setPrevious(currentItem);
                    return true;
                }
            } else if(comparison > 0){
                // newItem is less, so insert newItem before currentItem
                if(currentItem.previous() != null){
                    currentItem.previous().setNext(newItem);
                    newItem.setPrevious(currentItem.previous());
                    newItem.setNext(currentItem);
                    currentItem.setPrevious(newItem);
                } else {
                    // the node with a previous is the root
                    newItem.setNext(this.root);
                    this.root.setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            } else {
                // equal, do not add
                System.out.println(newItem.getValue() + " is already present, so not added.");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    /**
     * traverse() for actually going through the list
     * starting at the root and print out the value of each item
     * @param root
     */
    @Override
    public void traverse(ListItem root) {
        //

    }
}
