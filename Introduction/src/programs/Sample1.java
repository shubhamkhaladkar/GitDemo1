package programs;

import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Sample1 
{
 public static void main(String[] args) {
	
  ArrayList<String> str = new ArrayList<String>();
	  
	  str.add("shubham");
	  str.add("Nikhil");
	  str.add("sambhaji");
	  str.add("sharda");
	  str.add("ayush");
	  str.add("pooja");
	  
	 long rv = str.stream().filter(s-> s.startsWith("p")).count();
	 
	 System.out.println(rv);
	 
	 
	 long dem = Stream.of("shubham", "ayush" ,"Sam").filter(s-> s.startsWith("a")).count();
	 
	 System.out.println(dem);
}
}
