package com.techelevator.model;

public class Address {

    private Long addressId;
    private String streetAddress;
    private String streetAddress2;
    private String city;
    private String state;
    private String zipCode;

    public Address() {

    }

    public Address(Long addressId, String streetAddress, String streetAddress2, String city, String state, String zipCode) {
        this.addressId = addressId;
        this.streetAddress = streetAddress;
        this.streetAddress2 = streetAddress2;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getStreetAddress2() {
        return streetAddress2;
    }

    public void setStreetAddress2(String streetAddress2) {
        this.streetAddress2 = streetAddress2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getAddressString() {
        return String.format("%s, %s, %s, %s", streetAddress, city, state, zipCode);
    }

    @Override
    public String toString() {
        return String.format("[addressId: %d, streetAddress: %s, streetAddress2: %s, "
            + "city: %s, state: %s, zipCode: %s]", addressId, streetAddress, streetAddress2, city, state, zipCode);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        // null check {
        if (o == null) {
            return false;
        }

        // type check and cast
        if (getClass() != o.getClass()) {
            return false;
        }

        Address address =  (Address) o;
        return this.getAddressId().equals(((Address) o).getAddressId());
    }
}
