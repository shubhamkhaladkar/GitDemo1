package programs2;

public class Multilevel3 extends Multilevel2 {
	public void test5() {
		System.out.println("Test5 method is running..");
	}

	public void test6() {
		System.out.println("Test6 method is running..");
	}

	public static void main(String[] args) {

		Multilevel3 m3 = new Multilevel3();

		m3.test1();
		m3.test2();
		m3.test3();
		m3.test4();
		m3.test5();
		m3.test6();

		System.out.println("---------------------------");

		Multilevel2 m2 = new Multilevel2();

		m2.test1();
		m2.test2();
		m2.test3();
		m2.test4();

		System.out.println("----------------------------------------");
		
		Multilevel1  m1  = new Multilevel1();
		
		m1.test1();
		m1.test2();

	}
}
