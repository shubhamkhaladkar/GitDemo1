package javabasic1;

public class Sample1 {
	public static void main(String[] args) {

		System.out.println("Main method is started..");

		String str = " shub@hams";

		System.out.println(str.charAt(4));
		System.out.println(str.indexOf('a'));
		System.out.println(str.substring(1, 4));
		System.out.println(str.substring(3));
		System.out.println(str.concat(" abc"));
		System.out.println(str.trim());
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		 String a[]  = str.split("@");
		 System.out.println(a[0]);
		 System.out.println(a[1]);
		 System.out.println(str.replace('s','S'));		 

	}
}
