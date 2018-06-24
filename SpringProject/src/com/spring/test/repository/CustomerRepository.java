package com.spring.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.spring.test.constants.Constants;
import com.spring.test.domain.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

	@Query(value = Constants.FETCH_CUST_BY_ID, nativeQuery = true)
	public static Customer getCustomerByID(int empid) {
		// TODO Auto-generated method stub
		return null;
	}

	public static List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
