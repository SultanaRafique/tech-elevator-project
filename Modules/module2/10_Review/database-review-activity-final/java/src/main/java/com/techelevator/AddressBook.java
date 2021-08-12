package com.techelevator;

import com.techelevator.dao.AddressDao;
import com.techelevator.dao.ContactDao;
import com.techelevator.dao.JdbcAddressDao;
import com.techelevator.dao.JdbcContactDao;
import com.techelevator.model.Address;
import com.techelevator.model.Contact;
import com.techelevator.service.ContactService;
import com.techelevator.view.AddressBookCLI;
import org.apache.commons.dbcp2.BasicDataSource;

public class AddressBook {

	public static void main(String[] args) {

		
		
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setUrl("jdbc:postgresql://localhost:5432/addressbook");
		dataSource.setUsername("postgres");
		dataSource.setPassword("postgres1");

		AddressBookCLI cli = new AddressBookCLI(dataSource);
		cli.run();
		
	}

}
