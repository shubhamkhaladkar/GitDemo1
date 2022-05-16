package programs2;

import java.io.File;

public class FileOperation1 
{
 public static void main(String[] args) {
	System.out.println("Main method started..");
	
	String str1 ="C:\\Users\\khala\\OneDrive\\Desktop\\New\\shubh";
	
	String str2 ="";
	
	File  f1  = new File(str1);
	
	if (f1.exists()) 
	{
		System.out.println("Folder already created Successfully");
		f1.delete();
		System.out.println("Folder deleted successfully");
	} 
	else 
	{
         f1.mkdir();
         
         System.out.println("Folder created successfully");
	}
}
}
