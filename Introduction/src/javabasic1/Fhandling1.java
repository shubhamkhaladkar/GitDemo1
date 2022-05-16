package javabasic1;

import java.io.File;

public class Fhandling1 {
	public static void main(String[] args) {

		Fhandling1 fh1 = new Fhandling1();

		String str = "C:\\Selenium4\\Demo1";

		File f = new File(str);
		if (f.exists()) {
			f.delete();
			System.out.println("folder deleted successfully..");
		} else {
			System.out.println("Folder not found..");
		}
	}
}
