package programs;

public class Test43 
{
  public static void main(String[] args) {
	
	  System.out.println("Main method is started");
	  
	  //upcasting
	  Test42 t = new DSA();
	
	  //downcasting
	  
	 DSA d1 = (DSA) t;
	 
	 d1.rv();
	 
	 d1.rv1();
	 
	 d1.samba();
	  
	 System.out.println("Main method is stoppped");
}
}
