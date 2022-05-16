package javabasic1;

public class Constructor1 {
	static {
		System.out.println("static block started..");
		System.out.println("-----");
		System.out.println("Static block ended..");

	}

	{
		System.out.println("Non static block started..");
		System.out.println("-----");
		System.out.println("Non static block ended..");
	}
	
	String a;
	
	String b;
	
	public Constructor1()
	{
	  System.out.println("constructor1 is started..");
	  
	  a= "shubham";
	  b="shubha";
	  System.out.println(a);
	  System.out.println(b);
	  System.out.println("constructor1 is ended..");
	  
	}
	
	public static void main(String[] args) {
		Constructor1 c1 = new Constructor1();
		
	}
}
