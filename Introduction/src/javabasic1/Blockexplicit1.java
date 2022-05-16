package javabasic1;

public class Blockexplicit1 {
	static {
		System.out.println("Static block started..");
		System.out.println("--------");
		System.out.println("static block ended..");
	}

	{
		System.out.println("Non static block started..");
		System.out.println("--------");
		System.out.println("Non static block ended..");
	}

	public static void main(String[] args) throws ClassNotFoundException {

		Blockexplicit1 b1 = new Blockexplicit1();

		Class.forName("Blockexplicit1");

	}
}
