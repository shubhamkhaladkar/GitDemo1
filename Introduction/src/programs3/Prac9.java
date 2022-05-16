package programs3;

public class Prac9 
{
 public static void main(String[] args) {
	System.out.println("Main method is started..");
	
	int lines=5;
	
	int starcount=5;
	
	int spacecount =0;
	
	
	for (int i =1; i <=lines; i++) 
	{
	for (int j =1; j <=spacecount; j++)
	{
	   System.out.print(" ");	
	}	
	for (int k = 1; k <=starcount; k++)
	{
	  System.out.print("*");	
	}
	System.out.println();
	starcount--;
	spacecount++;
	}
	System.out.println("Main method is ended..");
}
}
