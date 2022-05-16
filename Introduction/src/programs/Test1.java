package programs;

public class Test1 
{
	
	static int a= 10; //static variable
	
	int b= 20; //non static variable
	
	
 public static void main(String[] args) 
 {
	 System.out.println("Program started");
	int c = 30; //local vairable
	
	System.out.println(c);
	
	System.out.println(Test1.a);
	
	Test1 t = new Test1();
	
	System.out.println(t.b);
	
	System.out.println("program ended");
	
}
}
