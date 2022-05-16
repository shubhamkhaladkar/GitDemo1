package javabasic;

public class MethodOverloading
{
 public void getdata(int a)
 {
	 System.out.println(a);
 }
 public void getdata()
 {
	 System.out.println("get method is running.");
 }
 
 public void getdata(int a, int b)
 {
	 System.out.println(a);
	 System.out.println(b);
 }
 
 public void getdata(String str)
 {
	 System.out.println(str);
 }
 
 public static void main(String[] args) {
	MethodOverloading mv  = new MethodOverloading();
	
	mv.getdata();
	mv.getdata(9);
	mv.getdata("Shubham");
	mv.getdata(12,90);
}
 
 
 
}
