package programs;

public class Test6 {
	public static void main(String[] args) {

		System.out.println("program started ....");

		StringBuilder str = new StringBuilder("Shubham");

		System.out.println(str.capacity());

		System.out.println(str);

		System.out.println("-----------------");

		StringBuilder str1 = new StringBuilder();

		str1.append("Nikhil");

		System.out.println(str1.capacity());

		System.out.println(str1);

		System.out.println("-----------------");

		StringBuilder str2 = new StringBuilder();

		str2.append("1234566");

		System.out.println(str.capacity());

		System.out.println(str2);

		System.out.println("-----------------");
		
		StringBuilder str4=  new StringBuilder();
		str4.append("60.0");
		System.out.println(str4.capacity());
		
		System.out.println(str4);
		
		System.out.println("Program ended...");
	}
}
