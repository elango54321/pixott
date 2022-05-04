package com.revature.pixott.handler;

import com.revature.pixott.app.app;
import com.revature.pixott.dao.Customerdao;
import com.revature.pixott.model.Customer;

public class SignupHandler {
	public static void display() {
		System.out.println("enter name");
		String name=app.scanner.nextLine();
		System.out.println("enter mobile");
		String mobile=app.scanner.nextLine();
		System.out.println("enter password");
		String password=app.scanner.nextLine();		
	    Customerdao dao = new Customerdao();
		Customer customer = new Customer();
		customer.setName(name);
		customer.setMobile(mobile);
		customer.setPassword(password);
		dao.Signup(customer); 
		MainMenuHandler.display();
		
	}
	
}
