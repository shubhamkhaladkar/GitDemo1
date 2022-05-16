package programs;

public class Test56 extends Object{
	protected void finalize() {

	}

	int a = 10;

	int b = 20;

	public static void main(String[] args) {

		System.out.println("Main method is started....");

		Test56 t = new Test56(); // refernced object
		System.out.println(t.a);

		System.out.println("---------------------");

		new Test56(); // de-refernce object

		System.out.println(new Test56().a);
		
		t = null;
		System.gc();

	}
	
	
}
