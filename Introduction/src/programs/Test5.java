package programs;

public class Test5 
{
  
	
	public int me()
	{
		int a= 10;
		
		System.out.println("value of a is:"+a);
		return a;
		
	
	}
	
	
	public String test()
	{
		String str ="shubham";
		return str;
	}
	
	
	
	
	public static void main(String[] args) 
	{
		Test5 t = new Test5();
		
		System.out.println(t.test());
		
	
		System.out.println(t.me());
		
		
		
		
	 
	}

	
}
