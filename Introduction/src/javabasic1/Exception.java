package javabasic1;

import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		Exception er = new Exception();
		int a = 10;
		int b = 0;
		try {
			System.out.println(a / b);
		} catch (ArithmeticException as) {
			System.out.println(as.getClass().getName());
			System.out.println("----");

			System.out.println(as.getMessage());
		}

	}
}
