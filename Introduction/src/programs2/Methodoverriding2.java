package programs2;

public class Methodoverriding2 extends MethodOverriding1 {
	void demo1() {
		System.out.println("Deom1 method is running");
	}

	@Override
	public void sample1() {
		System.out.println("Sample1 method is overrided..");
	}

	@Override
	public void sample2() {
		System.out.println("Sample2 method is overrided..");
	}
	
	public static void main(String[] args) {
		
		Methodoverriding2 m2 = new Methodoverriding2();
		
		m2.sample1();
		System.out.println("----------");
		m2.sample2();
		System.out.println("----------");
		m2.demo1();
		
	}
}
