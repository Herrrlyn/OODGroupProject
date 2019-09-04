package com.fdmgroup.view;

import java.util.Scanner;

import com.fdmgroup.controller.ComplainsController;
import com.fdmgroup.controller.DetailsController;
import com.fdmgroup.controller.LoginRegisterController;

public class ComplaintsListView {

	private Scanner scanner;
	private LoginRegisterController loginRegisterController;
	private ComplainsController complainsController;
	private DetailsController detailsController;
	
	public ComplaintsListView() {
		super();
		
	}
	public ComplaintsListView(Scanner scanner) {
		super();
		this.scanner = scanner;
	}
	public ComplaintsListView(Scanner scanner, LoginRegisterController loginRegisterController,
			ComplainsController complainsController, DetailsController detailsController) {
		super();
		this.scanner = scanner;
		this.loginRegisterController = loginRegisterController;
		this.complainsController = complainsController;
		this.detailsController = detailsController;
	}
	public Scanner getScanner() {
		return scanner;
	}
	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}
	public LoginRegisterController getLoginRegisterController() {
		return loginRegisterController;
	}
	public void setLoginRegisterController(LoginRegisterController loginRegisterController) {
		this.loginRegisterController = loginRegisterController;
	}
	public ComplainsController getComplainsController() {
		return complainsController;
	}
	public void setComplainsController(ComplainsController complainsController) {
		this.complainsController = complainsController;
	}
	public DetailsController getDetailsController() {
		return detailsController;
	}
	public void setDetailsController(DetailsController detailsController) {
		this.detailsController = detailsController;
	}
	
	
}
