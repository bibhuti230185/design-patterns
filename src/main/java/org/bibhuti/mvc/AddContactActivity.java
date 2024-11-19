package org.bibhuti.mvc;

import java.util.Scanner;

// This class is a part of the View in the MVC pattern
public class AddContactActivity implements Observer {
    private ContactListController contactListController;

    public AddContactActivity(ContactListController contactListController) {
        this.contactListController = contactListController;
    }

    public void show() {
        Scanner scanner = new Scanner(System.in);

        // Get input for new contact
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        // Create new contact and add to contact list
        Contact newContact = new Contact(name, phoneNumber, email);
        contactListController.addContact(newContact);

        System.out.println("Contact added successfully!");
    }

    @Override
    public void update() {
        System.out.println("Contact List Updated:");
        for (Contact contact : contactListController.getContacts()) {
            System.out.println(contact);
        }
    }
}

