package programs;

import programs.Test14.Dev1;


public class Test15 
{
 public static void main(String[] args)
 {
	 System.out.println("Program started");
	 
	Test14 t1 = new Test14();
	
	System.out.println(t1.a);
	
	
	//created inner class object
	
	Dev1 rv = t1.new Dev1();	
	
	System.out.println(rv.b);
	
	System.out.println("Program ended");
	
	
	
 }
}
