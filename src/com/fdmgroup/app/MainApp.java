package com.fdmgroup.app;

import java.util.Scanner;

import com.fdmgroup.controller.LoginRegisterController;
import com.fdmgroup.model.IdGenerator;
import com.fdmgroup.view.LoginRegisterView;

public class MainApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		IdGenerator idGenerator = new IdGenerator();
		
		LoginRegisterController lrc = new LoginRegisterController(scanner);
		LoginRegisterView lrv = new LoginRegisterView(scanner);
		
		lrc.setLoginRegisterView(lrv);
		lrv.setId_generator(idGenerator);
		lrv.setLoginRegisterController(lrc);
		
		lrv.showInitialOptions(false);
		
		scanner.close();
	}
}
