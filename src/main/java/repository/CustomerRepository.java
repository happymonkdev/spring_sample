package org.app.repository;

import java.util.List;

import org.app.model.Customer;

public interface CustomerRepository {
	List<Customer> findAll();
}
