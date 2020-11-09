package com.io.cred;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CustomerService {

    private List<Customer> customers = new ArrayList<Customer>(Collections.singletonList(
            new Customer(new ContactInfo(), false, new Address())
    ));

    // returns all customers
    public List<Customer> getAllCustomers() {
        return customers;
    }

    // returns customer with matching first name
    public Customer getCustomer(String customerID) {
        int customerIDint = Integer.parseInt(customerID);
        for (int i = 0; i<customers.size(); i++) {
            Customer currentCustomer = customers.get(i);
            if (currentCustomer.getContactInfo().getCustomerID() == customerIDint)
                return currentCustomer;
        }
        return null;
    }

    // adds customer to customer list
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    // updates customer matching to first name
    public void updateCustomer(Customer customer, String customerID) {
        int customerIDint = Integer.parseInt(customerID);
        for (int i = 0; i<customers.size(); i++) {
            Customer currentCustomer = customers.get(i);
            if(currentCustomer.getContactInfo().getCustomerID() == customerIDint){
                customers.set(i, customer);
                return;
            }
        }
    }

    // deletes customer matching to first name
    public void deleteCustomer(String customerID){
        int customerIDint = Integer.parseInt(customerID);
        for (int i = 0; i<customers.size(); i++) {
            Customer currentCustomer = customers.get(i);
            if(currentCustomer.getContactInfo().getCustomerID() == customerIDint){
                customers.remove(i);
            }
        }

    }

}
