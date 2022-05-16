package javabasic1;

import org.testng.reporters.jq.Main;

public class Recurssivecall {
	public static void getdata() {
		System.out.println("Getdata is running..");
	}

	public static void main(String[] args) {
		Recurssivecall.getdata();
		Recurssivecall r1 = new Recurssivecall();
		r1.getdata();
		r1.getdata();
		r1.getdata();
		r1.getdata();
		r1.getdata();
		r1.getdata();
		r1.getdata();
		r1.getdata();r1.getdata();

	}

}
