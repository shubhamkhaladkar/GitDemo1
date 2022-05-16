package javabasic;

public class Arrays1
{
 public static void main(String[] args) {
	 int a []= new int[5];
	 a[0]=12;
	 a[1]=1;
	 a[2]=34;
	 a[3]=9;
	 a[4]=4;
	 
	 System.out.println(a[1]);
	 
	 System.out.println("------");
	 
	 for (int i = 0; i < a.length; i++)
	 {
	  System.out.println(a[i]);	
	}
	 System.out.println("------");
	 int b[] = {1,34,21,45,78,90};
	 
	 for (int i = 0; i < b.length; i++) 
	 {
	  System.out.println(b[i]);	
	}
	 
 
 
 }
}
