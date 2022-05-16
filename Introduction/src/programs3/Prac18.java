package programs3;

public class Prac18 
{
public static void main(String[] args) {
	
	System.out.println("Main method ended");
	
	for (int i =1; i <=10; i++)
	{
	  if(i==7)
	  {
		  break;
	  }
	  System.out.println(i);
	}
	System.out.println("------");
	for (int j = 1; j <=10; j++)
	{
	if(j==3)
	{
		continue;
	}
	System.out.println(j);
	}
	System.out.println("Main method is ended");
}
}
