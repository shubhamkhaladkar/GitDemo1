package programs2;

public class PrintstackTrace
{
  public static void main(String[] args) {
	
	  System.out.println("Main method started..");
	  
	  try 
	  {
		System.out.println(10/0);
	  } 
	  catch (ArithmeticException ae)
	  {
		ae.printStackTrace();
		
		System.out.println(ae.getMessage());
	  }
	  
	  System.out.println("Main method ended..");
}
}
