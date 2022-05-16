package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Test71 {
	public static void main(String[] args) {

		System.out.println("Main method is started");

		ArrayList a = new ArrayList<>();

		a.add(12);
		a.add(23);
		a.add(10);
		a.add(21);
		a.add(30);

		System.out.println("Before sorting....");
		Iterator itr = a.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

		System.out.println("After sorting..");
		// sort method
		Collections.sort(a);
		Iterator itr1 = a.iterator();

		while (itr1.hasNext()) {
			System.out.println(itr1.next());

		}

		// reverse method
		System.out.println("reversing the arraylist");
		Collections.reverse(a);

		Iterator itr2 = a.iterator();

		while (itr2.hasNext()) {
			System.out.println(itr2.next());

		}

		// shuffle method
		System.out.println("After shuffling...");
		Collections.shuffle(a);
		System.out.println(a);
		// swapping method..

		System.out.println("Swapping the method..");
		Collections.swap(a, 1, 2);
		System.out.println(a);
	}
}
