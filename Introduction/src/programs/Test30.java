package programs;

public class Test30 {
	public static void main(String[] args) {

		Test29 t = new Test29();

		t.details();

		System.out.println("-------------------");

		Hire1 h1 = new Hire1();

		h1.details();
		h1.add();
		h1.details();
		System.out.println("-------------------");

		Hire2 h2 = new Hire2();

		h2.details();
		h2.substract();
		h2.details();
		System.out.println("-------------------");
		Hire3 h3 = new Hire3();

		h3.details();

		h3.multiple();

		h3.details();
		
		System.out.println("-------------------");
		
		
		Hire4  h4 = new Hire4();
		
		h4.details();
	}
}
