package com.techelevator.view;

import com.techelevator.model.Address;
import com.techelevator.model.Contact;
import com.techelevator.service.AddressService;
import com.techelevator.service.ContactService;

import javax.sql.DataSource;
import java.util.List;
import java.util.Scanner;

public class AddressBookCLI {

    private final Scanner userInput = new Scanner(System.in);
    private ContactService contactService;
    private AddressService addressService;

    public AddressBookCLI(DataSource dataSource) {
        this.contactService = new ContactService(dataSource);
        this.addressService = new AddressService(dataSource);
    }

    public void run() {
        displayBanner();
        boolean done = false;

        while (!done) {
            displayMenu();
            System.out.println();
            String choice = promptForString("Please select an option: ");

            if (choice.equalsIgnoreCase("G")) {
                getContact("Enter contact ID to get: ");
            } else if (choice.equalsIgnoreCase("L")) {
                listAllContacts();
            } else if (choice.equalsIgnoreCase("C")) {
                promptForContact();
            } else if (choice.equalsIgnoreCase("D")){
                deleteContact();
            } else if(choice.equalsIgnoreCase("U")) {
                updateContact();
            } else if(choice.equalsIgnoreCase("A")) {
                addAddressToContact();
            } else if(choice.equalsIgnoreCase("E")) {
                done = true;
            } else {
                System.out.println();
                System.out.println(("*** Invalid Entry ***"));
            }

        }
    }

    private void displayBanner() {
        System.out.println("-----------------------------------------");
        System.out.println("|              Address Book              |");
        System.out.println("-----------------------------------------");
    }

    private void displayMenu() {
        System.out.println();
        System.out.println("(G)et Contact");
        System.out.println("(L)ist Contacts");
        System.out.println("(C)reate New Contact");
        System.out.println("(D)elete Contact");
        System.out.println("(U)pdate Contact");
        System.out.println("(A)dd Address to Contact");
        System.out.println("(E)xit");
    }

    private void displayError(String message) {
        System.out.println();
        System.out.println("***" + message + "***");
        System.out.println();
    }

    private String promptForString(String prompt) {
        System.out.print(prompt);
        return userInput.nextLine();
    }

    private void promptForContact() {

        boolean enterAgain = true;
        while (enterAgain) {
            System.out.println();
            System.out.print("Enter first name: ");
            String firstName = userInput.nextLine();

            System.out.print("Enter last name: ");
            String lastName = userInput.nextLine();

            System.out.print("Enter phone number: ");
            String phone = userInput.nextLine();

            System.out.print("Enter email: ");
            String email = userInput.nextLine();

            System.out.print("Birth year: ");
            String birthYearString = userInput.nextLine();
            Integer birthyear = null;
            try {
                birthyear = Integer.parseInt(birthYearString);
            } catch (NumberFormatException ex) {
                System.out.println("Must be a number... ignoring");
            }

            Contact contact = new Contact(null, firstName, lastName, phone, email, birthyear);

            displayContact(contact);

            boolean getChoice = true;
            while (getChoice) {
                System.out.println("(S)ave");
                System.out.println("(E)nter data again");
                System.out.println("(C)ancel");
                String choice = promptForString("Please select an option: ");
                System.out.println();

                enterAgain = false;
                getChoice = false;

                if (choice.equalsIgnoreCase("S")) {
                    Contact savedContact = contactService.createContact(contact);
                    if (savedContact != null) {
                        System.out.println("Saved!");
                    } else {
                        System.out.println("*** Unable to save!!! ***");;
                    }
                } else if (choice.equalsIgnoreCase("E")) {
                    enterAgain = true;
                } else if (choice.equalsIgnoreCase("C")) {
                    // ignore
                } else {
                    getChoice = true;
                }
            }
        }
    }


    private Contact getContact(String message) {
        System.out.println();
        System.out.print(message);
        String idString = userInput.nextLine();
        if (idString != null) {
            try {
                Long contactId = Long.parseLong(idString);
                Contact contact = contactService.getContact(contactId);
                if (contact != null) {
                    displayContact(contact);
                    return contact;
                } else {
                    System.out.println();
                    System.out.println(String.format("*** Contact ID %d not found ***", contactId));
                    System.out.println();
                }
            } catch (NumberFormatException ex) {
                System.out.println();
                System.out.println("*** ID must be a number **");
                System.out.println();
            }
        }
        return null;
    }

    private void updateContact() {
        Contact contact = getContact("Enter contact ID to update: ");

        if (contact != null) {
            System.out.print("Update this contact (Y/N)? ");
            String confirm = userInput.nextLine();

            if (confirm.equalsIgnoreCase("Y")) {
                getUpdatedContactInfo(contact);
            }
        }
    }

