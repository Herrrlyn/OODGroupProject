package com.fdmgroup.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;

import com.fdmgroup.model.Customer;

public class DatabaseWriter {
	
	private static final String USERNAME = "trainee1";
	private static final String PASSWORD = "!QAZSE4";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	
	public Optional<Customer> createCustomer(Customer customer) {
		try(Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				Statement statement = con.createStatement();) {
			
			
			String query = "INSERT INTO customers VALUES(" + customer.getUserId() + "," + customer.getFirstName() + "," +
			customer.getLastName() + "," + customer.getEmail() + "," + customer.getPassword() + "," + customer.getProfilePic() + ")";
			
			statement.executeUpdate(query);
			
			return Optional.of(customer);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Optional.empty();
	}

}
