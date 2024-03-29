package com.fdmgroup.dao;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.fdmgroup.model.Customer;
import com.fdmgroup.model.User;

public class CustomerCollectionDao implements ICustomerDao {
	
	private DatabaseWriter databaseWriter = new DatabaseWriter();
	private DatabaseReader databaseReader = new DatabaseReader();
	
	private List<Customer> customers = new ArrayList<Customer>();
	
	public CustomerCollectionDao() {
		super();
		customers = getCustomers();
	}

	public List<Customer> getCustomers() {
		return databaseReader.getCustomers();
	}

	@Override
	public Customer create(Customer customer) {
		User foundUser = findCustomerByEmail(customer.getEmail());
		
		if (foundUser == null) {
			
			Optional<Customer> optionalCustomer = databaseWriter.createCustomer(customer);
			if (optionalCustomer.isPresent()) {
				customers.add(optionalCustomer.get());
				return customer;
			}
		}
		return null;
	}

	@Override
	public Customer update(Customer customer) {
		Customer foundUser = findCustomerByEmail(customer.getEmail());
		
		if (customer.getEmail() != null && !customer.getEmail().isEmpty()) {
			foundUser.setEmail(customer.getEmail());
		}
		if (customer.getPassword() != null && !customer.getPassword().isEmpty()) {
			foundUser.setPassword(customer.getPassword());
		}
		if (customer.getFirstName() != null && !customer.getFirstName().isEmpty()) {
			foundUser.setFirstName(customer.getFirstName());
		}
		if (customer.getLastName() != null && !customer.getLastName().isEmpty()) {
			foundUser.setLastName(customer.getLastName());
		}
		if (customer.getProfilePic() != null) {
			foundUser.setProfilePic(customer.getProfilePic());
		}
		
		return foundUser;
	}

	@Override
	public boolean remove(Customer customer) {
		return customers.remove(customer);
	}
	
	@Override
	public Customer findCustomerByEmail(String email) {
		
		for (Customer customer : customers) {
			if (customer.getEmail().equals(email)) {
				return customer;
			}
		}
		
		return null;
	}

	@Override
	public List<Customer> findAll() {
		return customers;
	}
}


















