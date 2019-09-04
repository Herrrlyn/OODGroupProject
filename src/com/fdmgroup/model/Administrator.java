package com.fdmgroup.model;

import java.util.ArrayList;
import java.util.List;

public class Administrator extends User {

	private List<Complaint> complaints;
	private String employeeId;

	public Administrator() {
		super();
		this.employeeId = null;
		this.complaints = new ArrayList<Complaint>();
	}
	
	public Administrator(String name, String email, String password, String profilePic, 
			String employeeId, List<Complaint> complaints) {
		super(name, email, password, profilePic);
		this.employeeId = employeeId;
		this.complaints = complaints;
	}



	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
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
		result = prime * result + ((employeeId == null) ? 0 : employeeId.hashCode());
		return result;
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
		Administrator other = (Administrator) obj;
		if (employeeId == null) {
			if (other.employeeId != null)
				return false;
		} else if (!employeeId.equals(other.employeeId))
			return false;
		return equal_user && true;
	}

	@Override
	public String toString() {
		return super.toString() + "Administrator [complaints=" + complaints + ", employeeId=" + employeeId + "]";
	}

	
	
	
}
