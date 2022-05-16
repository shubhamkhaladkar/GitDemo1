package programs;

import java.util.ArrayList;
import java.util.Iterator;

public class Test69 {
	public static void main(String[] args) {
		System.out.println("Main method is started..");

		ArrayList a = new ArrayList<>();

		a.add("Shubham");

		a.add("Nikhil");

		a.add("Ayush");
		Iterator itr = a.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

		System.out.println("-------------------");

		ArrayList a1 = new ArrayList<>();

		a1.add("Sambhaji");

		a1.add("Vikrant");

		a1.add("Ajit");

		Iterator itr1 = a1.iterator();

		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

		System.out.println("-------------------");

		ArrayList a2 = new ArrayList<>();

		a2.add("Sharda");

		a2.add("chetana");

		a2.add("Nikita");

		Iterator itr2 = a2.iterator();

		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

		System.out.println("Main method is stopped..");

	}

}
