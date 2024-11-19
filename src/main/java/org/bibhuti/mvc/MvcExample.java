package org.bibhuti.mvc;

public class MvcExample {
    public static void main(String[] args) {

            // Create models
            ContactList contactList = new ContactList();
            ContactListController contactListController = new ContactListController(contactList);

            // Create views and add them as observers
            AddContactActivity addContactActivity = new AddContactActivity(contactListController);
            contactList.addObserver(addContactActivity); // Add observer

            EditContactActivity editContactActivity = null;

            // Simulate adding a new contact
            addContactActivity.show();

            // Edit the first contact (if it exists)
            if (!contactList.getContacts().isEmpty()) {
                Contact firstContact = contactList.getContacts().get(0);
                ContactController contactController = new ContactController(firstContact);
                editContactActivity = new EditContactActivity(contactController);
                firstContact.addObserver(editContactActivity); // Add observer for the contact
                editContactActivity.show();
            }
        }

}
