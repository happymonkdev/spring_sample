package org.spring.service;

import java.util.List;

import org.spring.model.Customer;
import org.spring.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	// @Autowired
	private CustomerRepository customerRepository1;

	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository1 = customerRepository;
		// TODO Auto-generated constructor stub
	}

	// @Autowired
	public void setCustomerRepository1(CustomerRepository customerRepository1) {
		this.customerRepository1 = customerRepository1;
	}

	@Override
	public List<Customer> findAll() {
		return customerRepository1.findAll();
	}
}
