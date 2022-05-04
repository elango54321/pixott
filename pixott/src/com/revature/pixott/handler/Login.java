package com.revature.pixott.handler;
import com.revature.pixott.app.app;
import com.revature.pixott.dao.*;
import com.revature.pixott.model.*;
public class Login {
	public static void display() {
		System.out.println("enter the mobile number");
		String mobile = app.scanner.next();
		System.out.println("enter password");
		String pass = app.scanner.next();		
		Customerdao dao = new Customerdao();
		Customer customer = dao.getUser(mobile);
		if (customer.getPassword().equals(pass)) {
			System.out.println("Login Successful");
			MovieHandler.main();
		} else {
			System.out.println("Invalid mobile number or password.");
		}
	}
}
