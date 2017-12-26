package net.ed;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

    private static Scanner scanner = new Scanner(System.in);
    private static Contacts contactsList = new Contacts();

    public static void printContactsList(){
        contactsList.printContactsList();
    }

    public static void addNewContact(){
        System.out.println("Please enter name and phone number");
        contactsList.addNewContact(scanner.nextLine());
    }

    public static void searchForContact(){
        System.out.println("Search for contact: ");
        String searchItem = scanner.nextLine();
        if(contactsList.onFile(searchItem)){
            System.out.println("Found " + searchItem);
        } else {
            System.out.println(searchItem + " not found in contacts list.");
        }
    }

    public static void copyArrayList(){
        ArrayList<String> contactsCopy = new ArrayList<String>();
    }
}
