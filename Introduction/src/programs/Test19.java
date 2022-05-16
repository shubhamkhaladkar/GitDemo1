package programs;

public class Test19 
{
  int a;
  
  int b;
  
  {
	  System.out.println("running non static block");
	  
	 System.out.println(a);
	 
	 System.out.println(b);
	 
	 a=30;
	 
	 b=46;
	 
	 System.out.println("stopped non static block");
	 
  }
  
  public static void main(String[] args) 
  {
	System.out.println("main method started");
	
	Test19 t1 = new Test19();
	
	System.out.println(t1.a);
	
	System.out.println(t1.b);
	
	System.out.println("Main method ended");
}
}
