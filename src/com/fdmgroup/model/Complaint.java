package com.fdmgroup.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Complaint {

	private int id;
	private String title;
	private Date date;
	private Status status;
	private String complaints;
	private List<Comment> comments;
	private Department dept;
	
	public Complaint() {
		super();
		this.id = 0;
		this.title = null;
		this.date = new Date();
		this.status = null;
		this.complaints = null;
		this.comments = new ArrayList<Comment>();
		this.dept = null;
		
	}

	public Complaint(int id, String title, Date date, Status status, String complaints, List<Comment> comments,
			Department dept) {
		super();
		this.id = id;
		this.title = title;
		this.date = date;
		this.status = status;
		this.complaints = complaints;
		this.comments = comments;
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

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getComplaints() {
		return complaints;
	}

	public void setComplaints(String complaints) {
		this.complaints = complaints;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comments == null) ? 0 : comments.hashCode());
		result = prime * result + ((complaints == null) ? 0 : complaints.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((dept == null) ? 0 : dept.hashCode());
		result = prime * result + id;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Complaint other = (Complaint) obj;
		if (comments == null) {
			if (other.comments != null)
				return false;
		} else if (!comments.equals(other.comments))
			return false;
		if (complaints == null) {
			if (other.complaints != null)
				return false;
		} else if (!complaints.equals(other.complaints))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (dept != other.dept)
			return false;
		if (id != other.id)
			return false;
		if (status != other.status)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Complaint [id=" + id + ", title=" + title + ", date=" + date + ", status=" + status + ", complaints="
				+ complaints + ", comments=" + comments + ", dept=" + dept + "]";
	}
	
	
	
	
	
}
