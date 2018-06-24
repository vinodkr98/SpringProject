package com.spring.test.service;

import java.util.List;

import com.spring.test.domain.Customer;


public interface CustomerService {
    
	public static void addCustomer(Customer Customer) {
		// TODO Auto-generated method stub
		
	}
	 
    public  void getAllCustomers();
    public static void deleteCustomer(Integer CustomerId) {
		// TODO Auto-generated method stub
		
	}
 
    public static List<Customer> getCustomer(int Customerid) {
		// TODO Auto-generated method stub
		return null;
	}
 
    public static Customer updateCustomer(Customer Customer) {
		// TODO Auto-generated method stub
		return null;
	}
}
