package javabasic1;

public class Block1 {

	static int a;

	static int b;

	static {
		System.out.println("static block started..");
		int a = 10;
		int b = 20;
		System.out.println(a);
		System.out.println(b);
		System.out.println("static block ended..");

	}

	{
		System.out.println("non static block started..");
		int c = 34;
		int d = 45;
		System.out.println(c);
		System.out.println(d);
		System.out.println("non static block ened..");
	}

	public static void main(String[] args) {
		Block1  b1  = new Block1();
		System.out.println("main method started..");
		System.out.println(Block1.a);
		System.out.println(Block1.b);
		System.out.println("main method ended..");
		
	}
}
