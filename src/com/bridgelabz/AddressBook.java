package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {


    private ArrayList<Contact> modelContactList;  			// Declearing Arraylist

    public AddressBook()
    {
        modelContactList = new ArrayList<Contact>();  		// Initaillizing Arraylist
    }

    // Creating a Method and Adding object in a Arraylist
    public void addContact(Contact createPerson)
    {
        System.out.println("Adding a New Contact for " + createPerson.firstName);
        modelContactList.add(createPerson);
    }

    public void editContact() 				// Creating a Method and Edit with Switch Statement
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name of Contact to Edit it");
        String cName = sc.nextLine();
        Contact editContact = modelContactList.get(cName.indexOf(cName));
        if (editContact.getFirstName().equals(cName))
        {

            System.out.println("Which Details You Would Like To Edit ?");
            System.out.println("Press - 1 for First Name \nPress - 2 for Last Name \n"
                    + "Press - 3 for Address \nPress - 4 for City \nPress - 5 for State \nPress - 6 for Zip \n"
                    + "Press - 7 for Phone No. \nPress - 8 for Email");

            int num = sc.nextInt();
            switch(num)
            {
                case 1: System.out.println("Enter New First Name");
                    sc.nextLine();
                    String fName = sc.nextLine();
                    editContact.setFirstName(fName);
                    System.out.println("Update a Sucessfully " + fName);
                    break;

                case 2: System.out.println("Enter New Last Name");
                    sc.nextLine();
                    String lName = sc.nextLine();
                    editContact.setLastName(lName);
                    System.out.println("Update a Sucessfully " + lName);
                    break;

                case 3: System.out.println("Enter New Address");
                    sc.nextLine();
                    String address = sc.nextLine();
                    editContact.setAddress(address);
                    System.out.println("Update a Sucessfully "+ address);
                    break;

                case 4: System.out.println("Enter New City");
                    sc.nextLine();
                    String city = sc.nextLine();
                    editContact.setCity(city);
                    System.out.println("Update a Sucessfully " + city);
                    break;

                case 5: System.out.println("Enter New State");
                    sc.nextLine();
                    String state = sc.nextLine();
                    editContact.setState(state);
                    System.out.println("Update a Sucessfully " + state);
                    break;

                case 6: System.out.println("Enter New Zip");
                    long zip = sc.nextLong();
                    editContact.setZip(zip);
                    System.out.println("Update a Sucessfully " + zip);
                    break;

                case 7: System.out.println("Enter New Phone Number");
                    long phoneNo = sc.nextLong();
                    editContact.setPhoneNo(phoneNo);
                    System.out.println("Update a Sucessfully " + phoneNo);
                    break;

                case 8: System.out.println("Enter New Email");
                    sc.nextLine();
                    String email = sc.nextLine();
                    editContact.setEmail(email);
                    System.out.println("Update a Sucessfully " + email);
                    break;

                default: System.out.println("No Edit");
                    return;


            }
        }
        else
        {
            System.out.println("No such contact");
        }
    }

    public Contact getContactInput()					// Getting a Input from User
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
        while(true)												// Checking a Choice with Switch Statement
        {
            System.out.println("1.Adding Contact \n2.Update \n3.Exit");
            System.out.println("Enter a Your Choice :");
            ch = sc.nextInt();

            switch(ch)
            {
                case 1:
                    Contact Contact = AD.getContactInput();
                    AD.addContact(Contact);

                    System.out.println("Contact Added Successfully");
                    break;

                case 2:
                    AD.editContact();
                    System.out.println("Contact Updated Successfully");
                    break;

                case 3:
                    System.out.println("Thank You We are Exiting");
                    return;

                default:
                    System.out.println("Sorry You are Type Wrong Choice");

            }
        }

    }

}