package programs;

public class Test13 
{
  public static void main(String[] args) {
	System.out.println("Program started");
	
	int arr1[][] = new int [3][4];
	//first row
	
	arr1[0][0]=1;
	arr1[0][1]=2;
	arr1[0][2]=4;
	arr1[0][3]=9;
	
	//second row
	
	arr1[1][0]=5;
	arr1[1][1]=6;
	arr1[1][2]=1;
	arr1[1][3]=0;

	//third row
	
	arr1[2][0]=6;
	arr1[2][1]=1;
	arr1[2][2]=5;
	arr1[2][3]=8;
	
	System.out.println("Array elememts are: ");
	
	
	for (int i = 0; i < arr1.length; i++) 
	{
		for (int j = 0; j < arr1[i].length; j++) 
		{
			System.out.println(arr1[i][j]);
			
		}
	}
	
	
	System.out.println("---------------------------");
	
	
	
	
	for (int i = 0; i < arr1.length; i++) 
	{
		for (int j = 0; j < arr1[i].length; j++) 
		{
			if (arr1[i][j]%2!=0) 
			{
				System.out.println(arr1[i][j]);
			}
		}
	}
	
	
	
	
}
}
