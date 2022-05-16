package programs2;

public class Block1 
{
	
	static
	{
		System.out.println("static block started..");
	}
	
	{
		System.out.println("Not static block started..");
	}
	
 public static void main(String[] args) {
	
	 System.out.println("Main method started");
	 Block1 b1  = new Block1();
	 System.out.println("Main method ended");
}
}
