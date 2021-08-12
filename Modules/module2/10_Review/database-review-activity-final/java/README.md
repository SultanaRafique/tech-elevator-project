# Address Book Execrise

We will be creating a simple **Address Book**.

The Address Book will store contacts.

Each contact will have these properties:

* First name
* Last name
* Phone
* Email
* Birthyear

The **Address Book** application will also maintain a list of addreses.

Each address will contain:

* Street Address
* Street Address 2
* City
* State
* Zip Code

For this project, a few addresses will already exist and though the
capibilty to add addresses is provided, the CLI will not offer this option.

However, the CLI will provide the ability to associate zero or more addresses with a contact. Because the addresses wil be mantained separately, it is possible for multiple contacts to use the same address.

## Step 1
Come up with a database design which will model the **Address Book** and its capabilities.

You should describe:

* Tables
* Fields for each table
* Table Relationships/Keys

## Step 2
* Create an addressbook database
* Write the database script to create the database and insert a sample contact and several addresses.

## Step 3
A **ContactDao** interface has been provided for you, as has a **JdbcContactDao** implementation skeleton.

A **ContactDao** should provide these methods:

* **createContact**
    * Takes a contact
    * Adds the contact to the database
    * Returns the saved contact with the database ID populated
    
* **getContact**
    * Takes a contact ID
    * Retrieves the contact with the specifie ID from the database
    * Returns the found contact, or NULL if not found
    
* **getAllContacts**
    * Returns a list of all the contacts
    * The list should be sorted by last name and by first name within each last name.
    
* **updateContact**
    * Takes a contact
    * Saves updates to the database
    * Returns the number of rows updated
    
* **deleteContact**
    * Takes a contact ID
    * Deletes the contact
    * Returns the number of rows deleted
    
Complete the **ContactDao** code so that it adds these methods.

## Step 4
A CLI application has been provided and your instructor will assist you in wiring up your methods to the CLI as you write them. As part of this, you will be introduced to the concept of a service class.

## Step 5
If you have time, try to write some integration tests for the CRUD functionality in the application.