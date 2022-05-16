package programs2;

public class Downcasting2 extends Downcasting1 {
	@Override
	public void sample1() {
		System.out.println("sample1 method is running");
	}

	@Override
	public void sample2() {
		System.out.println("sample2 method is running");
	}

	public void test() {
		System.out.println("test method is running");
	}

	public static void main(String[] args) {

		System.out.println("Main method is running...");

		Downcasting1 d1 = new Downcasting2(); // upcasting
		Downcasting2 d2 = (Downcasting2) d1; // downcasting

		d2.sample1();
		d2.sample2();
		d2.test();

		System.out.println("Main method ended...");
	}
}
