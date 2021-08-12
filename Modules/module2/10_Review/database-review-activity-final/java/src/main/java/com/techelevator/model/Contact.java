package com.techelevator.model;

import java.util.ArrayList;
import java.util.List;

public class Contact {
	
	private Long contactId;
	private String firstName;
	private String lastName;
	private List<Address> addresses = new ArrayList<>();
	private String phone;
	private String email;
	private Integer birthYear;


	public Contact() {

	}

	public Contact(Long contactId, String firstName, String lastName,
				   String phone, String email, Integer birthYear) {
		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.birthYear = birthYear;
	}

	public Long getContactId() {
		return contactId;
	}

	public void setContactId(Long contactId) {
		this.contactId = contactId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(Integer birthYear) {
		this.birthYear = birthYear;
	}
	
	@Override
	public String toString() {
		return String.format("[contactId: %s,  firstName: %s, lastName %s, Addresses: %s, phone: %s, email:%s,  birthYear: %d]",
				contactId, firstName, lastName, addresses, phone, email, birthYear);
	}

}
