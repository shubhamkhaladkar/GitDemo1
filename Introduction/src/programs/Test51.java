package programs;

public interface Test51 {
	public static void main(String[] args) {

		System.out.println("Main method is started");
		System.out.println("-----------------");
		shubham s = new shubham();

		s.brand("Puma");
		s.display("4K");

		System.out.println("-----------------");
		s.brand1("Samsung");
		s.price(40.0);
		System.out.println("-----------------");
		System.out.println("Main method is stopped");
	}
}
