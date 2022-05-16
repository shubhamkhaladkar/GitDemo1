package programs2;

import java.util.Scanner;

public class Scan1 {
 public static void main(String[] args) {
	
	 System.out.println("Main method started...");
	 
	 Scanner  sc1  = new Scanner(System.in);
	 System.out.println("enter number here:");
	 int rv = sc1.nextInt();
	 
	 if (rv/2==0) 
	 {
		System.out.println("Number is even"); 
	 }
	 
	 else 
	 {
		 System.out.println("Number is odd");
	 }
	 
	 System.out.println("Main method ended..");
}
}
