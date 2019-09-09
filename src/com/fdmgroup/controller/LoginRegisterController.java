package com.fdmgroup.controller;

import java.util.Scanner;

import com.fdmgroup.model.Customer;
import com.fdmgroup.view.ComplaintsListView;
import com.fdmgroup.view.DetailsView;
import com.fdmgroup.view.LoginRegisterView;

public class LoginRegisterController {

	private Scanner scanner;
	private LoginRegisterView loginRegisterView;
	private ComplaintsListView complaintsListView;
	private DetailsView detailsView;
	
	public LoginRegisterController() {
		super();
		this.scanner = new Scanner(System.in);
	}
	
	public LoginRegisterController(Scanner scanner) {
		super();
		this.scanner = scanner;
	}

	public LoginRegisterController(Scanner scanner, LoginRegisterView loginRegisterView,
			ComplaintsListView complaintsListView, DetailsView detailsView) {
		super();
		this.scanner = scanner;
		this.loginRegisterView = loginRegisterView;
		this.complaintsListView = complaintsListView;
		this.detailsView = detailsView;
	}

	public void register(int id, String email, String password, String firstname, String lastname) {
		
		Customer customer = new Customer(id, firstname, lastname, email, password, null, null);
		System.out.println(customer);
		loginRegisterView.showLoginOptions(false);
		
	}

	public void login(String email, String password) {
		System.out.println("Things need to be done......");
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

	public DetailsView getDetailsView() {
		return detailsView;
	}

	public void setDetailsView(DetailsView detailsView) {
		this.detailsView = detailsView;
	}

	
	
}
