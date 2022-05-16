package programs2;

import java.util.ArrayList;
import java.util.Collections;

public class Utlity {
	public static void main(String[] args) {

		ArrayList a1 = new ArrayList<>();

		a1.add(12);
		a1.add(34);
		a1.add(43);
		a1.add(1);

		System.out.println(a1);

		System.out.println("-------------------------");

		Collections.reverse(a1);

		System.out.println(a1);
		System.out.println("-------------------------");

		Collections.sort(a1);

		System.out.println(a1);
		
		 System.out.println("-------------------------");
		 
		 Collections.shuffle(a1);
		 
		 System.out.println(a1);
	}
}
