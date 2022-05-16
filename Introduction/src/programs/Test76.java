package programs;

import java.util.HashSet;
import java.util.Iterator;

public class Test76 
{
  @SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) 
  {
	  //hash set
	System.out.println("Main method is started..");
	
	@SuppressWarnings("unused")
	HashSet  h1  = new HashSet<>();
	
	h1.add("shubham");
	h1.add('C');
	h1.add(21);
	h1.add(null);
	h1.add(21);
	Iterator itr = h1.iterator();
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	System.out.println(h1.size());
	System.out.println("----------------");
	System.out.println(h1.isEmpty());
	System.out.println("--------------");
	h1.clear();
	System.out.println(h1);
	
	
}
}
