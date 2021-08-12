package com.techelevator.service;

import com.techelevator.dao.AddressDao;
import com.techelevator.dao.JdbcAddressDao;
import com.techelevator.model.Address;

import javax.sql.DataSource;
import java.util.List;

public class AddressService {

    private AddressDao addressDao;

    public AddressService(DataSource dataSource) {
        addressDao = new JdbcAddressDao(dataSource);
    }

    public Address createAddress(Address address) {
        return addressDao.createAddress(address);
    }

    public Address getAddress(Long addressId) {
        return addressDao.getAddress(addressId);
    }

    public List<Address> getAddressesForContact(Long contactId) {
        return addressDao.getAddressesForContact(contactId);
    }

    public List<Address> getAllAddreses() {
        return addressDao.getAllAddresses();
    }
}
