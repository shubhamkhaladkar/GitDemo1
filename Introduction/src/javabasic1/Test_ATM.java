package javabasic1;

public class Test_ATM {
	public static void main(String[] args) {

		System.out.println("main mehtod is started...");

		Atm a = new Atm();
		System.out.println(a.getpin());
		System.out.println("---------");
		a.setpin(1233);
		System.out.println(a.getpin());

		System.out.println("main method is ended..");

	}
}
