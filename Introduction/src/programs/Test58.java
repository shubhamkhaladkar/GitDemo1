package programs;

import java.util.Scanner;

//try and catch blocks
public class Test58 {
	public static void main(String[] args) {

		System.out.println("Main method is started");

		Scanner sc1 = new Scanner(System.in);

		System.out.println("enter number here:");

		int r = sc1.nextInt();

		Scanner sc2 = new Scanner(System.in);

		System.out.println("Enter number here: ");

		int v = sc2.nextInt();

		int b = 0;

		try {
			b = r / v;
		} catch (NullPointerException npe) {
			System.out.println("Null pointer exception is executed...");
		}

		catch (ArithmeticException ae) {
			System.out.println("Arithmetic exception is executed...");
		}

		finally {
			System.out.println("Finally is running....");

		}
		System.out.println("Divison result is:" + b);

		System.out.println("Main method is stopped..");
	}
}
