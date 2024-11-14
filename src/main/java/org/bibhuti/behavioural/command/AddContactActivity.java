package org.bibhuti.behavioural.command;

import java.util.ArrayList;
import java.util.List;

public class AddContactActivity {
    private ContactList contactList = new ContactList();

    public void addContact(Contact contact) {
        AddContactCommand addContactCommand = new AddContactCommand(contactList, contact);
        addContactCommand.execute();
    }

    public void deleteContact(Contact contact) {
        DeleteContactCommand deleteContactCommand = new DeleteContactCommand(contactList, contact);
        deleteContactCommand.execute();
    }

    public void editContact(Contact contact) {
        EditContactCommand editContactCommand = new EditContactCommand(contactList, contact);
        editContactCommand.execute();
    }

}
