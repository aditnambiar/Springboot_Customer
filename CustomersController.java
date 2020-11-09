package com.io.cred;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Vector;

@RestController
public class CustomersController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/customers")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @RequestMapping("/customers/{customerID}")
    public Customer getCustomer(@PathVariable String customerID) {
        return customerService.getCustomer(customerID);
    }

    @RequestMapping(method = RequestMethod.POST, value="/customers")
    public void addCustomer(@RequestBody Customer customer){
        customerService.addCustomer(customer);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/customers/{customerID}")
    public void updateTopic(@RequestBody Customer customer, @PathVariable String customerID){
        customerService.updateCustomer(customer, customerID);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/customers/{customerID}")
    public void deleteTopic(@PathVariable String customerID) {
        customerService.deleteCustomer(customerID);
    }

}
