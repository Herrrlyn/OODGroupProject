package com.fdmgroup.dao;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.fdmgroup.model.Customer;

public class DatabaseWriter {
	
	private static final String USERNAME = "trainee1";
	private static final String PASSWORD = "!QAZSE4";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	
	
	public List<Customer> getCustomers() {
		List<Customer> customers = new ArrayList<Customer>();
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
				Blob blob = rs.getBlob("photo");
				
				
				Customer user = new Customer();
				
				user.setUserId(id);
				user.setFirstName(fname);
				user.setLastName(lname);
				user.setEmail(email);
				user.setPassword(password);
				user.setProfilePic(blob);
				
				customers.add(user);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return customers;
	}
	
	public Customer createCustomer(Customer customer) {
		try(Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				Statement statement = con.createStatement();) {
			
			
			String query = "INSERT INTO customers VALUES(" + customer.getUserId() + "," + customer.getFirstName() + "," +
			customer.getLastName() + "," + customer.getEmail() + "," + customer.getPassword() + "," + customer.getProfilePic() + ")";
			
			statement.executeUpdate(query);
			
			return customer;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
