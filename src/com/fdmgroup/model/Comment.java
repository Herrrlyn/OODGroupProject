package com.fdmgroup.model;

import java.util.Date;

public class Comment {

	private int id;
	private String userName;
	private String details;
	private Date dateAdded;
	
	public Comment() {
		super();
		this.id = -1;
		this.userName = null;
		this.details = null;
		this.dateAdded = null;
	}
	public Comment(int id, String userName, String details, Date dateAdded) {
		super();
		this.id = id;
		this.userName = userName;
		this.details = details;
		this.dateAdded = dateAdded;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public Date getDateAdded() {
		return dateAdded;
	}
	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comment other = (Comment) obj;
		if (dateAdded == null) {
			if (other.dateAdded != null)
				return false;
		} else if (!dateAdded.equals(other.dateAdded))
			return false;
		if (details == null) {
			if (other.details != null)
				return false;
		} else if (!details.equals(other.details))
			return false;
		if (id != other.id)
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Comment [id=" + id + ", userName=" + userName + ", details=" + details + ", dateAdded=" + dateAdded
				+ "]";
	}

	
	
}
