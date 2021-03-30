package com.company.schmidt;

import java.util.*;

class Contact {
    
    String name;
    String email;

    public Contact(String name, String email) {

        this.name = name;
        this.email = email;
    }

    public void display() {

        System.out.println("Name: " + name + " Email: " + email);
    }

}

class Collection implements Iterable<Contact> {

    List<Contact> contacts = new ArrayList<>();

    @Override
    public Iterator<Contact> iterator() {

        return this.contacts.iterator();
    }

    public void addContact(Contact contact) {

        contacts.add(contact);
    }

    public void displayContact() {

        for (Contact contact : contacts) {
            contact.display();
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Contact c1 = new Contact("Gunnar", "Gunnarkam621@gmail.com");
        Contact c2 = new Contact("Mr.K", "Mr.k@cscc.edu");

        Collection collection = new Collection();

        collection.addContact(c1);
        collection.addContact(c2);

        collection.displayContact();
        //a lot of google went into this i hope you know...
    }
}