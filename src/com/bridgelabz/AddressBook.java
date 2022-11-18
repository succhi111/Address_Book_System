package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {


    private ArrayList<Contact> ContactList;            // Declearing Arraylist

    public AddressBook() {
        ContactList = new ArrayList<Contact>();        // Initaillizing Arraylist

    }

    public Contact getContactInput()                // Getting a Input from User
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

    public void addContact(Contact createPerson) {
        System.out.println("Adding a New Contact for " + createPerson.firstName);      // Creating a Method and Adding object in a Arraylist
        ContactList.add(createPerson);
    }

    public void editContact()                        // Creating a Method and Edit with Switch Statement
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name of Contact to Edit it");
        String cName = sc.nextLine();
        Contact editContact = ContactList.get(cName.indexOf(cName));
        if (editContact.getFirstName().equals(cName)) {

            System.out.println("Which Details You Would Like To Edit ?");
            System.out.println("Press - 1 for First Name \nPress - 2 for Last Name \n"
                    + "Press - 3 for Address \nPress - 4 for City \nPress - 5 for State \nPress - 6 for Zip \n"
                    + "Press - 7 for Phone No. \nPress - 8 for Email");

            int num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Enter New First Name");
                    sc.nextLine();
                    String fName = sc.nextLine();
                    editContact.setFirstName(fName);
                    System.out.println("Update a Sucessfully " + fName);
                    break;

                case 2:
                    System.out.println("Enter New Last Name");
                    sc.nextLine();
                    String lName = sc.nextLine();
                    editContact.setLastName(lName);
                    System.out.println("Update a Sucessfully " + lName);
                    break;

                case 3:
                    System.out.println("Enter New Address");
                    sc.nextLine();
                    String address = sc.nextLine();
                    editContact.setAddress(address);
                    System.out.println("Update a Sucessfully " + address);
                    break;

                case 4:
                    System.out.println("Enter New City");
                    sc.nextLine();
                    String city = sc.nextLine();
                    editContact.setCity(city);
                    System.out.println("Update a Sucessfully " + city);
                    break;

                case 5:
                    System.out.println("Enter New State");
                    sc.nextLine();
                    String state = sc.nextLine();
                    editContact.setState(state);
                    System.out.println("Update a Sucessfully " + state);
                    break;

                case 6:
                    System.out.println("Enter New Zip");
                    long zip = sc.nextLong();
                    editContact.setZip(zip);
                    System.out.println("Update a Sucessfully " + zip);
                    break;

                case 7:
                    System.out.println("Enter New Phone Number");
                    long phoneNo = sc.nextLong();
                    editContact.setPhoneNo(phoneNo);
                    System.out.println("Update a Sucessfully " + phoneNo);
                    break;

                case 8:
                    System.out.println("Enter New Email");
                    sc.nextLine();
                    String email = sc.nextLine();
                    editContact.setEmail(email);
                    System.out.println("Update a Sucessfully " + email);
                    break;

                default:
                    System.out.println("No Edit");
                    return;


            }
        } else {
            System.out.println("No such contact");
        }
    }

    public void deleteContact()                            // Creating a Method and Deleting Contact with Using First Name
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name of Contact to Delete it");
        String cName = sc.nextLine();
        Contact editContact = ContactList.get(cName.indexOf(cName));
        if (editContact.getFirstName().equals(cName)) {

            ContactList.remove(editContact);
        } else {
            System.out.println("No such Contact to Delete");
        }
    }

    // Accessing Contact into ArrayList and Display One By One
    public void viewContacts() {
        if (ContactList.size() == 0) {
            System.out.println("No Contact Here.");
        } else {
            for (int i = 0; i < ContactList.size(); i++) {
                int num = i + 1;
                System.out.println("Availble Contact In List : " + num);
                System.out.println("First Name :" + ContactList.get(i).firstName + " Last Name :" + ContactList.get(i).lastName);
                System.out.println("Address :" + ContactList.get(i).address + " City :" + ContactList.get(i).city + " State :" + ContactList.get(i).state + " Zip :" + ContactList.get(i).zip);
                System.out.println("Phone No :" + ContactList.get(i).phoneNo);
                System.out.println("Email :" + ContactList.get(i).email);
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("Welcome to the Address Book System");
        int ch = 0;
        Scanner sc = new Scanner(System.in);
        AddressBook AD = new AddressBook();                    // Creating a Object of Main Class
        while (true)                                                // Checking a Choice with Switch Statement
        {
            System.out.println("1.Adding Contact \n2.Update Contact \n3.Delete Contact \n4.View Contact\n5.Exit");
            System.out.println("Enter a Your Choice :");
            ch = sc.nextInt();

            switch (ch) {
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
                    AD.deleteContact();
                    System.out.println("Contact Delete Successfully");
                    break;

                case 4:
                    System.out.println("Showing All Contact Details");
                    AD.viewContacts();
                    break;

                case 5:

                    System.out.println("Thank You We are Exiting");
                    System.exit(0);
                    break;


                default:
                    System.out.println("Sorry You are Type Wrong Choice");

            }
        }

    }

}