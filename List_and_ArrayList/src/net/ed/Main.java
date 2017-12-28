package net.ed;

// Lecture 57
// Create a program that implements a simple mobile phone with the following capabilities.
// Able to store, modify, remove and query contact names.
// You will want to create a separate class for Contacts (name and phone number).
// Create a master class (MobilePhone) that holds the ArrayList of Contacts
// The MobilePhone class has the functionality listed above.
// Add a menu of options that are available.
// Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
// and search/find contact.
// When adding or updating be sure to check if the contact already exists (use name)
// Be sure not to expose the inner workings of the Arraylist to MobilePhone
// e.g. no ints, no .get(i) etc
// MobilePhone should do everything with Contact objects only.

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;

        printInstructions();

        while (!quit) {
            System.out.println("Enter your choice: ");
            try{
                choice = scanner.nextInt();
            }
            catch (InputMismatchException e){
                System.out.println("Incorrect input. Please try again.");
                printInstructions();
            }

            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    mobilePhone.printContactsList();
                    break;
                case 2:
                    mobilePhone.addNewContact();
                    break;
                case 3:
                    mobilePhone.updateExistingContact();
                    break;
                case 4:
                    mobilePhone.removeContact();
                    break;
                case 5:
                    mobilePhone.searchForContact();
                    break;
                case 6:
                    mobilePhone.copyArrayList(); // see video 56 @ 12:25
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of contacts.");
        System.out.println("\t 2 - To add a contact to the list.");
        System.out.println("\t 3 - To update a contact in the list.");
        System.out.println("\t 4 - To remove a contact from the list.");
        System.out.println("\t 5 - To search for a contact in the list.");
        System.out.println("\t 6 - To copy the contact list.");
        System.out.println("\t 7 - To quit the application.");
    }
}
