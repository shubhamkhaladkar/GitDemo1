package javabasic1;

public class Upcasting2
{
    public static void main(String[] args) {
		Upcasting u1  = new Upcasting1();
		Upcasting1 u2  =  (Upcasting1) u1;
		
		u1.sendkeys();
		u1.sample();
		u1.gettext();
		System.out.println("----");
		u2.fetchdata();
		
	}
}
