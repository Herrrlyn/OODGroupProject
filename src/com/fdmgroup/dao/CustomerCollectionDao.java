<<<<<<< HEAD
package com.fdmgroup.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.fdmgroup.model.Customer;
import com.fdmgroup.model.User;

public class CustomerCollectionDao implements IUserDao {
	
	private static final String USERNAME = "trainee1";
	private static final String PASSWORD = "!QAZSE4";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";

	private List<Customer> customers = null;
	
	public CustomerCollectionDao() {
		super();
		customers = getCustomers();
		//users.add(new User(1, "jdoe", "1234", "John", "Doe"));
		//users.add(new User(2, "asmith", "4567", "Alex", "Smith"));
		//users.add(new User(3, "mjane", "5678", "Mary", "Jane"));
	}

	private List<Customer> getCustomers() {
		String query = "SELECT * from customers";
		try(Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				Statement statement = con.createStatement();
				ResultSet rs = statement.executeQuery(query)) {
			while(rs.next()) {
				int id = rs.getInt("customer_id");
				String fname = rs.getString("first_name");
				String lname = rs.getString("last_name");
				String email = rs.getString("email");
				String password = rs.getString("password");
				
				System.out.println(id, fname, lname, email, password);
				System.out.println("==================================");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public User create(User user) {
		User foundUser = findByUsername(user.getUsername());
		if (foundUser == null) {
			customers.add(user);
			return user;
		}
		
		return null;
	}

	@Override
	public User update(User user) {
		User foundUser = findById(user.getId());
		
		if (user.getUsername() != null && !user.getUsername().isEmpty()) {
			foundUser.setUsername(user.getUsername());
		}
		if (user.getPassword() != null && !user.getPassword().isEmpty()) {
			foundUser.setPassword(user.getPassword());
		}
		if (user.getFirstname() != null && !user.getFirstname().isEmpty()) {
			foundUser.setFirstname(user.getFirstname());
		}
		if (user.getLastname() != null && !user.getLastname().isEmpty()) {
			foundUser.setLastname(user.getLastname());
		}
		
		return foundUser;
	}

	@Override
	public boolean remove(User user) {
		return users.remove(user);
	}
	
	@Override
	public User findById(int id) {
		
		for (User user : users) {
			if (user.getId() == id) {
				return user;
			}
		}
		
		return null;
	}

	@Override
	public List<User> findAll() {
		return users;
	}

	@Override
	public User findByUsername(String username) {
		for (User user : users) {
			if (user.getUsername().equals(username)) {
				return user;
			}
		}
		
		return null;
	}

	@Override
	public List<User> findByFirstname(String firstname) {
		List<User> usersByFirstname = new ArrayList<>();
		for (User user : users) {
			if (user.getFirstname().equals(firstname)) {
				usersByFirstname.add(user);
			}
		}
		
		return usersByFirstname;
	}
}


















=======
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


















>>>>>>> branch 'Sajjad' of https://git.fdmgroup.com/Haowen.Yin/ComplaintManagementSystem.git
