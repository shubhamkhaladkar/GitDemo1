package javabasic1;

public class Methodoverriding2 extends Methodoverriding1 {
	@Override
	public void sample() {
		System.out.println("sample method is running..");
	}

	public String demo() {
		String str = "Nikhil";
		return str;
	}

	@Override
	public void test() {
		System.out.println("test method is running...");
	}

	public static void main(String[] args) {
		Methodoverriding2 m2 = new Methodoverriding2();
		m2.sample();
		System.out.println(m2.demo());
		m2.test();

		System.out.println("---------------");

		Methodoverriding1 m1 = new Methodoverriding1();

		m1.sample();
		m1.demo("shubham");
		m1.test();
	}
}
