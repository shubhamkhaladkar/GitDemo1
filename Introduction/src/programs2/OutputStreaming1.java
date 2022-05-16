package programs2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreaming1 
{
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("Main method is started..");
		
		FileOutputStream fs  = new FileOutputStream("C:\\Users\\khala\\OneDrive\\Desktop\\New\\Text1.txt");
		
		//fs.write('A'); //to inster single character
		
		String text ="Shubham";
		
		byte[] rv = text.getBytes();
		
		fs.write(rv);
		
		FileInputStream fs1 = new FileInputStream("C:\\Users\\khala\\OneDrive\\Desktop\\New\\Text1.txt");
		
		int data = fs1.read();
		
		System.out.println(data);
		
		System.out.println((char)data); //to reterive the single element
		
		int info =0;
		
		while((info=fs1.read())!=-1)
		{
			System.out.println((char)info);
		}
		
		
		
	}
}
