package service;

import java.util.List;

import model.Customer;
import repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {
	private CustomerRepository customerRepository;

	public CustomerRepository getCustomerRepository() {
		return customerRepository;
	}

	public CustomerServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
}
