package javabasic1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HaM1 
{
 public static void main(String[] args) {
	
	 System.out.println("Main mehtod is started..");
	 
	 HashMap<Integer, String>  hs  = new HashMap<>();
	 hs.put(12, "Mango");
	 hs.put(23, "Grapes");
	 hs.put(34, "Apple");
	 hs.put(45, "pinapple");
	 
	 for(Map.Entry<Integer, String> m : hs.entrySet())
	 {
		System.out.println(m.getKey()+" "+m.getValue()); 
	 }
	 System.out.println("main method ended");
}
}
