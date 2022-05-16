package programs;

import java.util.ArrayList;
import java.util.Iterator;

public class Test67 
{
	
	//array list using Iterator
   @SuppressWarnings({ "unchecked", "rawtypes" })
public static void main(String[] args) {
	
	   System.out.println("Main method is started....");
	   
	   @SuppressWarnings("rawtypes")
	ArrayList a  = new ArrayList<>();
	   
	   a.add("shubham");
	   a.add("Nikhil");
	   a.add("Aayush");
	   a.add('C');
	   a.add(2);
	   a.add(1);
	   
	   System.out.println(a);
	   
	   System.out.println("--------------");
	   
	  Iterator itr = a.iterator();
	  
	  while(itr.hasNext())
	  {
		System.out.println(itr.next());
		  
	  }
	   
}
}
