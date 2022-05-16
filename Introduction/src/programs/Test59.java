package programs;

public class Test59 {

	// printstacktrace and //getmessage
	public static void main(String[] args) {
		System.out.println("Main method is started...");

		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException ae) {
			System.out.println("catch block is executing..");
			ae.printStackTrace();
			System.out.println("Catch block is executed.....");
		}

		System.out.println("-----------------------------");

		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			System.out.println("catch block is executing..");
			System.out.println(e.getMessage());
			System.out.println("Catch block is executed.....");
		}
		System.out.println("Main method is stopped..");
	}
}
