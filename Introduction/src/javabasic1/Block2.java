package javabasic1;

public class Block2 {
	{
		System.out.println("non static block started..");
		int c = 34;
		int d = 45;
		System.out.println(c);
		System.out.println(d);
		System.out.println("non static block ened..");
	}

	public static void main(String[] args) {

		System.out.println("main mehtod is started..");
		
		Block2 b2  = new Block2();
	}
}
