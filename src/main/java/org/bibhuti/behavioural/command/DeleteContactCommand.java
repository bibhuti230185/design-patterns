package org.bibhuti.behavioural.command;

public class DeleteContactCommand extends Command2 {
    private  ContactList contactList;
    private  Contact contact;
    public DeleteContactCommand(ContactList contactList, Contact contact) {
        this.contactList = contactList;
        this.contact = contact;
    }

    @Override
    public void execute() {
        contactList.deleteContact(contact);
        System.out.println("DeleteContactCommand executed" + contactList.getAllUsernames());
    }
}
