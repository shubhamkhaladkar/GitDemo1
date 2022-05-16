package programs;

public class Test29 
{
 //hierarchical inheritance
	
	int a=  10;
	
	int b=  20;
	
	public void details()
	{
		System.out.println("Value of a is: "+a);
		
		System.out.println("Value of b is:"+b);
		
	}
}

class Hire1 extends Test29
{
   void add()
   {
	   System.out.println("addition result:"+(a+b));
	   
	   a= 25;
	   
	   b=23;
   }
}


class Hire2 extends Test29
{
  void substract()
  {
	  
	  System.out.println("Substraction result is:"+(a-b));
	  
	  a= 10;
	  
	  b = 6;
	  
	  
  }
}


class Hire3 extends Test29
{
	void multiple()
	{
		System.out.println("Multiplication result is:"+(a*b));
		
	}
}

class Hire4 extends Test29
{
	
}












