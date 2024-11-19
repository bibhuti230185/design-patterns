package org.bibhuti.mvc;

// The ItemController class is a controller class that is responsible for updating the model( item) and notifying the view.
public class ContactController {
    private Contact contact;

    public ContactController(Contact contact) {
        this.contact = contact;
    }

    public void setContactDetails(String name, String phoneNumber, String email) {
        contact.setName(name);
        contact.setPhoneNumber(phoneNumber);
        contact.setEmail(email);
    }

    public Contact getContact() {
        return contact;
    }
}

