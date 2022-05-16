package programs3;

public class Prac16 
{
public static void main(String[] args) {
	System.out.println("Main method  started..");
	
	int lines =5;
	
	int charcount=1;
	
	char ch ='A';
	
	for (int i =1; i <=lines; i++)
	{
	 for (int j =1; j <=charcount; j++) 
	 {
	  System.out.print(ch);
	  ch++;
	}
	 System.out.println();
	 charcount++;
	 ch='A';
	}
	System.out.println("Main method started..");
}
}
