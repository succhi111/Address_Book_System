package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {


    private ArrayList<Contact> ContactList;  			// Declaring Arraylist

    public AddressBook()
    {
        ContactList = new ArrayList<Contact>();  		// Initailizing Arraylist
    }


    // Creating a Method and Adding object in a Arraylist
    public void addContact(Contact createPerson)
    {
        System.out.println("Adding a New Contact for " + createPerson.firstName);
        ContactList.add(createPerson);
    }

    public Contact getContactInput()					  	// Getting a Input from User
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name:");
        String fName = sc.nextLine();
        System.out.println("Enter Last Name:");
        String lName = sc.nextLine();
        System.out.println("Enter the Address:");
        String address = sc.nextLine();
        System.out.println("Enter the City:");
        String city = sc.nextLine();
        System.out.println("Enter the State:");
        String state = sc.nextLine();
        System.out.println("Enter the Zip:");
        long zip = sc.nextLong();
        System.out.println("Enter the Phone No:");
        long phoneNo = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter the Email:");
        String email = sc.nextLine();

        Contact contact = new Contact(fName, lName, address, city, state, email, zip, phoneNo);
        return contact;
    }

    public static void main(String[] args)
    {

        System.out.println("Welcome to the Address Book System");
        int ch = 0;
        Scanner sc = new Scanner(System.in);
        AddressBook AD = new AddressBook(); 					// Creating a Object of Main Class
        while(true)								// Checking a Choice with Switch Statement
        {
            System.out.println("1.Adding Contact \n2.Exit");
            System.out.println("Enter a Your Choice :");
            ch = sc.nextInt();

            switch(ch)
            {
                case 1:
                    Contact contact = AD.getContactInput();
                    AD.addContact(contact);

                    System.out.println("Contact Added Successfully ");
                    break;

                case 2:
                    System.out.println("Thank You We are Exiting");
                    return;

                default:
                    System.out.println("Sorry You are Type Wrong Choice");

            }
        }

    }

}