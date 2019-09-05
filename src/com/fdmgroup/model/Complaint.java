package com.fdmgroup.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Complaint {

	private int id;
	private String title;
	private Date date;
	private String userName;
	private Status status;
	private String complaint;
	private List<Comment> comments;
	private Department dept;
	
	public Complaint() {
		super();
	}
	
	public Complaint(int id, String title, Date date, String userName, Status status, String complaint,
			Department dept) {
		super();
		this.id = id;
		this.title = title;
		this.date = date;
		this.userName = userName;
		this.status = status;
		this.complaint = complaint;
		this.comments = new ArrayList<Comment>();
		this.dept = dept;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public String getComplaint() {
		return complaint;
	}
	public void setComplaint(String complaint) {
		this.complaint = complaint;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Complaint other = (Complaint) obj;
		
		if (complaint == null) {
			if (other.complaint != null)
				return false;
		} else if (!complaint.equals(other.complaint))
			return false;
		
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
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
		return "Complaint \n[id=" + id + ", \ntitle=" + title + ", \ndate=" + date + ", \nuserName=" + userName + ", \nstatus="
				+ status + ", \ncomplaint=" + complaint + ", \ncomments=" + comments + ", \ndept=" + dept + "]";
	}
	
	
	
}
