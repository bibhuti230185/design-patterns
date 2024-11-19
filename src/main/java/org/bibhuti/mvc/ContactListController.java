package org.bibhuti.mvc;

import java.util.List;

public class ContactListController {
    private ContactList contactList;

    public ContactListController(ContactList contactList) {
        this.contactList = contactList;
    }

    public void addContact(Contact contact) {
        contactList.addContact(contact);
    }

    public void removeContact(Contact contact) {
        contactList.removeContact(contact);
    }

    public List<Contact> getContacts() {
        return contactList.getContacts();
    }
}

