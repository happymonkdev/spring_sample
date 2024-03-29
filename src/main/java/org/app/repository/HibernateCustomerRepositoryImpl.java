package org.app.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import org.app.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList();
		Customer customer = new Customer();
		customer.setFirstName("Anand");
		customer.setLastName("pandey");
		customers.add(customer);
		return customers;
	}
}
