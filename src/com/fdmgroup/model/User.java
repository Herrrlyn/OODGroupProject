package com.fdmgroup.model;

public class User {

	private int userId;
	private String name;
	private String email;
	private String password;
	private String profilePic;

	public User() {
		super();
		this.userId = -1;
		this.name = null;
		this.email = null;
		this.password = null;
		this.profilePic = null;
	}
	public User(String name, String email, String password, String profilePic) {
		super();
		this.name = name;
		this.email = email;
		this.userId = IdGenerator.generate();
		this.password = password;
		this.profilePic = profilePic;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getProfilePic() {
		return profilePic;
	}
	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((profilePic == null) ? 0 : profilePic.hashCode());
		result = prime * result + userId;
		return result;
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
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		
		if (userId != other.userId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", userId=" + userId + ", password=" + password
				+ ", profilePic=" + profilePic + "]";
	}
	
	
	
	
}
