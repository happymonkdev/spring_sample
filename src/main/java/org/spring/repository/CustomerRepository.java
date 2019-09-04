package org.spring.repository;

import java.util.List;

import org.spring.model.Customer;

public interface CustomerRepository {
	List<Customer> findAll();
}
