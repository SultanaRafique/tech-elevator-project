package com.techelevator.service;

import com.techelevator.dao.AddressDao;
import com.techelevator.dao.ContactDao;
import com.techelevator.dao.JdbcAddressDao;
import com.techelevator.dao.JdbcContactDao;
import com.techelevator.model.Address;
import com.techelevator.model.Contact;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class ContactService {

    ContactDao contactDao;
    AddressService addressService;

    public ContactService(DataSource dataSource) {
        this.contactDao = new JdbcContactDao(dataSource);
        this.addressService = new AddressService(dataSource);
    }

    public Contact getContact(Long contactId) {
        Contact contact = contactDao.getContact(contactId);
        if (contact != null) {
            List<Address> addressList = addressService.getAddressesForContact(contactId);
            if (addressList != null && addressList.size() > 0) {
                contact.setAddresses(addressList);
            }
        }
        return contact;
    }

    public List<Contact> getAllContacts(boolean includeAddresses) {

        List<Contact> contactList = contactDao.getAllContacts();

        for (Contact contact : contactList) {
            List<Address> addressList = addressService.getAddressesForContact(contact.getContactId());
            if (addressList != null && addressList.size() > 0) {
                contact.setAddresses(addressList);
            }
        }


        return contactList;
    }

    public Contact createContact(Contact contact) {
        return contactDao.createContact(contact);
    }

    public boolean deleteContact(Long contactId) {

        int numAffected = contactDao.deleteContact(contactId);
        return numAffected > 0;

    }

    public boolean updateContact(Contact contact) {

        int numAffected = contactDao.updateContact(contact);
        return numAffected > 0;
    }

    public boolean addAddressToContact(Contact contact, Address address) {
        return contactDao.addAddressToContact(contact, address);
    }
}
