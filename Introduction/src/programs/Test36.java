package programs;

public class Test36 
{
	//how to call private method
		
  private void test()
  {
	  System.out.println("running test method");
  }
  //caller method
  public void calltest()
  {
	  System.out.println("test method is running");
	  
	  test();
	  
  }
}

class Dev extends Test36
{
	
}