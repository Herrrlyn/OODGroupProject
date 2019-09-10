package com.fdmgroup.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Tables {

	private static final String USERNAME = "trainee1";
	private static final String PASSWORD = "!QAZSE4";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	
	public static void main(String[] args) {
		
		//String tableFile = Tables.class.getResource( "Tables.sql" ).toString().replace("file:/", "");
		//String query = usingBufferedReader(tableFile);
		
		String customerQuery = new StringBuilder("CREATE TABLE customer (\r\n" + 
				"  customer_id NUMBER(8) NOT NULL,\r\n" + 
				"  first_name VARCHAR2(50) NOT NULL,\r\n" + 
				"  last_name VARCHAR2(50) NOT NULL,\r\n" + 
				"  email VARCHAR2(254) NOT NULL,\r\n" + 
				"  password NVARCHAR2(15) NOT NULL,\r\n" + 
				"  profile_picture BLOB,\r\n" + 
				"  CONSTRAINT customer_pk PRIMARY KEY(customer_id)\r\n" + 
				"  )").toString();
		
		String adminQuery = new StringBuilder("CREATE TABLE administrator (\r\n" + 
				"  employee_id NUMBER(8) NOT NULL,\r\n" + 
				"  first_name VARCHAR2(50) NOT NULL,\r\n" + 
				"  last_name VARCHAR2(50) NOT NULL,\r\n" + 
				"  email VARCHAR2(254) NOT NULL,\r\n" + 
				"  password NVARCHAR2(15) NOT NULL,\r\n" + 
				"  profile_picture BLOB,\r\n" + 
				"  CONSTRAINT admin_pk PRIMARY KEY(employee_id)\r\n" + 
				"  )").toString();
		
		String complaintsQuery = new StringBuilder("CREATE TABLE complaints (\r\n" + 
				"  complaint_id NUMBER(8) NOT NULL,\r\n" + 
				"  created_by NUMBER(8) NOT NULL,\r\n" + 
				"  date_created DATE NOT NULL,\r\n" + 
				"  date_resolved DATE,\r\n" + 
				"  department VARCHAR2(50),\r\n" + 
				"  CONSTRAINT complaint_pk PRIMARY KEY(complaint_id),\r\n" + 
				"  CONSTRAINT complaint_fk FOREIGN KEY (created_by) REFERENCES customer(customer_id)\r\n" + 
				"  )").toString();
		
		String commentsQuery = new StringBuilder("CREATE TABLE comments (\r\n" + 
				"  comment_id NUMBER(8) NOT NULL,\r\n" + 
				"  text VARCHAR(500) NOT NULL,\r\n" + 
				"  date_created DATE NOT NULL,\r\n" + 
				"  created_by NUMBER(8) NOT NULL,\r\n" + 
				"  CONSTRAINT comment_pk PRIMARY KEY(comment_id),\r\n" + 
				"  CONSTRAINT customer_comment_fk FOREIGN KEY(created_by) REFERENCES customer(customer_id),\r\n" + 
				"  CONSTRAINT admin_comment_fk FOREIGN KEY(created_by) REFERENCES administrator(employee_id)\r\n" + 
				")").toString();
		
		createTable(customerQuery);
		createTable(adminQuery);
		createTable(complaintsQuery);
		createTable(commentsQuery);
		
		
	}

	private static void createTable(String query) {
		try(Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				Statement statement = con.createStatement();) {
			Statement stmt = con.createStatement();
			stmt.executeUpdate(query);
			System.out.println("Table created successfully....");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	/* Read from SQL file */
	private static String usingBufferedReader(String filePath) {
		
	    StringBuilder contentBuilder = new StringBuilder();
	    try (BufferedReader br = new BufferedReader(new FileReader(filePath)))
	    {
	 
	        String sCurrentLine;
	        while ((sCurrentLine = br.readLine()) != null)
	        {
	            contentBuilder.append(sCurrentLine).append("\n");
	        }
	    }
	    catch (IOException e)
	    {
	        e.printStackTrace();
	    }
	    return contentBuilder.toString();
	}
	
}
