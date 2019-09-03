package com.fdmgroup.model;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User {
	
	private List<Complaint> complaints;

	public Customer() {
		super();
		this.complaints = new ArrayList<Complaint>();
	}

	public Customer(String name, String email, String password, String profilePic, List<Complaint> complaints) {
		super(name, email, password, profilePic);
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
		int result = super.hashCode();
		result = prime * result + ((complaints == null) ? 0 : complaints.hashCode());
		return result;
	}


	@Override
	public String toString() {
		return super.toString() + "Customer [complaints=" + complaints + "]";
	}
	
	

	
}
