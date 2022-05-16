package programs;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Sample2 
{
  public static void main(String[] args) {
ArrayList<String> str = new ArrayList<String>();
	  
	  str.add("shubham");
	  str.add("Nikhil");
	  str.add("sambhaji");
	  str.add("sharda");
	  str.add("ayush");
	  str.add("pooja");
	  str.add("toy");
	  
	  str.stream().filter(s-> s.length()>4).forEach(s-> System.out.println(s));
}
}
