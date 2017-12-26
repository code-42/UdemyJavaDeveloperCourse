package net.ed;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

    private static Scanner scanner = new Scanner(System.in);
    private static Contacts contacts = new Contacts();

    public static void printContactsList(){
        contacts.printContactsList();
    }

    public static void addNewContact(){
        System.out.println("Please enter name and phone number");
        contacts.addNewContact(scanner.nextLine());
    }

    public static void copyArrayList(){
        ArrayList<String> contactsCopy = new ArrayList<String>();
    }
}
