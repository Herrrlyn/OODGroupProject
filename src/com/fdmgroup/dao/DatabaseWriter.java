
package com.fdmgroup.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;

import com.fdmgroup.model.Customer;

public class DatabaseWriter {
	
	private static final String USERNAME = "trainee1";
	private static final String PASSWORD = "!QAZSE4";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	
	public Optional<Customer> createCustomer(Customer customer) {
		
		//System.out.println(customer);
		try (Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				PreparedStatement ps = con.prepareStatement("INSERT INTO customer VALUES(?,?,?,?,?,?)"); 
				){
			
			
			con.setAutoCommit(false);
			ps.setInt(1, customer.getUserId());

			ps.setString(2, customer.getFirstName());
			ps.setString(3, customer.getLastName());

			ps.setString(4, customer.getEmail());
			ps.setString(5, customer.getPassword());
			ps.setBlob(6, customer.getProfilePic());
			
			
			ps.executeUpdate();
			con.commit();
			/*System.out.println("INSERT INTO customer(customer_id,first_name,last_name,email,password) VALUES(" + customer.getUserId() + "," + customer.getFirstName() + "," +
					customer.getLastName() + "," + customer.getEmail() + "," + customer.getPassword() + ")");*/
			
			//String query = "INSERT INTO customer(customer_id,first_name,last_name,email,password) VALUES(?,?,?,?,?)";
			
			//statement.executeUpdate(query);
			
			return Optional.of(customer);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Optional.empty();
	}

}
