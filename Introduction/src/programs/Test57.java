package programs;

import java.util.ArrayList;

public class Test57 {
	public static void main(String[] args) {

		System.out.println("Program started...");

		ArrayList a = new ArrayList<>();

		a.add(1);
		a.add("Hi");
		a.add('a');

		Object a1 = a.clone();

		System.out.println(a);
		System.out.println("--------------");
		System.out.println(a1);
		System.out.println("--------------");
		a.add("shubham");
		System.out.println(a);

		System.out.println("Program ended");

	}
}
