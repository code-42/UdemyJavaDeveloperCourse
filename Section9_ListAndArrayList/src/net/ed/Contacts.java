package net.ed;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class Contacts {

    // store MobilePhone contact list in ArrayList
    private static ArrayList<String> contacts = new ArrayList<String>();

    // empty constructor
    public Contacts() {
    }

    // default constructor
    public Contacts(ArrayList<String> contacts) {
        this.contacts = contacts;
    }

    // getter method
    public static ArrayList<String> getContacts() {
        return contacts;
    }

    public void addNewContact(String contact){
        if (contacts.indexOf(contact) == -1){
            contacts.add(contact);
        } else {
            System.out.println("Contact already exists");
        }

    }

    public void removeContact(int position) {
        String contact = contacts.get(position);
        try{
            if (contact != "") {
                if (contact != null) {
                    contacts.remove(position);
                    System.out.println("Contact deleted.");
                }
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println("Contact not found.");
        }
    }


    public void printContactsList(){
        for(int i = 0; i < contacts.size(); i++){
            System.out.println((i+1) + ". " + contacts.get(i));
        }
    }

    public void updateExistingContact(int position, String contact){
        contacts.set(position, contact);
        System.out.println("Contacts list #" + position + ". " + contact + " has been updated.");
    }

    public static int findItem(String searchItem){
        return contacts.indexOf(searchItem);
    }

    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if (position >= 0){
            return true;
        }
        return false;
    }

}
