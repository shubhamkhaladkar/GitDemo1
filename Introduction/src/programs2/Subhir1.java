package programs2;

public class Subhir1 extends Hira1 {
	public void sub1() {
		System.out.println("Sub1 method is running..");
	}

	public void sub2() {
		System.out.println("Sub2 method is running..");
	}

	public static void main(String[] args) {
		Subhir1 h1 = new Subhir1();

		h1.demo1();
		System.out.println("------------------");
		h1.demo2();
		System.out.println("------------------");
		h1.sub1();
		System.out.println("------------------");
		h1.sub2();
	}
}
