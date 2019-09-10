package com.fdmgroup.model;

import java.util.Date;

public class Comment {

	private int id;
	private String userComplainted;
	private String userCommented;
	private String details;
	private Date dateComplainted;
	private Date dateCommented;
	
	public Comment() {
		super();
	}
	public Comment(int id, String userComplainted, String userCommented, String details, Date dateComplainted,
			Date dateCommented) {
		super();
		this.id = id;
		this.userComplainted = userComplainted;
		this.userCommented = userCommented;
		this.details = details;
		this.dateComplainted = dateComplainted;
		this.dateCommented = dateCommented;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserComplainted() {
		return userComplainted;
	}
	public void setUserComplainted(String userComplainted) {
		this.userComplainted = userComplainted;
	}
	public String getUserCommented() {
		return userCommented;
	}
	public void setUserCommented(String userCommented) {
		this.userCommented = userCommented;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public Date getDateComplainted() {
		return dateComplainted;
	}
	public void setDateComplainted(Date dateComplainted) {
		this.dateComplainted = dateComplainted;
	}
	public Date getDateCommented() {
		return dateCommented;
	}
	public void setDateCommented(Date dateCommented) {
		this.dateCommented = dateCommented;
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
		if (dateCommented == null) {
			if (other.dateCommented != null)
				return false;
		} else if (!dateCommented.equals(other.dateCommented))
			return false;
		if (dateComplainted == null) {
			if (other.dateComplainted != null)
				return false;
		} else if (!dateComplainted.equals(other.dateComplainted))
			return false;
		if (details == null) {
			if (other.details != null)
				return false;
		} else if (!details.equals(other.details))
			return false;
		if (id != other.id)
			return false;
		if (userCommented == null) {
			if (other.userCommented != null)
				return false;
		} else if (!userCommented.equals(other.userCommented))
			return false;
		if (userComplainted == null) {
			if (other.userComplainted != null)
				return false;
		} else if (!userComplainted.equals(other.userComplainted))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Comment \n[id=" + id + ", \nuserComplainted=" + userComplainted + ", \nuserCommented=" + userCommented
				+ ", \ndetails=" + details + ", \ndateComplainted=" + dateComplainted + ", \ndateCommented=" + dateCommented
				+ "]";
	}
	
	
	

	
}
