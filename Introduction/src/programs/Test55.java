package programs;

public class Test55 {
	public static void main(String[] args) {

		System.out.println("Main method is started.........");

		String s = "Hi";

		String s1 = "Hello";

		String s2 = "Hi";

		System.out.println(s.equals(s1)); // used to check content comparision operation.

		System.out.println(s == s1); // used to check the address

		System.out.println("-----------------------------------");

		System.out.println(s.equals(s2));

		System.out.println(s == s2);

		System.out.println("Main method is stopped.........");
	}
}
