package javabasic;

public class ChildDemo extends Parentdemo
{
	
	public ChildDemo()
	{super(); //this should be always be first line
		System.out.println("child class cinstructor is running");
	}
 String name= "Shubh";
 public void getdata() 
 {
	 System.out.println("child getdata method is running..");
	 super.getdata();
	 System.out.println(name);
	 System.out.println(super.name);
 }
 public static void main(String[] args) {
	
	 ChildDemo  cd = new ChildDemo();
	 cd.getdata();
			 
}
}
