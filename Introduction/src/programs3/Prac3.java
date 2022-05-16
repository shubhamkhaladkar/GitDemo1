package programs3;

import java.util.Scanner;

public class Prac3 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("program started..");

		Scanner sc1 = new Scanner(System.in);

		System.out.println("Enter amount here:");
		int amount = sc1.nextInt();

		if (amount <= 5000) {
			System.out.println("your product amt:" + amount + "is selected for 25% discoubnt");

			double discountamt = amount * 0.25;
			System.out.println("Discount amount is :" + discountamt);

			double totalamount = amount - discountamt;
			System.out.println("final amount of of purchased product is:" + totalamount);
		}
			else if (amount >=5000 && amount<=25000)
			{
				System.out.println("your product amt:" + amount + "is selected for 25% discoubnt");

				double discountamt = amount * 0.25;
				System.out.println("Discount amount is :" + discountamt);

				double totalamount = amount - discountamt;
				System.out.println("final amount of of purchased product is:" + totalamount);
			}
		
			else if (amount >=25000 && amount<=50000)
			{
				System.out.println("your product amt:" + amount + "is selected for 25% discoubnt");

				double discountamt = amount * 0.2;
				System.out.println("Discount amount is :" + discountamt);

				double totalamount = amount - discountamt;
				System.out.println("final amount of of purchased product is:" + totalamount);
			}
		else {
			System.out.println("Kindly select the product");
		}
			
		System.out.println("Main method is ended");
		
	}
}
