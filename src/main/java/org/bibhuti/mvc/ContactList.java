package org.bibhuti.mvc;

import java.util.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ContactList extends Observable {
    private List<Contact> contacts;

    public ContactList() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
        notifyObservers(); // Notify observers when a contact is added
    }

    public void removeContact(Contact contact) {
        contacts.remove(contact);
        notifyObservers(); // Notify observers when a contact is removed
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public Contact getContact(int index) {
        return contacts.get(index);
    }
}
