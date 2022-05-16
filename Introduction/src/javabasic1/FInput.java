package javabasic1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FInput 
{
 public static void main(String[] args) throws IOException {
	
	 String str = "C:\\Selenium4\\Demo\\Test1.txt";
	 
	 FileInputStream fs  = new FileInputStream(str);
	 
	int rv = fs.read();
	
	System.out.println(rv);
	
	System.out.println("-------------");
	
	//to retrive the multiplecharacters
	
	FileInputStream fs1  = new FileInputStream(str);
	
	int it =0;
	while((it=fs1.read())!=-1)
	{
		System.out.println((char)it);
	}
	
}
}
