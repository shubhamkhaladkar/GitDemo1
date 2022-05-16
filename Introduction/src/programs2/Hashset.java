package programs2;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset 
{
  public static void main(String[] args) {
	
	  System.out.println("main method started..");
	  
	  HashSet h1  = new HashSet<>();
	  
	  h1.add(21);
	  h1.add(34);
	  h1.add(56);
	  h1.add(222);
	  h1.add("Shubham");
	  
	  Iterator itr =  h1.iterator();
	  
	  while (itr.hasNext()) {
		System.out.println(itr.next());
		
	}
	  
	  System.out.println("Size of elements:"+h1.size());
	  
	  System.out.println("is empty:"+h1.isEmpty());
	  
	  h1.clear();
	  
	  System.out.println(h1);
	  
	  
	  
}
}
