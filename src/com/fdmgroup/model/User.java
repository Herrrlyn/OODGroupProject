package com.fdmgroup.model;

import java.sql.Blob;

public class User implements IStorable {

	private int userId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private Blob profilePic;
	
	public User() {
		super();
		this.userId = -1;
		this.firstName = null;
		this.lastName = null;
		this.email = null;
		this.password = null;
		this.profilePic = null;
	}
	public User(int id, String firstName, String lastName, String email, String password, Blob profilePic2) {
		super();
		this.userId = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.profilePic = profilePic2;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;

	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Blob getProfilePic() {
		return profilePic;
	}
	public void setProfilePic(Blob profilePic) {
		this.profilePic = profilePic;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		
		if (userId != other.userId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "User \n[userId=" + userId + ", \nfirstName=" + firstName + ", \nlastName=" + lastName + ", \nemail=" + email
				+ ", \npassword=" + password + ", \nprofilePic=" + profilePic + "]";
	}
	
	
}
