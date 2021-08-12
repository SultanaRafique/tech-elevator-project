package com.techelevator.dao;

import com.techelevator.model.Address;

import java.util.List;

public interface AddressDao {

    // create an Address
    Address createAddress(Address newAddress);

    // get an Address by id
    Address getAddress(Long addressId);

    // get a List of all Addresses
    List<Address> getAllAddresses();

    // get a List of addresses for a contact;
    List<Address> getAddressesForContact(Long contactId);

    // update an Address

    // delete an Address
}
