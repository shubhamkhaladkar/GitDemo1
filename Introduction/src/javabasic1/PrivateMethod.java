package javabasic1;

public class PrivateMethod 
{
  private void sample()
  {
	  System.out.println("Sample method is running..");
  }
  
  public void test()
  {
	  System.out.println("caller method is running..");
	  sample();
  }
}
