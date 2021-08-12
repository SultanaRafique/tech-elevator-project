package com.techelevator.dao;

import com.techelevator.model.Address;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JdbcAddressDao implements AddressDao {

    private JdbcTemplate jdbcTemplate;

    public JdbcAddressDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Address createAddress(Address newAddress) {
        String sql = "INSERT INTO ADDRESS (street_address, street_address_2, city, state, zip_code) "
            + "VALUES (?, ?, ?, ?, ?) RETURNING address_id";

        Long newId = jdbcTemplate.queryForObject(sql, Long.class, newAddress.getStreetAddress(),
                newAddress.getStreetAddress2(), newAddress.getCity(),
                newAddress.getState(), newAddress.getZipCode());

        newAddress.setAddressId(newId);

        return newAddress;

    }

    @Override
    public Address getAddress(Long addressId) {
        String sql = "SELECT * FROM address WHERE address_id = ?";
        SqlRowSet rowSet = jdbcTemplate.queryForRowSet(sql, addressId);

        if (rowSet.next()) {
            Address address = mapRowToAddress(rowSet);
            return address;
        }

        return null;
    }

    @Override
    public List<Address> getAddressesForContact(Long contactId) {

        List<Address> addressList = new ArrayList<>();

        String sql = "SELECT a.* FROM address a "
            + "JOIN contact_address ca ON ca.address_id = a.address_id "
            + "WHERE ca.contact_id = ?";
        SqlRowSet rowSet = jdbcTemplate.queryForRowSet(sql, contactId);

        while (rowSet.next()) {
            Address address = mapRowToAddress(rowSet);
            addressList.add(address);
        }

        return addressList;
    }

    public List<Address> getAllAddresses() {
        List<Address> addressList = new ArrayList<>();

        String sql = "SELECT a.* FROM address a ";
        SqlRowSet rowSet = jdbcTemplate.queryForRowSet(sql);

        while (rowSet.next()) {
            Address address = mapRowToAddress(rowSet);
            addressList.add(address);
        }

        return addressList;
    }

    private Address mapRowToAddress(SqlRowSet row) {
        Address address = new Address();

        address.setAddressId(row.getLong("address_id"));
        address.setStreetAddress(row.getString("street_address"));
        address.setStreetAddress2(row.getString("street_address_2"));
        address.setCity(row.getString("city"));
        address.setState(row.getString("state"));
        address.setZipCode(row.getString("zip_code"));

        return address;
    }
}
