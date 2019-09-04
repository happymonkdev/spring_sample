package repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository{
	@Value("${dbUsername}")
	private String dbUsername;
	
	public String getDbUsername() {
		return dbUsername;
	}

	public void setDbUsername(String dbUsername) {
		this.dbUsername = dbUsername;
	}

	public List<Customer> findAll() {
		System.out.println("--->>> "+ dbUsername);
		List<Customer> customers = new ArrayList();
		Customer customer = new Customer();
		customer.setFirstName("Anand");
		customer.setLastName("pandey");
		customers.add(customer);
		return customers;
	}
}
