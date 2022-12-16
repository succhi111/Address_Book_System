package com.bridgelabz;

import java.util.*;

public class AddressBookMain {

    public static Contacts input(Scanner scanner) {

        System.out.println("Add details of a person");
        System.out.println("Please provide first name");
        String firstName = scanner.next();
        System.out.println("Please provide Last name");
        String lastName = scanner.next();
        System.out.println("Please provide address");
        String address = scanner.next();
        System.out.println("Please provide city");
        String city = scanner.next();
        System.out.println("Please provide state");
        String state = scanner.next();
        System.out.println("Please provide zip");
        int zip = scanner.nextInt();
        System.out.println("Please provide phone number");
        String phoneNumber = scanner.next();
        Contacts contact = new Contacts(firstName, lastName, address, city, state, zip, phoneNumber);
        return contact;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /*
         * Adding Contacts details using Constructor of person class
         */
        Contacts contact1 = new Contacts("Raj", "Aditya", "noida", "delhi", "Maharashtra", 425411, "8380867601");
        Contacts contact2 = new Contacts("Sandeep", "Pangare", "Rajale", "Nandurbar", "Maharashtra", 425411, "8380864512");
        Contacts contact3 = new Contacts("Sumit", "mishra", "mumbai", "Pune", "Maharashtra", 92226, "4849849840");
        Contacts contact4 = new Contacts("Rahul", "Bhosale", "Satara", "Satara", "Maharashtra", 986544, "44948270");
        Contacts contact5 = new Contacts("Suchendra", "Mishra", "Mahur", "Vithol", "Jharakhand", 26556, "2554654");

        /*
         * Adding contacts to different address books by using addContact method means every single address book
         * has multiple contacts
         */
        AddressBook addressBook = new AddressBook();
        addressBook.addContact(contact1);
        addressBook.addContact(contact2);
        addressBook.addContact(contact3);
        addressBook.addContact(contact4);
        addressBook.addContact(contact5);

        addressBook.addContact(input(scanner));
        System.out.println("Contacts of person in the same city are ");
        addressBook.search("Ranchi");
    }
}