package org.bibhuti.behavioural.command;

public class CommandPatternExample2 {
    public static void main(String[] args) {

        Contact contact = new Contact("John Doe", " test@test.com", "1");
        AddContactActivity addContactActivity = new AddContactActivity();
        addContactActivity.addContact(contact);
        Contact contact2 = new Contact("Changed User Name", "email", "1");
        addContactActivity.editContact(contact2);
        addContactActivity.deleteContact(contact);
    }
}
