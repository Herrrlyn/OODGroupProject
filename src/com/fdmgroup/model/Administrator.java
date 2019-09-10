package com.fdmgroup.model;

import java.sql.Blob;
import java.util.List;

public class Administrator extends User {

	private String employeeId;

	public Administrator() {
		super();
		this.employeeId = null;
	}
	
	public Administrator(int id, String firstname, String lastname, String email, String password, Blob profilePic, 
			String employeeId, List<Complaint> complaints) {
		super(id, firstname, lastname, email, password, profilePic);
		this.employeeId = employeeId;
	}



	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
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
		return super.toString() + "Administrator [employeeId=" + employeeId + "]";
	}

	
	
	
}
