package programs3;

public class Prac19 {
	public static void main(String[] args) {
		System.out.println("Main mehtod ended");

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FIZZBUZZ");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
		System.out.println("Main method ended..");
	}
}
