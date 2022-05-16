package programs2;

public class Arr1 
{
 public static void main(String[] args) {
	
	 System.out.println("Main method is started..");
	 //method1
	 int arr[] = new int[3];
	 
	 arr[0]=21;
	 arr[1]=23;
	 arr[2]=32;
	 
	 System.out.println(arr[1]);
	 System.out.println("----------------");
	 for (int i = 0; i < arr.length; i++) 
	 {
	 System.out.println(arr[i]);	
	}
	 
	 System.out.println("--------------");
	 //method2
	 
	 int arr1[] = {1,32,1,34,5,678,8};
	 
	 for (int i = 0; i < arr1.length; i++) 
	 {
	 System.out.println(arr1[i]);	
	}
	 
}
}
