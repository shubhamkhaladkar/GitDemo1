package programs3;

import java.util.Scanner;

public class Prac21 
{
 public static void main(String[] args) {
	System.out.println("Main method started...");
	 
	Scanner sc1  = new Scanner(System.in);
	
	System.out.println("Enter number here:");
	
	 int ab = sc1.nextInt();
	 int a=0;
	 
	 int b=1;
	 
	 int c=0;
	 
	 for (int i =1; i <=ab; i++) 
	 {
	 System.out.println(a+",");
	 c=a+b;
	 a=b;
	 b=c;
	}
System.out.println("Main method ended....");	
	
}
}
