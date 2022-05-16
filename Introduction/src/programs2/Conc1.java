package programs2;

public class Conc1 extends Abs1
{
 @Override
 public void demo1()
 {
	 System.out.println("Demo1 method is running..");
 }
 
 @Override
 public void demo2()
 {
	 System.out.println("Demo2 method is running..");
 }
 
 public static void main(String[] args) {
	
	 Conc1 c1  =  new Conc1();
	 
	 c1.demo1();
	 c1.demo2();
	 
	
	 
}
}
