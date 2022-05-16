package javabasic1;

public class Multilevel3 extends Multilevel2 {
	public void logut() {
		System.out.println("log out method is running..");
	}

	public static void main(String[] args) {
		System.out.println("Main method started...");

		Multilevel1 m1 = new Multilevel1();
		m1.signup();
		m1.login();
		System.out.println("---");
		Multilevel2 m2 = new Multilevel2();
		m2.signup();
		m2.login();
		m2.sendtext();
		m2.sendvideo();
		System.out.println("-------------");
		Multilevel3 m3 = new Multilevel3();
		m3.login();
		m3.signup();
		m3.sendtext();
		m3.sendvideo();
		m3.logut();
		System.out.println("---");
		System.out.println("main method ended...");
	}
}
