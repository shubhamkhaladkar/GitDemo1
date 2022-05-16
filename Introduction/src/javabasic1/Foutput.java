package javabasic1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Foutput
{
 public static void main(String[] args) throws IOException {
	 
	 String str = "C:\\Selenium4\\Demo\\Test1.txt";
	
	 FileOutputStream fo  = new FileOutputStream(str);
	 
	 fo.write('A');
	 
	 FileOutputStream fo1  = new FileOutputStream(str);
	 
	 String str1 ="ABCD";
	 byte[] rv = str1.getBytes();
	 fo1.write(rv);
}
}
