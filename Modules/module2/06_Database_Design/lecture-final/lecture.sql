DROP TABLE IF EXISTS purchase;
DROP TABLE IF EXISTS customer_address;
DROP TABLE IF EXISTS address;
DROP TABLE IF EXISTS customer;
DROP TABLE IF EXISTS painting;
DROP TABLE IF EXISTS artist;

CREATE TABLE artist (
        artist_id       SERIAL,
        first_name      VARCHAR(100) NOT NULL,
        last_name       VARCHAR(100) NOT NULL,
        CONSTRAINT pk_artist_id PRIMARY KEY (artist_id)
);

CREATE TABLE painting (
       painting_id    SERIAL,
       title          VARCHAR(250),
       artist_id      INT NOT NULL,
       CONSTRAINT pk_painting_id PRIMARY KEY (painting_id),
       CONSTRAINT fk_artist_id FOREIGN KEY (artist_id) REFERENCES artist(artist_id)
);

CREATE TABLE customer (
        customer_id   SERIAL,
        first_name    VARCHAR(100) NOT NULL,
        last_name     VARCHAR(100) NOT NULL,
        phone         VARCHAR(20),
        CONSTRAINT pk_customer_id PRIMARY KEY (customer_id)
);

CREATE TABLE address (
        address_id      SERIAL,
        street_address  VARCHAR(200),
        city            VARCHAR(100),
        state           VARCHAR(50),
        zip_code        VARCHAR(15)
);

ALTER TABLE address ADD CONSTRAINT pk_address_id PRIMARY KEY (address_id);

CREATE TABLE customer_address (
        customer_id   INT,
        address_id    INT,
        CONSTRAINT pk_customer_address PRIMARY KEY (customer_id, address_id),
        CONSTRAINT fk_cust_address_customer FOREIGN KEY (customer_id) REFERENCES customer(customer_id),
        CONSTRAINT fk_cust_address_address  FOREIGN KEY (address_id) REFERENCES address(address_id)     
);

CREATE TABLE purchase(
        purchase_id     SERIAL,
        painting_id     INT NOT NULL,
        customer_id     INT NOT NULL,
        purchase_date   DATE NOT NULL,
        purchase_price  MONEY NOT NULL, 
        CONSTRAINT pk_purchase_id PRIMARY KEY (purchase_id),
        CONSTRAINT fk_purchase_customer FOREIGN KEY (customer_id) REFERENCES customer(customer_id),
        CONSTRAINT fk_purchase_painting FOREIGN KEY (painting_id) REFERENCES painting(painting_id)      
);