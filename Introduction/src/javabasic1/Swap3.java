package javabasic1;

public class Swap3 {
	static int a = 10;

	public static void main(String[] args) {

		int b = 20;

		System.out.println(Swap3.a);
		System.out.println(b);

		System.out.println("-----------");

		a = Swap3.a + b;
		b = Swap3.a - b;
		a = Swap3.a - b;

		System.out.println(Swap3.a);
		System.out.println(b);

	}
}
