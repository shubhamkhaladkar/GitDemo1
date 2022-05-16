package programs;

public class Test28 
{
  public static void main(String[] args) {
	
	  Whatsapp2 w2   = new Whatsapp2();
	  
	  w2.calling();
	  w2.texting();
	  w2.multimedia();
	 
	  
	  System.out.println("-----------------");
	  
	  Whatsapp1 w1  = new Whatsapp1();
	  
	  w1.multimedia();
	  w1.texting();
	  
	  System.out.println("-----------------");
	  
	  Test27 t = new Test27();
	  
	  t.texting();
}
}
