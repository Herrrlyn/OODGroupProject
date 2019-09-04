package com.fdmgroup.view;

import java.util.Scanner;

import com.fdmgroup.controller.LoginRegisterController;

public class LoginRegisterView {

	private Scanner scanner;
	private int id_generator;
	private LoginRegisterController loginRegisterController;
	

	public LoginRegisterView() {
		super();
		this.scanner = new Scanner(System.in);
	}

	public LoginRegisterView(Scanner scanner) {
		super();
		this.scanner = scanner;
	}
	
	
	public LoginRegisterView(Scanner scanner, int id_generator, LoginRegisterController loginRegisterController) {
		super();
		this.scanner = scanner;
		this.id_generator = id_generator;
		this.loginRegisterController = loginRegisterController;
	}

	public void showInitialOptions(boolean showLogoutMessage) {
		if (showLogoutMessage) {
			System.out.println("You logged out successfully.");
		}
		
		System.out.println("Welcome to Complaints Management System Version 1.0.0");
		System.out.println("Please choose one of the options below:");
		System.out.println("1) Login");
		System.out.println("2) Register");
		System.out.println("3) Exit");
		System.out.println("-------------------------------");
		String userInput = scanner.nextLine();
		
		
		
		switch (userInput) {
		case "1":
			showLoginOptions(false);
			break;
		case "2":
			showRegisterOptions();
			break;
		case "3":
			System.out.println("Thanks, Goodbye!");
			System.exit(0);
			break;
		default:
			System.out.println("The input is invalid.");
			showInitialOptions(false);
		}
	}

	// register a new account with email address, password, and name
	public void showRegisterOptions() {
		
		System.out.println("Register");
		System.out.println("Please enter email address: ");
		String email = scanner.nextLine();
		System.out.println("Please enter password: ");
		String password = scanner.nextLine();
		System.out.println("Please enter first name: ");
		String firstname = scanner.nextLine();
		System.out.println("Please enter last name: ");
		String lastname = scanner.nextLine();
		
		loginRegisterController.register(id_generator, email, password, firstname, lastname);
	}

	public void showLoginOptions(boolean showError) {
		if (showError) {
			System.out.println("Email address/Password is wrong.");
		}
		
		System.out.println("Login");
		System.out.println("Please enter email address: ");
		String email = scanner.nextLine();
		System.out.println("Please enter password: ");
		String password = scanner.nextLine();
		
		
		loginRegisterController.login(email, password);
		
	}
	

	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

	public int getId_generator() {
		return id_generator;
	}

	public void setId_generator(int id_generator) {
		this.id_generator = id_generator;
	}

	public LoginRegisterController getLoginRegisterController() {
		return loginRegisterController;
	}

	public void setLoginRegisterController(LoginRegisterController loginRegisterController) {
		this.loginRegisterController = loginRegisterController;
	}
	
	
}
