package org.bibhuti.mvc;

import java.util.Scanner;

// This class is responsible for editing a contact and is a view in the MVC pattern
public class EditContactActivity implements Observer {
    private ContactController contactController;

    public EditContactActivity(ContactController contactController) {
        this.contactController = contactController;
    }

    public void show() {
        Scanner scanner = new Scanner(System.in);

        // Get updated contact details
        System.out.println("Editing Contact: " + contactController.getContact());

        System.out.print("Enter new name: ");
        String name = scanner.nextLine();

        System.out.print("Enter new phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter new email: ");
        String email = scanner.nextLine();

        // Update contact details
        contactController.setContactDetails(name, phoneNumber, email);

        System.out.println("Contact updated successfully!");
    }

    @Override
    public void update() {
        System.out.println("Contact updated: " + contactController.getContact());
    }
}

