package com.testp.book.service;

import com.testp.book.model.Customer;
import com.testp.book.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    public List<Customer> getAllCustomers()
    {
        List<Customer> customers = new ArrayList<>();
        customerRepository.findAll().forEach(customers1 -> customers.add(customers1));
        return customers;
    }
    //getting a specific record by using the method findById() of CrudRepository
    public Customer getCustomerById(int id)
    {
        return customerRepository.findById(id).get();
    }
    //saving a specific record by using the method save() of CrudRepository
    public void saveOrUpdate(Customer customer)
    {
        customerRepository.save(customer);
    }
    //deleting a specific record by using the method deleteById() of CrudRepository
    public void delete(int id)
    {
        customerRepository.deleteById(id);
    }
    //updating a record
    public void update(Customer customer, int customerId)
    {
        customerRepository.save(customer);
    }

}
