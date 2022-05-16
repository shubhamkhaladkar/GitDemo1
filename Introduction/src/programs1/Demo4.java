package programs1;

import java.util.Scanner;

public class Demo4 {
	public static void main(String[] args) {

		System.out.println("Main method is started...");

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter user name here: ");
		String rv = sc1.next();

		Scanner sc2 = new Scanner(System.in);

		System.out.println("Enter pass word here: ");

		String rv1 = sc2.next();

		String username = "Shubham";

		String password = "Shubh123";

		if (rv.equals(username) && rv1.equals(password)) {
			System.out.println("Welcome Mr. "+username);
		} else {
			System.out.println("Unable to login");
		}

		System.out.println("Main method is ended");

	}
}
