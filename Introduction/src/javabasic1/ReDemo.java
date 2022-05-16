package javabasic1;

public class ReDemo {
 public static void main(String[] args) {
	
	 String str ="madam";
	 String s ="";
	 
	 for(int i =str.length()-1; i>=0; i--)
	 {
		 s = s+ str.charAt(i);
	 }
	 System.out.println(s);
	 
	 if(str.equals(s))
	 {
		 System.out.println("Given string is palindrome");
	 }
}
}
