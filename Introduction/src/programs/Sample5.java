package programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sample5 
{
 public static void main(String[] args)
 {
	 
	 //collector method
	 
	 List<String> rv = Stream.of("Abhijeet","Sahil", "Shubham")
	.filter(s-> s.endsWith("l")).map(s-> s.toUpperCase()).collect(Collectors.toList());
	 System.out.println(rv.get(0));
	 
	 
	 System.out.println("-----------------------------");
	 
	 
	 //to convert arrays into the array list below method is used
    List<Integer> sam = Arrays.asList(2,3,1,5,9,4,1,6);
    
    //print unique number
    
    sam.stream().distinct().forEach(s-> System.out.println(s));
    
    System.out.println("--------------------------");
    
    //sort the element in descending order
    
    sam.stream().distinct().sorted().forEach(s-> System.out.println(s));
    
    
    System.out.println("----------------------------------");
    
    
    //to display an integer by index
    
    List<Integer> rd = sam.stream().distinct().sorted().collect(Collectors.toList());
    
    System.out.println(rd.get(3));
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
}
