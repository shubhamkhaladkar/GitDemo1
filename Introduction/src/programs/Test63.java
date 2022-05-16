package programs;

public class Test63 {
	public static void main(String[] args) {

		System.out.println("main method is started..");

		Test62 t = new Test62();

		System.out.println("t:" + t);

		System.out.println("ID:" + t.getId());

		System.out.println("Name:" + t.getName());

		t.setName("Shubham");

		System.out.println("Name:" + t.getName());

		System.out.println("Priority:" + t.getPriority());

		t.setPriority(Thread.MIN_PRIORITY);

		System.out.println("Priority:" + t.getPriority());

		t.setPriority(Thread.MAX_PRIORITY);

		System.out.println("Priority:" + t.getPriority());

		System.out.println("State:" + t.getState());

		System.out.println("ISDEAMON:" + t.isDaemon());

		System.out.println("ISALIVE:" + t.isAlive());

		t.setDaemon(true);

		System.out.println("ISDEAMON:" + t.isDaemon());

		System.out.println("ISALIVE:" + t.isAlive());

		System.out.println("Main method is stopped");
	}
}
