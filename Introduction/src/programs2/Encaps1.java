package programs2;

public class Encaps1 
{
 private int pin =1234;
 
 public int getpin()
 {
	 return pin;
 }
 
 public void setpin(int pin)
 {
	 this.pin=pin;
 }
 
 public static void main(String[] args) {
	Encaps1 e1  = new Encaps1();
	
	System.out.println(e1.getpin());
	
	e1.setpin(2345);
	System.out.println("----");
	System.out.println(e1.getpin());
}
}
