package com.fdmgroup.model;

import java.sql.Blob;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Customer extends User {
	
	private List<Complaint> complaints = new ArrayList<Complaint>();

	public Customer() {
		super();
		this.complaints = new ArrayList<Complaint>();
	}

	public Customer(int userId, String firstName, String lastName, String email, String password, Blob profilePic, List<Complaint> complaints) {
		super(userId, firstName, lastName, email, password, profilePic);
		this.complaints = complaints;

	}


	public Customer(int id, String firstname, String lastname, String email, String password, 
			Blob profilePic, List<Complaint> complaints, List<Comment> comments) {
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
		if (!super.equals(obj))
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

	// View all complaints for current customer
	public List<ArrayList<String>> ViewAllComplaints() {
		List<ArrayList<String>> retval = new ArrayList<ArrayList<String>>();
		List<Complaint> all = getComplaints();
		for (Complaint complaint : all) {
			ArrayList<String> temp = new ArrayList<String>();
			temp.add(complaint.getTitle());
			temp.add(complaint.getUserName());
			temp.add(complaint.getDate().toString());
			temp.add(complaint.getStatus().toString());
			retval.add(temp);
		}
		return retval;
		

	}
	
	// View all unresolved complaints for current customer
	public List<ArrayList<String>> ViewUnresolvedComplaints(){
		List<ArrayList<String>> all = ViewAllComplaints();
		
		return all.stream().filter(complaint -> complaint.get(3) == "Unresolved")
							.collect(Collectors.toList());
	}
	
	// View all resolved complaints for current customer
	public List<ArrayList<String>> ViewResolvedComplaints(){
		List<ArrayList<String>> all = ViewAllComplaints();
		
		return all.stream().filter(complaint -> complaint.get(3) == "Resolved")
							.collect(Collectors.toList());
	}
	
	// View account details
	public String ViewAccountDetails() {
		return this.toString();
	}
	
	// View Complaint Details
	public Complaint ViewComplaintDetails(int id){
		for (Complaint complaint : complaints) {
			if (complaint.getId() == id) return complaint;
		}
		return null;
	}
	
	public void MarkAsResolved(Complaint complaint) {
		complaint.setStatus(Status.Resolved);
	}
	
	public Comment AddAComment(Complaint complaint, int id, String detail, Date date) {
		if (complaint == null) return null;
		Comment comment = new Comment(id, complaint.getUserName(), this.getFirstName() + " " + this.getLastName(), 
				detail, complaint.getDate(), date);
		List<Comment> comms = complaint.getComments();
		comms.add(comment);
		complaint.setComments(comms);
		return comment;
	}
	
	public void SubmitAComplaint(Complaint complaint) {
		complaints.add(complaint);
	}
	
	public Complaint findComplaintById(int id) {
		for (Complaint complaint : complaints) {
			if (complaint.getId() == id) {
				return complaint;
			}
		}
		return null;
	}
}
