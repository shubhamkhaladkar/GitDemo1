package programs;

public class Test22 {
	String usernmae;
	String password;
//constructor
	Test22() {
		System.out.println("Constructor started");

		usernmae = "shubham";
		password = "shubham";
	}

	public void details() {
		System.out.println("details method is started");

		System.out.println("Username:" + usernmae);

		System.out.println("Password:" + password);

		System.out.println("Details method ended");
	}

	public static void main(String[] args) {
		System.out.println("Main method is started");

		Test22 t = new Test22();
		t.details();

		System.out.println("Main method ended");
	}
}
