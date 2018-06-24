package com.spring.test.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.spring.test.domain.Customer;
import com.spring.test.service.CustomerService;



@RestController
public class CustomerController {
	
@Autowired
private CustomerService customerService;
	
@RequestMapping(value = "/customers", method = RequestMethod.GET, produces = "application/json")

public List<Customer> getCustomers(){
	List<Customer> listOfCustomers = CustomerService.getCustomer(0);
	return listOfCustomers;
}

@RequestMapping(value = "/customer{id}", method = RequestMethod.GET, produces = "application/json")  
public List<Customer> getCustomerById(@PathVariable int id) {  
 return CustomerService.getCustomer(id);  
} 
@RequestMapping(value = "/Customers", method = RequestMethod.PUT, produces = "application/json")  
public String newCustomer(@RequestBody Customer customer) {  
 return CustomerService.addCustomer(customer);  
}  

@RequestMapping(value = "/Customers{id}", method = RequestMethod.POST, produces = "application/json")  
public Customer updateCus(@RequestBody Customer customer) {  
 CustomerService.updateCustomer(customer);  
 return customer;
}

@RequestMapping(value = "/Customer{id}", method = RequestMethod.DELETE, produces = "application/json")  
public void deleteCustomer(@PathVariable("id") int id) {  
	customerDao.deleteCus(id);  
 
}  

}
