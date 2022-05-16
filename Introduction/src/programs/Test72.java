package programs;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Test72 {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		// vector class

		System.out.println("Main method is started");

		Vector v1 = new Vector<>();

		System.out.println("Capcity:" + v1.capacity());
		System.out.println("-----------");
		System.out.println("Size:" + v1.size());
		System.out.println("-----------");
		v1.add(12);
		v1.add(21);
		v1.add(1);
		v1.add("Shubham");
		v1.add('c');

		Iterator itr = v1.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Capcity:" + v1.capacity());
		System.out.println("-----------");
		System.out.println("Size:" + v1.size());

		// legacy methods of vector class

		v1.addElement("sam");

		Enumeration tr = v1.elements();
		while (tr.hasMoreElements()) {
			System.out.println(tr.nextElement());
		}
		System.out.println("-----------");
		System.out.println(v1.capacity());
		System.out.println(v1.elementAt(3));
		System.out.println(v1.firstElement());
		System.out.println(v1.lastElement());

		System.out.println("-----------");

		v1.remove(3);
		while (tr.hasMoreElements()) {
			System.out.println(tr.nextElement());
			System.out.println("-----------");
			v1.removeAllElements();

			System.out.println(v1);
		}

	}
}
