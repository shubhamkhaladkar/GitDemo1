package programs;

public class Test53 {
	public static void main(String[] args) {

		System.out.println("Main method is started");

		Test52 t = () -> System.out.println("queue is started");
		t.queue();// until and unless if don't use this command it's not going to display text
					// present in syso

	}
}
