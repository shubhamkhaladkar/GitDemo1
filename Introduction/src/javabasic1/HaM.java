package javabasic1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HaM {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<>();
		
		hm.put(12, "Mango");
		hm.put(23, "Shubham");
		hm.put(11, "bro");
		hm.put(11, null);
		
		System.out.println(hm);
		
		for(Map.Entry<Integer, String> m :hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
