package programs2;

public class Arr2 
{
  public static void main(String[] args) {
	
	  System.out.println("Main method is started..");
	  
	  int arr[][] = new int[2][2];
	  
	  arr[0][0]=32;
	  arr[0][1]=21;
	  arr[1][0]=44;
	  arr[1][1]=89;
	  
	  for (int i = 0; i < arr.length; i++) 
	  {
		for (int j = 0; j < arr[i].length; j++) 
		{
			System.out.println(arr[i][j]+" ");
		}
	}
	  
	  
	  
}
}
