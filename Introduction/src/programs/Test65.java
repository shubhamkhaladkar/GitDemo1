package programs;

public class Test65 {
	public static void main(String[] args) throws InterruptedException {

		System.out.println("Main method is started.........");

		Test64 t = new Test64();

		Test64 t1 = new Test64();

		Test64 t2 = new Test64();

		t.start();
        t.join();
		t1.start();
        t1.join();
		t2.start();
        t2.join();
		System.out.println("Main method is stopped......");
	}
}
