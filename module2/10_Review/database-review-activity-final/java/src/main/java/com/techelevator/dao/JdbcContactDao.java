package com.techelevator.dao;

import com.techelevator.model.Address;
import com.techelevator.model.Contact;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

//
// A few things changed since lecture:
//
// 1) Needed to delete from contact_address before deleting the actual contact. Added this deleteContact method.
// 2) Added ORDER BY last_name. first_name in getAllContacts query.
// 4) Fixed bug where contact creation was swapping first_name and last_name
//
public class JdbcContactDao implements ContactDao {

    private JdbcTemplate jdbcTemplate;

    public JdbcContactDao(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Contact createContact(Contact contact) {
        String sql = "INSERT INTO contact (first_name, last_name, phone, email, birth_year)\n" +
                "VALUES (?,  ?, ?, ?, ?) RETURNING contact_id;";

        Long newId = jdbcTemplate.queryForObject(sql, Long.class, contact.getFirstName(), contact.getLastName(),
                contact.getPhone(), contact.getEmail(), contact.getBirthYear());

        contact.setContactId(newId);

        return contact;
    }

    @Override
    public Contact getContact(Long contactId) {
        String sql = "SELECT * FROM contact WHERE contact_id = ?";
        SqlRowSet rowSet = jdbcTemplate.queryForRowSet(sql, contactId);

        if (rowSet.next()) {
            return  mapRowToContact(rowSet);
        }

        return null;
    }

    @Override
    public List<Contact> getAllContacts() {
        String sql = "SELECT * FROM contact ORDER BY last_name, first_name";

        SqlRowSet rowSet = jdbcTemplate.queryForRowSet(sql);

        List<Contact> contactList = new ArrayList<>();

        while(rowSet.next()) {
            Contact contact = mapRowToContact(rowSet);
            contactList.add(contact);
        }

        return  contactList;
    }

    @Override
    public int updateContact(Contact contact) {
        String sql = "UPDATE contact SET first_name = ?, last_name = ?, "
            + "phone = ?, email = ?, birth_year = ? WHERE contact_id = ?";

        int numUpdated = jdbcTemplate.update(sql, contact.getFirstName(), contact.getLastName(), contact.getPhone(),
                contact.getEmail(), contact.getBirthYear(), contact.getContactId());

        return numUpdated;
    }

    @Override
    public int deleteContact(Long contactid) {
        String sql = "DELETE FROM contact_address WHERE contact_id = ?";
        jdbcTemplate.update(sql, contactid);

        sql = "DELETE FROM contact WHERE contact_id = ?";
        int numFeleted = jdbcTemplate.update(sql, contactid);
        return numFeleted;
    }

    private Contact mapRowToContact(SqlRowSet row) {
        Contact contact = new Contact();
        contact.setContactId(row.getLong("contact_id"));
        contact.setFirstName(row.getString("first_name"));
        contact.setLastName(row.getString("last_name"));
        contact.setPhone(row.getString("phone"));
        contact.setEmail(row.getString("email"));
        contact.setBirthYear(row.getInt("birth_year"));
        return contact;
    }

    @Override
    public boolean addAddressToContact(Contact contact, Address address) {
        String sql = "INSERT INTO contact_address VALUES (?, ?)";
        int rowsAffected = jdbcTemplate.update(sql, contact.getContactId(), address.getAddressId());
        if (rowsAffected > 0) {
            contact.getAddresses().add(address);
            return true;
        }
        return false;
    }


}
