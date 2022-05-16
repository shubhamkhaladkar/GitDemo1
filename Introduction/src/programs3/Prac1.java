package programs3;

import java.util.Scanner;

public class Prac1
{  

	public static void main(String[] args) {
		
		System.out.println("Main method is started...");
		
		Scanner sc1  = new Scanner(System.in);
		System.out.println("Enter user name here:");
		String username = sc1.next();
		Scanner sc2  = new Scanner(System.in);
		System.out.println("Enter password here:");
		String password = sc2.next();
		
		String user_name="shubham";
		String pass="Shubh123";
		
		if (username.equals(user_name) && password.equals(pass))
		{
		 System.out.println("Successfully logged in...");	
		}
		else {
			System.out.println("Inavlid user name / password");
		}
		System.out.println("Main method ended..");
	}
}
