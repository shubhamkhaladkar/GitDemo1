package programs;

import org.testng.reporters.jq.Main;

public class Test16 
{
static int a ;

static int b ;


//static block
static
{
  System.out.println("running static block");
  
  System.out.println(a);
  
  System.out.println(b);
  
  a= 22;
  
  b=45;
  
  System.out.println("static block  is stopped");
}
   public static void main(String[] args) 
   {
	System.out.println("Main method is running");
	
	System.out.println(a);
	
	System.out.println(b);
	
	System.out.println("main method is stopped");
}
}
