package com.spring.test.constants;

public class Constants {
	
   public static final String FETCH_CUST_BY_ID = "SELECT * from Customer c where id= ?";
	
	
	public static final String FETCH_CUST_BY_FNLN = "SELECT * from Customer c where firstName = ? and lastName =?";
}
