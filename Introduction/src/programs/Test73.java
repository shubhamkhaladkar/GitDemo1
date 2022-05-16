package programs;

import java.util.Stack;

public class Test73 {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		System.out.println("Main method is started");

		Stack s = new Stack<>();

		s.push("shubham");
		s.push("nikhil");
		s.push(12);
		s.push('s');
		s.push(23);
		s.push(null);
		System.out.println(s);
		System.out.println("-----------");
		s.pop();
		System.out.println(s);
		System.out.println("-----------");
		s.peek();
		System.out.println(s);
		System.out.println("-----------");
		s.pop();
		System.out.println(s);
		System.out.println("main method is stopped");
		
	System.out.println(s.capacity());

	}
}
