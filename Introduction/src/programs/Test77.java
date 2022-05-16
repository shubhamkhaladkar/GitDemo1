
package programs;

import java.util.Iterator;
import java.util.TreeSet;

public class Test77 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("Main method is started....");

		TreeSet<String> t1 = new TreeSet<String>();
		t1.add("Shubham");
		t1.add("Sambhaji");
		t1.add("C");
		t1.add("21");

		Iterator<String> itr = t1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("--------------");
		Iterator<String> itr1 = t1.descendingIterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

		System.out.println("Main method is stopped...");

	}
}
