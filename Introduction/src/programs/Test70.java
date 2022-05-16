package programs;

import java.util.ArrayList;
import java.util.Iterator;

public class Test70 {
	public static void main(String[] args) {
		System.out.println("Main method is started..");

		ArrayList a = new ArrayList<>();
		a.add("Shubham");
		a.add("nikhil");
		a.add("ayush");

		ArrayList a1 = new ArrayList<>();

		a1.add("IT");
		a1.add("Mech");
		a1.add("SSC");

		ArrayList a2 = new ArrayList<>();

		a2.add("Life");

		a2.addAll(a);

		a2.addAll(a1);

		Iterator itr = a2.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("Main method is stopped");
	}
}
