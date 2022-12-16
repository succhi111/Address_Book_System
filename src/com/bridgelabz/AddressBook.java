package com.bridgelabz;

import java.util.ArrayList;

public class AddressBook {

    ArrayList<Contacts> addressbook = new ArrayList<>();

    public ArrayList<Contacts> getAddressbook() {
        return addressbook;
    }

    public void setAddressbook(ArrayList<Contacts> addressbook) {
        this.addressbook = addressbook;
    }

    /*
     * Adding Contacts using addContact method in the arraylist of address book and checking duplicates entry
     */
    public void addContact(Contacts contact) {

        addressbook.add(contact);
    }

    /*
     * Printing method to print all the details in the list using for each loop
     */
    public void printAddressBook(Contacts contact) {
        System.out.println("-----------------------------------------------------");
        System.out.println("First name = " + contact.getFirstName());
        System.out.println("last name = " + contact.getLastName());
        System.out.println("address = " + contact.getAddress());
        System.out.println("city = " + contact.getCity());
        System.out.println("state = " + contact.getState());
        System.out.println("zip = " + contact.getZip());
        System.out.println("phone number = " + contact.getPhoneNumber());
        System.out.println("-----------------------------------------------------");
    }
}