package javabasic1;

import java.util.Scanner;

public class Exception1
{
 public static void main(String[] args) {
	Scanner sc1  = new Scanner(System.in);
	System.out.println("Enter a value: " );
	int a = sc1.nextInt();
	System.out.println("Enter b value: " );
	int b = sc1.nextInt();
	
	int c =0;

	try 
	{
		c=a/b;
	} catch (ArithmeticException as) 
	{
		System.out.println("As handled");
		System.out.println(as.getMessage());
	}
	finally {
		sc1.close();
	}
	
	System.out.println("division result is: "+c);
	
}
}
