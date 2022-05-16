package programs;

import java.util.Scanner;

public class Test12
{
public static void main(String[] args) {
	System.out.println("Program started");
	
	Scanner sc1  = new Scanner(System.in);
	
	System.out.println("enter row size: ");
	
	int row = sc1.nextInt();
	
	System.out.println("enter column size: ");
	
	int column = sc1.nextInt();
	
	int arr[][] = new int[row][column];
	
	for (int i = 0; i < arr.length; i++) 
	{
		System.out.println("enter row"+i+"elements");
		
		for (int j = 0; j < arr[i].length; j++) 
		{
		int a = sc1.nextInt();
		arr[i][j]=a;
		}
		
		System.out.println("array elements are: ");
		
		for (int i1 = 0; i1 < arr.length; i1++) 
		{
			for (int j = 0; j < arr[i1].length; j++)
			{
				System.out.println(arr[i1][j]+ " ");
			}
		}
		
	}
	
	System.out.println("program ended");
}
}
