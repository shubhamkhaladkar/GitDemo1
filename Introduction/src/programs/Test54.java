package programs;

public class Test54 {
	// to string method , hash code method , get class

	public static void main(String[] args) {

		System.out.println("Main method is running..");

		Test54 t = new Test54();

		System.out.println(t.toString());

		System.out.println("------------------------");

		System.out.println(t.hashCode());

		System.out.println("------------------------");

		System.out.println(t.getClass().getName());

		System.out.println("Main method is stopped");
	}
}
