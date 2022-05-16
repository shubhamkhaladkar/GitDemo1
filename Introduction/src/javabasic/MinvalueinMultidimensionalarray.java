package javabasic;

public class MinvalueinMultidimensionalarray 
{
   public static void main(String[] args) {
	
	   int b[][]= {{3,56,6},{2,0,3},{7,8,1}};
	   
	   int min= b[0][0];
	   
	   for (int i = 0; i <3; i++) 
	   {
		for (int j = 0; j <3; j++) 
		{
			if (b[i][j]<min) 
			{
			  min=b[i][j];	
			}
		}
	}
	 System.out.println(min);  
}
}
