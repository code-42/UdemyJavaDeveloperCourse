package net.ed;

import java.util.ArrayList;

public class Contacts {

//    private String name;
//    private String phoneNumber;

    private static ArrayList<String> contacts = new ArrayList<String>();

    public Contacts() {
    }

    public Contacts(ArrayList<String> contacts) {
        this.contacts = contacts;
    }

    public void addNewContact(String contact){
        contacts.add(contact);
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
