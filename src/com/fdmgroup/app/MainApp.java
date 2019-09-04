package com.fdmgroup.app;

import java.util.Scanner;

import com.fdmgroup.controller.LoginRegisterController;
import com.fdmgroup.view.LoginRegisterView;

public class MainApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		LoginRegisterController lrc = new LoginRegisterController(scanner);
		LoginRegisterView lrv = new LoginRegisterView(scanner);
		
		lrc.setLoginRegisterView(lrv);
		lrv.setId_generator(1);
		lrv.setLoginRegisterController(lrc);
		
		lrv.showInitialOptions(false);
		
		scanner.close();
	}
}
