package programs;

import java.util.ArrayList;

public class Test68 
{
	public static void main(String[] args) {
		System.out.println("Main method is started...");
		
		
		ArrayList  a  = new ArrayList ();
		
		a.add(1);
		a.add("shubh");
		a.add('A');
		a.add(23.8);
		
		for (int i = 0; i <a.size(); i++)
		{
			 System.out.println(a.get(i));
		}
		
		
		System.out.println("Main method is stopped...");
	}

}
