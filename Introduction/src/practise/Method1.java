package practise;

public class Method1 
{
	
	public String rain()
	{
		String str1 ="Hi";
		return str1;
	}
	
 public static void main(String[] args) {
	 System.out.println("Main method is running..");
	
	 Method1 m1  = new Method1();
	 
	   System.out.println(m1.rain());
}
}
