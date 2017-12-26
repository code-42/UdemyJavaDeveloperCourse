package net.ed;

import java.util.ArrayList;

public class Contacts {

//    private String name;
//    private String phoneNumber;

    private ArrayList<String> contacts = new ArrayList<String>();

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

    private void updateExistingContact(int position, String contact){

    }

    private int findItem(String searchItem){
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
