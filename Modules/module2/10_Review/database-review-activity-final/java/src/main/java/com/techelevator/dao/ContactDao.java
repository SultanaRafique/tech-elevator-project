package com.techelevator.dao;

import com.techelevator.model.Address;
import com.techelevator.model.Contact;

import java.util.List;

public interface ContactDao {
	

	// create a Contact
    Contact createContact(Contact contact);

    // get a contact by id
    Contact getContact(Long contactId);

	// get a List of all Contacts
    List<Contact> getAllContacts();

	// update a Contact
    int updateContact(Contact contact);

	// delete Contact
    int deleteContact(Long contactid);


    // add address to contact
    boolean addAddressToContact(Contact contact, Address address);

}
