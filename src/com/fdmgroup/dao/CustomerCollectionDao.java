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
	
	private DatabaseWriter databaseWriter;
	private DatabaseReader databaseReader;
	
	private List<Customer> customers = new ArrayList<Customer>();
	
	public CustomerCollectionDao() {
		super();
		customers = getCustomers();
	}

	private List<Customer> getCustomers() {
		return databaseReader.getCustomers();
	}

	@Override
	public Customer create(Customer customer) {
		User foundUser = findCustomerById(customer.getUserId());
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
		Customer foundUser = findCustomerById(customer.getUserId());
		
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
	public Customer findCustomerById(int id) {
		
		for (Customer customer : customers) {
			if (customer.getUserId() == id) {
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





