package com.spring.test.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.test.domain.Customer;
import com.spring.test.repository.CustomerRepository;


@Service
public class CustomerServiceImpl {

@Resource
private CustomerRepository customerRepository;

@Transactional
public void addCustomer(Customer Customer) {
    CustomerService.addCustomer(Customer);
}

@Transactional
public List<Customer> getAllCustomers() {
    return CustomerRepository.getAllCustomers();
}

@Transactional
public void deleteCustomer(Integer CustomerId) {
    CustomerService.deleteCustomer(CustomerId);
}

public List<Customer> getCustomer(int empid) {
    return CustomerRepository.findAll();
}

public Customer updateCustomer(Customer Customer) {
    // TODO Auto-generated method stub
    return CustomerService.updateCustomer(Customer);
}


}

