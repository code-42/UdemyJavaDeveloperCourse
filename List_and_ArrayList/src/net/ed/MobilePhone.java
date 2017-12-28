package net.ed;

import java.util.ArrayList;
import java.util.InputMismatchException;
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

    public static void updateExistingContact(){
        System.out.print("Update Existing Contact \n Enter Current contact: ");
        String contact = scanner.nextLine();
        int contactNo = searchForContact(contact);
        System.out.print("Enter new contact info: ");
        String newInfo = scanner.nextLine();
        contactsList.updateExistingContact(contactNo, newInfo);
    }

    public static void removeContact(){
        System.out.print("Enter contact to remove: ");
        String contact = scanner.nextLine();
        int contactNo = searchForContact(contact);
        try{
            contactsList.removeContact(contactNo);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Contact does not exist.");
        }
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

    // method overloading - same name different signature
    private static int searchForContact(String contact){
        return Contacts.findItem(contact);
    }

    public static void copyArrayList(){

        // one way to copy and initialize an ArrayList
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(Contacts.getContacts());

        // loop through ArrayList and print each item
        newArray.forEach(item->System.out.println(item));

        // another way to copy and initialize an ArrayList all in one statement
        ArrayList<String> contactsCopy = new ArrayList<String>(Contacts.getContacts());
        contactsCopy.forEach(contact-> System.out.println(contact));

        // convert ArrayList into a regular array
        String[] myArray = new String[Contacts.getContacts().size()];
        myArray = Contacts.getContacts().toArray(myArray);
        for (int i = 0; i < myArray.length; i++){
            System.out.println(i);
        }

    }
}
