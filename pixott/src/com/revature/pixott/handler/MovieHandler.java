package com.revature.pixott.handler;
import java.util.Scanner;
import com.revature.pixott.dao.MovieDao;
public class MovieHandler {
	
	public static void main() {
		// TODO Auto-generated method stub
		System.out.println("====MENUS====");
		System.out.println("1.TOP 5 movies");
		System.out.println("2.Search Movies");
		System.out.println("3.Your Wish List");
		System.out.println("4.Logout");
		System.out.println("enter option");
		Scanner scan = new Scanner(System.in);
		int option=scan.nextInt();
		if(option==1) 
		{
			MovieDao.Top5();
			MovieHandler.main();		
		}else if(option==2)
		{
			System.out.println("enter the movie name");
			scan.nextLine();
			String search=scan.nextLine();			
			MovieDao.search(search);
		}
		else {
			System.out.println("not valid");
			
	}scan.close();
	}
}
