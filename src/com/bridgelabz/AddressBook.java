package com.bridgelabz;

import java.util.Scanner;

public class AddressBook {

    public static void main(String[] args)
    {

        System.out.println("Welcome to the Address Book System");

        Contact contact = new Contact("Suchendra","Mishra","Sahibganj","Bokaro", "Jharkhand", "suchendramishra396@gmail.com",825102,720943931);

        System.out.println("Contact is Created for : " + contact.firstName + " "+ contact.lastName);

        System.out.println(contact);

    }
}