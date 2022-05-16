package programs;

public class Test27 
{
	//multilevel inheritance
 public void  texting()
 {
	 System.out.println("Testing feature is available");
 }
}

 class Whatsapp1 extends Test27 
 {
	void multimedia()
	{
		System.out.println("Multimedia fetaure is available");
	}
 }
 
 class Whatsapp2 extends Whatsapp1
 {
	 void calling()
	 {
		 System.out.println("calling feature is available");
	 }
	 
 }