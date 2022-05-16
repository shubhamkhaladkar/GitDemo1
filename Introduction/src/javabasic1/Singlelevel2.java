package javabasic1;

public class Singlelevel2 extends Singlelevel1
{
  public void getdata2()
  {
	  System.out.println("getdata2 method is running..");
  }
  
  public static void main(String[] args) {
	
	  Singlelevel1 s1  = new Singlelevel1();
	  s1.getdata1();
	  System.out.println("---------------------");
	  
	  Singlelevel2 s2  = new Singlelevel2();
	  
	  s2.getdata1();
	  s2.getdata2();
}
}
