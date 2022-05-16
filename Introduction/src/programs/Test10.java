package programs;

public class Test10 
{
 public static void main(String[] args)
 {
	//how to create two dimensional array
	 
	 System.out.println("Program started");
	 
	 int arr[][] = new int[3][3];
	 
	 arr[0][0]=3;
	 arr[0][1]=1;
	 arr[0][2]=2;
	 
	 arr[1][0]=7;
	 arr[1][1]=0;
	 arr[1][2]=9;
	 
	 arr[2][0]=4;
	 arr[2][1]=5;
	 arr[2][2]=6;
	 
	 System.out.println(arr[1][2]);
	 
	 System.out.println("----------------");

	 //rows
	 for (int i = 0; i < arr.length; i++)
	 {
		 //columns
		 
		for (int j = 0; j <arr[i].length; j++) 
		{
			System.out.println(arr[i] [j] + " ");
		}
	}
	 
	 System.out.println("program ended");
	 
}
}
