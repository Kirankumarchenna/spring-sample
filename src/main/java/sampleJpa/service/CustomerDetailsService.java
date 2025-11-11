package sampleJpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sampleJpa.entity.CustomerDetails;
import sampleJpa.repository.CustomerDetailsRepository;

import java.util.List;

@Service
public class CustomerDetailsService {

    @Autowired
    CustomerDetailsRepository customerDetailsRepository;

    public void saveCustomer(CustomerDetails customer){
        customerDetailsRepository.save(customer);
    }

    public List<CustomerDetails> getAllCustomers(){
        return customerDetailsRepository.findAll();

    }
}
