package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.pluralsight.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	@Value("${name}")
	private String someProperty;
	
	@Override
	public List<Customer> findAll(){
		
		List<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();
		
		//customer.setFirstName("Colezea");
		customer.setFirstName(someProperty);
		customer.setLastName("Madalin");
		customers.add(customer);
		
		return customers;
		
	}

}
