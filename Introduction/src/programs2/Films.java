package programs2;

import java.util.ArrayList;
import java.util.Iterator;

public class Films {
	@SuppressWarnings({ "unchecked", "unchecked" })
	public static void main(String[] args) {

		System.out.println("Main method started..");

		ArrayList hero = new ArrayList<>();

		hero.add("Shubham");
		hero.add("Nikhil");
		hero.add("Ayush");

		ArrayList herion = new ArrayList<>();

		herion.add("Shubhangi");
		herion.add("Nikita");
		herion.add("aayushi");

		ArrayList films = new ArrayList<>();

		films.add("Thakur");

		films.addAll(hero);

		films.addAll(herion);

		System.out.println("Film elements are:");

		Iterator itr = films.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

		System.out.println("--------------------");

		System.out.println(films.contains("Shubham"));
		System.out.println(films.containsAll(herion));

		System.out.println("--------------------");
		films.remove("Shubham");

		System.out.println(films.contains("Shubham"));

		System.out.println(hero.contains("Shubham"));

		System.out.println("--------------------");

		films.removeAll(herion);

		System.out.println(films.contains("sambi"));

		System.out.println(films.containsAll(herion));
		
		System.out.println("--------------------");

		Iterator itr1 = films.iterator();

		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

	}
}
