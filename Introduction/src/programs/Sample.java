package programs;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class Sample
{
  public static void main(String[] args) {
	

  
	  ArrayList<String> str = new ArrayList<String>();
	  
	  str.add("shubham");
	  str.add("Nikhil");
	  str.add("sambhaji");
	  str.add("sharda");
	  str.add("ayush");
	  str.add("pooja");
	  int count =0;
	  
	  
	  for (int i = 0; i <str.size(); i++) 
	 {
		String rv = str.get(i);
		
		if (rv.startsWith("s")) 
		{
			count++;
		}
	}
	  
	 System.out.println(count); 
	  
	  
	  
	  
  }
}
