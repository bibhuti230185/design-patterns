package org.bibhuti.behavioural.command;

public class EditContactCommand extends Command2 {
    private  ContactList contactList;
    private  Contact contact;
    public EditContactCommand(ContactList contactList, Contact contact) {
        this.contactList = contactList;
        this.contact = contact;
    }

    @Override
    public void execute() {
        contactList.editContact(contact);
        System.out.println("EditContactCommand executed" + contactList.getAllUsernames());
    }
}
