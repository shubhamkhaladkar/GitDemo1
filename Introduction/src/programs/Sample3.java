package programs;

import java.nio.file.DirectoryStream.Filter;
import java.util.stream.Stream;

public class Sample3 {
public static void main(String[] args) {
	
	//to convert into Upper case with condition
	Stream.of("Shubham", "pooja" , "Sharda" ,"Ayush").filter(s-> s.endsWith("a")).map(s-> s.toUpperCase()).
	forEach(s-> System.out.println(s));
	System.out.println("--------------------------------------------");
	//to convert into upper case without condition
	
	Stream.of("Shubham", "pooja" , "Sharda" ,"Ayush").map(s-> s.toUpperCase()).
	forEach(s-> System.out.println(s));
	
	System.out.println("-----------------------------");
	
	//to sort the characters in Alpha order 
	
	Stream.of("Shubham" ,"Aad" , "Bas", "PO" ,"Lk").filter(s-> s.startsWith("A")).sorted()
	.map(s-> s.toUpperCase()).forEach(s-> System.out.println(s));
	
	System.out.println("-----------------------------");
	//to display all array strings in sorted order
	
	 Stream.of("Shubham" ,"Aad" , "Bas", "PO" ,"Lk").sorted().forEach(s-> System.out.println(s));
	
	
}
}
