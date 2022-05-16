package programs1;

import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {

		System.out.println("Main method is started..");

		Scanner sc1 = new Scanner(System.in);

		System.out.println("Enter number here...");

		int re = sc1.nextInt();

		if (re >= 0) 
		{
            System.out.println("Number is positive...");
		} 
		
		else 
		{
           System.out.println("Number is negative..");
		}
	}
}
