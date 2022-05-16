package programs3;

import java.util.Scanner;

public class Prac20 {
	public static void main(String[] args) {
		System.out.println("Main method started..");
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter number here");
		int ab = sc1.nextInt();

		if (ab % 3 == 0 && ab % 5 == 0) {
			System.out.println("The number is divided by 3 and 5");
		} else if (ab % 3 == 0) {
			System.out.println("The number is divided by 3");
		} else if (ab % 5 == 0) {
			System.out.println("The number is divide by 5");
		} else {
			System.out.println("The number is not divided by 3 and 5");
		}
		System.out.println("Main method ended..");
	}
}
