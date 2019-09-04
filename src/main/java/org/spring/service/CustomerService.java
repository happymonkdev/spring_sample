package org.spring.service;

import java.util.List;

import org.spring.model.Customer;

public interface CustomerService {

	List<Customer> findAll();

}