package javabasic1;

import java.util.Iterator;
import java.util.Vector;

public class Vc1 {
	public static void main(String[] args) {
		Vector v1 = new Vector<>();
		v1.add("shubham");
		v1.add("Nikhil");
		v1.add(null);
		v1.add('c');
		v1.add(26);
		v1.add(9);
		Iterator itr = v1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("----");
		v1.addElement("Shivam");
		Iterator itr1 = v1.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("----");
		System.out.println(v1.firstElement());
		System.out.println("----");
		System.out.println(v1.lastElement());
		System.out.println("----");
		v1.set(2, 'c');
		System.out.println(v1);
		System.out.println("----");
		v1.setElementAt(12, 3);
		System.out.println(v1);
		System.out.println("----");
		v1.remove(2);
		System.out.println(v1);
		v1.removeElement(1);
		System.out.println("----");
		System.out.println(v1);
		System.out.println("----");
		v1.removeAllElements();
		System.out.println(v1);
	}
}