    public void getUpdatedContactInfo(Contact contact) {
        if (contact != null) {
            boolean enterAgain = true;
            while (enterAgain) {
                System.out.println();
                System.out.print(String.format("Enter first name (Hit enter to keep %s): ",
                        contact.getFirstName()));
                String firstName = userInput.nextLine();
                if (!firstName.isEmpty()) {
                    contact.setFirstName(firstName);
                }

                System.out.print(String.format("Enter last name (Hit enter to keep %s): ",
                    contact.getLastName()));
                String lastName = userInput.nextLine();
                if (!lastName.isEmpty()) {
                    contact.setLastName(lastName);
                }

                System.out.print(String.format("Enter phone number (Hit enter to keep %s): ",
                        contact.getPhone()));
                String phone = userInput.nextLine();
                if (!phone.isEmpty()) {
                    contact.setPhone(phone);
                }

                System.out.print(String.format("Enter email (Hit enter to keep %s): ",
                        contact.getEmail()));
                String email = userInput.nextLine();
                if (!email.isEmpty()) {
                    contact.setEmail(email);
                }

                System.out.print("Birth year: ");
                System.out.print(String.format("Enter birth year (Hit enter to keep %s): ",
                        contact.getBirthYear()));
                String birthYearString = userInput.nextLine();
                if (!birthYearString.isEmpty()) {
                    Integer birthyear = null;
                    try {
                        birthyear = Integer.parseInt(birthYearString);
                        contact.setBirthYear(birthyear);
                    } catch (NumberFormatException ex) {
                        System.out.println("Must be a number... ignoring");
                    }
                }


                displayContact(contact);

                boolean getChoice = true;
                while (getChoice) {
                    System.out.println("(S)ave");
                    System.out.println("(E)nter data again");
                    System.out.println("(C)ancel");
                    String choice = promptForString("Please select an option: ");
                    System.out.println();

                    enterAgain = false;
                    getChoice = false;

                    if (choice.equalsIgnoreCase("S")) {
                        boolean updated = contactService.updateContact(contact);
                        if (updated) {
                            System.out.println("Updated!!");
                        } else {
                            System.out.println("*** Unable to update!!! ***");;
                        }
                    } else if (choice.equalsIgnoreCase("E")) {
                        enterAgain = true;
                    } else if (choice.equalsIgnoreCase("C")) {
                        // ignore
                    } else {
                        getChoice = true;
                    }
                }
            }
        }
    }

    private void listAllContacts() {
        List<Contact> contactList = contactService.getAllContacts(false);
        for(Contact contact : contactList) {
            displayContact(contact);
        }
    }

    private void deleteContact() {
        Contact contact = getContact("Enter contact ID to delete: ");

        if (contact != null) {
            System.out.print("Delete this contact (Y/N)? ");
            String confirm = userInput.nextLine();
            if (confirm.equalsIgnoreCase("Y")) {
                boolean deleted = contactService.deleteContact(contact.getContactId());
                if (deleted) {
                    System.out.println("Contact Deleted.");
                } else {
                    System.out.println("*** Unable to delete contact ***");
                }
            }
        }
    }

    private void addAddressToContact() {
        Contact contact = getContact("Enter contact ID to add address to: ");
        if (contact != null) {
            System.out.print("Add address to this contact (Y/N)? ");
            String addConfirm = userInput.nextLine();
            if (addConfirm.equalsIgnoreCase("Y")) {
                System.out.println();
                List<Address> addressList = displayAddresses();
                System.out.println();
                System.out.print("Enter address selection to add to contact: ");
                String addressNumString = userInput.nextLine();
                try {
                    Integer addressNum = Integer.parseInt(addressNumString);
                    if (addressNum <= addressList.size()) {
                        Address address = addressList.get(addressNum - 1);
                        if (!contact.getAddresses().contains(address)) {
                            System.out.println();
                            System.out.println(address.getAddressString());
                            System.out.println();
                            System.out.print("Add this address (Y/N)? ");
                            String confirm = userInput.nextLine();
                            if (confirm.equalsIgnoreCase("Y")) {
                                System.out.println();
                                boolean added = contactService.addAddressToContact(contact, address);
                                if (added) {
                                    System.out.println();
                                    System.out.println("Address added.");
                                } else {
                                    System.out.println("*** Unable to add address ***");
                                }
                            }
                        } else {
                            System.out.println();
                            System.out.println("*** Contact already contains this address ***");
                        }
                    } else {
                        System.out.println("*** Invalid selection ***");
                    }
                } catch (NumberFormatException ex) {
                    System.out.println("*** Invalid selection ***");
                }
            }
        }
    }

    private void displayContact(Contact contact) {
        System.out.println();
        System.out.println("****************************");
        System.out.println(String.format("ID: %d", contact.getContactId()));
        System.out.println(String.format("Name %s, %s",
                stringOrEmpty(contact.getLastName()), stringOrEmpty(contact.getFirstName())));
        if (contact.getAddresses().size() > 0) {
            System.out.println("Addreses: ");
            for(Address address : contact.getAddresses()) {
                System.out.println(address.getAddressString());
            }
        }
        System.out.println(String.format("Phone: %s", stringOrEmpty(contact.getPhone())));
        System.out.println(String.format("Email: %s", stringOrEmpty(contact.getEmail())));
        System.out.println(String.format("Birth year: %s", numOrEmpty(contact.getBirthYear())));
        System.out.println("****************************");
        System.out.println();
    }

    private List<Address> displayAddresses() {
        List<Address> addressList = addressService.getAllAddreses();
        for(int i = 0; i < addressList.size(); i++) {
            System.out.println(String.format("%d) %s", i + 1, addressList.get(i).getAddressString()));
        }
        return addressList;
    }

    private String numOrEmpty(Integer num) {
        return num != null ? num.toString() : "";
    }

    private String stringOrEmpty(String string) {
        return string != null ? string : "";
    }
}
