package net.ed;

import java.util.ArrayList;

public class Contacts {

    private String name;
    private String phoneNumber;

    private ArrayList<String> contacts = new ArrayList<String>();

    public Contacts() {
    }

    public Contacts(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void addNewContact(String contact){
        contacts.add(contact);
    }

    public void printContactsList(){
        for(int i = 0; i < contacts.size(); i++){
            System.out.println((i+1) + ". " + contacts.get(i));
        }
    }

    private void modifyContct(int position, String contact){

    }

}
