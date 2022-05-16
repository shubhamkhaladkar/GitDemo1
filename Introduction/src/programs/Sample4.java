package programs;

import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Sample4 {
	public static void main(String[] args) {

		// to merge two array lsit by stream.

		ArrayList<String> a = new ArrayList<String>();

		a.add("Nikhil");
		a.add("Ayush");
		a.add("satish");

		ArrayList<String> a1 = new ArrayList<String>();

		a1.add("Shubham");
		a1.add("Sonu");
		a1.add("Monu");

		a1.stream().filter(s -> s.startsWith("S")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));
		
		System.out.println("------------------");
		
		Stream<String> rv = Stream.concat(a.stream(), a1.stream());
		rv.sorted().forEach(s -> System.out.println(s));

	}
}
