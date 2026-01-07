package sampleJpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sampleJpa.entity.CustomerDetails;
import sampleJpa.service.CustomerDetailsService;

import java.util.List;

@RestController
@RequestMapping(value = "/api/")
public class CustomerDetailsController {

    @Autowired
    CustomerDetailsService customerDetailsService;

    @GetMapping(value = "/sample-jpa")
    public List<CustomerDetails> getCustomers(){
        CustomerDetails customerDetails = new CustomerDetails( "Immanuel", "Kiransamuel7287@gmail.com", "Eternity");
        customerDetailsService.saveCustomer(customerDetails);
        return customerDetailsService.getAllCustomers();
    }
}
