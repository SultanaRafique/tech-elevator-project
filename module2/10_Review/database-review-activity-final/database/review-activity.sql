-- contact
-- address
-- contact_address
DROP TABLE IF EXISTS contact_address;
DROP TABLE IF EXISTS address;
DROP TABLE IF EXISTS contact;

CREATE TABLE contact (
        contact_id SERIAL,
        first_name VARCHAR(50) NOT NULL,
        last_name VARCHAR(100),
        phone VARCHAR(20),
        email VARCHAR(100),
        birth_year INTEGER,
        CONSTRAINT pk_contact_id PRIMARY KEY (contact_id)
 );
 
 CREATE TABLE address (
        address_id SERIAL,
        street_address VARCHAR(150) NOT NULL,
        street_address_2 VARCHAR(150),
        city VARCHAR(100) NOT NULL,
        state VARCHAR(50) NOT NULL,
        zip_code VARCHAR(20),
        CONSTRAINT pk_address_id PRIMARY KEY (address_id)
 );
 
 CREATE TABLE contact_address (
        contact_id INTEGER,
        address_id INTEGER,
        CONSTRAINT pk_contact_address PRIMARY KEY (contact_id, address_id),
        CONSTRAINT fk_contact_address_contact FOREIGN KEY (contact_id) REFERENCES contact(contact_id),
        CONSTRAINT fk_contact_address_address FOREIGN KEY (address_id) REFERENCES address(address_id)
 );
 
INSERT INTO contact VALUES (DEFAULT, 'Molly', 'McButter', '215-555-1212', 'mmcb215@gmail.com', 1970);

INSERT INTO address VALUES (DEFAULT, '400 Walnut Street', null, 'Philadelphia', 'PA', '19147');
INSERT INTO address VALUES (DEFAULT, '2790 Broadway', null, 'New York', 'NY', '10025');
INSERT INTO address VALUES (DEFAULT, '2813 Van Hise Avenue', null, 'Madison', 'WI', '53705');