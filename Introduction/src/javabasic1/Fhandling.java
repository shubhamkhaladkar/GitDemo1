package javabasic1;

import java.io.File;

public class Fhandling {
	public static void main(String[] args) {

		String str = "C:\\Selenium4\\Demo";

		String str2 = "C:\\Selenium4\\Demo1";

		File f = new File(str);
		File f1 = new File(str2);

		if (f.exists()) {
			System.out.println("Folder already created..");
			f.renameTo(f1);
			System.out.println("folder renamed successfully..");
		}

		else {
			f.mkdir();
			System.out.println("Folder created successfully!");
		}
	}
}
