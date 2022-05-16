package programs;

import java.util.Iterator;
import java.util.LinkedList;

public class Test74 {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		System.out.println("Main method is started");

		LinkedList l1 = new LinkedList<>();

		l1.add("shubham");
		l1.add(34);
		l1.add(21);
		l1.add(45);
		l1.add(null);

		Iterator itr = l1.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		l1.addFirst("khaladkar");
		l1.addLast("shubham");
		System.out.println("-----------");
		System.out.println(l1);

	}
}
