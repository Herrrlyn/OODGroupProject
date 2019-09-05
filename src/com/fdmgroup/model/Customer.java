package com.fdmgroup.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Customer extends User {
	
	private List<Complaint> complaints;

	public Customer() {
		super();
		this.complaints = new ArrayList<Complaint>();
	}

	public Customer(int id, String firstname, String lastname, String email, String password, String profilePic, List<Complaint> complaints) {
		super(id, firstname, lastname, email, password, profilePic);
		this.complaints = complaints;

	}

	public List<Complaint> getComplaints() {
		return complaints;
	}

	public void setComplaints(List<Complaint> complaints) {
		this.complaints = complaints;
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
		return super.toString() + ", \ncomplaints=" + complaints + "]";
	}

	// View all complaints for current customer
	public List<Complaint> ViewAllComplaints(){
		return complaints;
	}
	
	// View all unresolved complaints for current customer
	public List<Complaint> ViewUnresolvedComplaints(){
		List<Complaint> all = getComplaints();
		
		return all.stream().filter(complaint -> complaint.getStatus() == Status.Unresolved)
							.collect(Collectors.toList());
	}
	
	// View all resolved complaints for current customer
	public List<Complaint> ViewResolvedComplaints(){
		List<Complaint> all = getComplaints();
		
		return all.stream().filter(complaint -> complaint.getStatus() == Status.Resolved)
							.collect(Collectors.toList());
	}
	
	// View account details
	public String ViewAccountDetails() {
		return toString();
	}
	
	// View Complaint Details
	
}
