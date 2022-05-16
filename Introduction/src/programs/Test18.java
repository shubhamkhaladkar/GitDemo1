package programs;

public class Test18 
{
public static void main(String[] args)
{
	System.out.println("main method started");
	
	System.out.println(Test17.i);
	System.out.println(Test17.j);
	
	System.out.println("main method ended");
}

static
{
System.out.println("static block of main class is executed");	

}
}
