package programs;

import java.util.ArrayList;

public class Test66 {
	// Array list

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		System.out.println("Main method is started.......");

		@SuppressWarnings("rawtypes")
		ArrayList a = new ArrayList<>();

		a.add(12);
		a.add("Hi");
		a.add('A');
		a.add(21);
		a.add(1);

		System.out.println(a);

		System.out.println("-------------");

		a.add("shubham");

		System.out.println(a);

		System.out.println("-------------");

		System.out.println("is empty:" + a.isEmpty());

		System.out.println("-------------");

		System.out.println("Size of arraylist:" + a.size());

		System.out.println("-------------");

		System.out.println("Contains:" + a.contains("shubham"));

		System.out.println("-------------");

		a.remove(3);
		System.out.println(a);

		System.out.println("-------------");

		a.clear();

		System.out.println(a);

		System.out.println("-------------");

		a.add(24.5);

		a.trimToSize();

		System.out.println(a);

		System.out.println("-------------");

		System.out.println("Main method is stopped........");

	}
}
