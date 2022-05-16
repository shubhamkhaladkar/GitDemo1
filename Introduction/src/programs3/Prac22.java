package programs3;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Prac22 
{
	public static void main(String[] args) {
		System.out.println("Main method ended");
		
		Scanner sc1  = new Scanner(System.in);
		
		System.out.println("Enter number here: ");
		 int r  = sc1.nextInt();
		 
		 int fact  = 1;
		 
		 for (int i =1; i <=r; i++)  //1*2*3*4*5;
		 {
		  fact =fact*i;	
		}
		 System.out.println("factorial is:"+fact);
		 System.out.println("Method is ended");
		 	
		 
	}
}
