package javabasic1;

import java.util.ArrayList;
import java.util.Collections;

public class col1 {
	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(12);
		a.add(2);
		a.add(23);
		a.add(12);
		a.add(0);
		a.add(99);

		System.out.println(Collections.max(a));
		System.out.println("---------");
		System.out.println(Collections.min(a));
		System.out.println("---------");
		Collections.reverse(a);
		System.out.println(a);
		System.out.println("---------");
		Collections.shuffle(a);
		System.out.println(a);
		System.out.println("---------");
		Collections.swap(a, 2, 4);
		System.out.println(a);
		System.out.println("---------");
		Collections.replaceAll(a, 23, 24);
		System.out.println(a);

	}
}
