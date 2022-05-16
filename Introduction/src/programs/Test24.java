package programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Test24 
{
  public static void main(String[] args) {
	
	  System.out.println("main method is started");
	  
	  int arr[] = {3,4,24,23,5,75,77};
	 //normal array 
	 for (int i = 0; i < arr.length; i++) 
	 {
	 System.out.println(arr[i]);	
	}
	 
	 
	 System.out.println("-------------------------");
	 
	 //sorting array elements in ascending order
	 
	 for (int i = 0; i < arr.length; i++)
	 {
		Arrays.sort(arr);
		
		System.out.println(arr[i]);
	}
	
	 System.out.println("-------------------------");
	 
	 //sorting element in descending order
	 for (int i = arr.length-1; i>=0; i--) 
	 {
		System.out.println(arr[i]);
	}
	  
	 System.out.println("Main method ended");
}
}
