package com.io.cred;

import java.util.Vector;

public class Customer {

    private ContactInfo contactInfo;
    private boolean active;
    private Address address;

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    // constructors, one default, and one for all variables
    public Customer() {
        ContactInfo contactInfo = new ContactInfo();
        this.active = true;
        Address address = new Address();
    }

    public Customer(ContactInfo contactInfo, boolean status, Address address) {
        this.contactInfo = contactInfo;
        this.active = status;
        this.address = address;
    }


}
