package javabasic1;

import java.util.Stack;

public class Demo {
	public static void main(String[] args) {

		Stack st = new Stack<>();

		st.push("shubham");
		st.push("Nikhil");
		st.push('A');
		st.push(12);
		st.push(88);
		System.out.println(st);
		System.out.println("----------");
		System.out.println(st.peek());
		System.out.println("----------");
		System.out.println(st.pop());
		System.out.println("----------");
		System.out.println(st);
		System.out.println("----------");
		System.out.println(st.pop());
		System.out.println("----------");
		System.out.println(st);
		System.out.println("----------");
		System.out.println(st.peek());
		System.out.println("----------");
		System.out.println(st);
	}
}
