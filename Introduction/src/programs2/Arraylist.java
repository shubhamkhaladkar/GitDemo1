package programs2;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
	public static void main(String[] args) {

		System.out.println("Main method is started...");

		ArrayList a1 = new ArrayList<>();

		a1.add(21);
		a1.add("shubham");
		a1.add('A');
		a1.add(34);

		System.out.println("Arraylist is empty:" + a1.isEmpty());

		a1.add(90);

		System.out.println("After adding a value:" + a1);

		a1.remove(3);

		System.out.println("After removing a value: " + a1);

		a1.clear();

		System.out.println(a1);

		a1.add(34);

		System.out.println("after adding a single element:" + a1);
		
		a1.trimToSize();
		
		System.out.println("After trim to size:"+ a1);

		Iterator itr = a1.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

		System.out.println("Maint method is ended..");
	}
}
