package com.fdmgroup.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.fdmgroup.model.Complaint;
import com.fdmgroup.model.Customer;
import com.fdmgroup.view.ComplaintsListView;
import com.fdmgroup.view.LoginRegisterView;

public class ComplainsController {

	private Scanner scanner;
	private LoginRegisterView loginRegisterView;
	private ComplaintsListView complaintsListView;
	private DetailsController detailsController;
	
	public ComplainsController() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ComplainsController(Scanner scanner) {
		super();
		this.scanner = scanner;
	}

	public ComplainsController(Scanner scanner, LoginRegisterView loginRegisterView,
			ComplaintsListView complaintsListView, DetailsController detailsController) {
		super();
		this.scanner = scanner;
		this.loginRegisterView = loginRegisterView;
		this.complaintsListView = complaintsListView;
		this.detailsController = detailsController;
	}

	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

	public LoginRegisterView getLoginRegisterView() {
		return loginRegisterView;
	}

	public void setLoginRegisterView(LoginRegisterView loginRegisterView) {
		this.loginRegisterView = loginRegisterView;
	}

	public ComplaintsListView getComplaintsListView() {
		return complaintsListView;
	}

	public void setComplaintsListView(ComplaintsListView complaintsListView) {
		this.complaintsListView = complaintsListView;
	}

	public DetailsController getDetailsController() {
		return detailsController;
	}

	public void setDetailsController(DetailsController detailsController) {
		this.detailsController = detailsController;
	}
	
	public List<ArrayList<String>> userViewAllComplaints(Customer customer){
		List<ArrayList<String>> retval = customer.ViewAllComplaints();
		return retval;
	}
	
	public Complaint userViewDetailedComplaint(Customer customer, int complaint_id) {
		return customer.findComplaintById(complaint_id);
	}
	
	
}
