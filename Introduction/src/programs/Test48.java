package programs;

public class Test48 
{
	//static method
	static void details1() {
		System.out.println("Details1 method is running");
	}

	//non static method
	void details2() {
		System.out.println("Details2 method is running");
	}

	public static void main(String[] args) {

		System.out.println("Main method is running");

		Test48.details1(); // accessing static method

		Test48 t = new Test48();  //created object of the class

		t.details2();  //accessing the non static method

		System.out.println("Main method is stopped");
	}
}
