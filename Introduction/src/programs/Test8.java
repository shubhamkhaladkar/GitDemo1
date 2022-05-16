package programs;

public class Test8 
{
 public static void main(String[] args) 
 {
	 System.out.println("Program started");
	 
	 //character array
	 char arr[] = {'s','h','u','b','h','a','m'};
	 
	 for (int i = 0; i <arr.length; i++) 
	 {
		System.out.println(arr[i]);
	}
	 
	 System.out.println("------------------");
	 
	 //single dimension array
	 // integer array
	 
	 int arr1[] = new int[6];
	 
	 arr1[0] =6;
	 arr1[1] =0;
	 arr1[2] =3;
	 arr1[3] =7;
	 arr1[4] =1; 
	 arr1[5] =2;
	 
	 System.out.println(arr1[1]);
	 
	 System.out.println("------------------");
	 
	 
	 for (int i = 0; i < arr1.length; i++) 
	 {
		System.out.println(arr1[i]);
	}
	 
	 
}
}