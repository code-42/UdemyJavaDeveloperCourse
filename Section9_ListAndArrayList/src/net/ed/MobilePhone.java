package net.ed;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<String> contacts = new ArrayList<String>();

    public void addNewContact(String contact){
        contacts.add(contact);
    }

    public void printContactsList(){
        for(int i = 0; i < contacts.size(); i++){
            System.out.println((i+1) + ". " + contacts.get(i));
        }

    }
}
