package javabasic1;

public class GlobalVarialble 
{
	static int a =19;
	
	int b=23;
	
	
	
  public static void main(String[] args) {
	
	  int a =10;
	  
	  System.out.println(a);
	  System.out.println(GlobalVarialble.a);
	  GlobalVarialble gb=  new GlobalVarialble();
	  
	  System.out.println(gb.b);
	  
	  
}
}
