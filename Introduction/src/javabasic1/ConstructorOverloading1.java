package javabasic1;

public class ConstructorOverloading1 
{
	public ConstructorOverloading1(int a) {

		System.out.println(a);
	}

	public ConstructorOverloading1(String str) {
		System.out.println(str);
	}

	public ConstructorOverloading1(double a, double b) {
		System.out.print(a);
		System.out.println(" ");
		System.out.print(b);

	}

	public ConstructorOverloading1(char a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		ConstructorOverloading1 cv = new ConstructorOverloading1(12);
		ConstructorOverloading1 cv1 = new ConstructorOverloading1('a');
		ConstructorOverloading1 cv2 = new ConstructorOverloading1("shubham");
		ConstructorOverloading1 cv3 = new ConstructorOverloading1(23.5, 34.2);

	}
}
