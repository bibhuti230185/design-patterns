package org.bibhuti.behavioural.command;

public class AddContactCommand extends Command2 {
    private final ContactList contactList;
    private final Contact contact;

    public AddContactCommand(ContactList contactList, Contact contact) {
        this.contactList = contactList;
        this.contact = contact;
    }

    @Override
    public void execute() {
        contactList.addContact(contact);
        System.out.println("AddContactCommand executed" + contactList.getAllUsernames());
    }
}
