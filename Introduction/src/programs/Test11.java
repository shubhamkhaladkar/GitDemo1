package programs;

import java.sql.Array;
import java.util.Iterator;
import java.util.Scanner;

public class Test11 
{
 public static void main(String[] args) {
	
	 //how to create scanner array object for single dimension array
	 
	 System.out.println("Program started");
	 
	 Scanner sc1  = new Scanner(System.in);
	 System.out.println("Enter digit over here");
	 int rv = sc1.nextInt();
	 
	 int arr[] = new int[rv];
	 
	 System.out.println("enter:"+rv+"value");
	 
	 for (int i = 0; i < arr.length; i++)
	 {
		int a = sc1.nextInt();
		arr[i]=a;
		
	}
	 
  System.out.println("------------------");
  
  System.out.println("array elements are");
  
  for (int i = 0; i < arr.length; i++) 
  {
	System.out.println(arr[i]);
}
}
}
