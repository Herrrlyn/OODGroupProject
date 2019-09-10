package com.fdmgroup.model;

import java.sql.Blob;
import java.util.ArrayList;
import java.util.List;

public class Customer extends User {
	
	private List<Complaint> complaints = new ArrayList<Complaint>();

	public Customer() {
		super();
		this.complaints = new ArrayList<Complaint>();
	}
	
	public Customer(int userId, String firstName, String lastName, String email, String password, Blob profilePic) {
		super(userId, firstName, lastName, email, password, profilePic);
		this.complaints = complaints;

	}


	public Customer(int userId, String firstName, String lastName, String email, String password, Blob profilePic, List<Complaint> complaints) {
		super(userId, firstName, lastName, email, password, profilePic);
		this.complaints = complaints;

	}

	public List<Complaint> getComplaints() {
		return complaints;
	}

	public void setComplaints(List<Complaint> complaints) {
		this.complaints = complaints;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((complaints == null) ? 0 : complaints.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		boolean equal_user = super.equals(obj);
		
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (complaints == null) {
			if (other.complaints != null)
				return false;
		} else if (!complaints.equals(other.complaints))
			return false;
		return equal_user && true;
	}

	@Override
	public String toString() {
		return super.toString() + " Customer [complaints=" + complaints + "]";
	}
	
	

	
}
