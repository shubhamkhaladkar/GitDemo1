package programs3;

import java.util.Scanner;

public class Prac2 {
	public static void main(String[] args) {
		System.out.println("Main method is started..");

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Number here:");
		int a = sc1.nextInt();

		if (a > 0) {
			System.out.println("Number is positive number..");
		} else {
			System.out.println("Number is negative number");
		}

		System.out.println("Main method ended..");
	}
}
