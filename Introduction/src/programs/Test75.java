package programs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

@SuppressWarnings("unused")
public class Test75 
{
	//linkedlist
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		System.out.println("Main method is started..");

		LinkedList l1 = new LinkedList<>();

		l1.add("shubham");
		l1.add("Nikhil");
		l1.add(22);
		l1.add(21);
		l1.add(null);
		l1.add('C');

		Iterator itr = l1.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("-------------");
		l1.addFirst("Mr.");
		l1.addLast('K');
		System.out.println(l1);
		System.out.println("--------------");
		l1.removeFirst();
		l1.removeLast();
		System.out.println(l1);
		System.out.println("--------------");
		l1.offerFirst("blank");
		l1.offerLast("Shubh");
		System.out.println(l1);
		System.out.println("--------------");
		System.out.println(l1.poll());
		System.out.println("--------------");
		System.out.println(l1.peek());
		System.out.println("--------------");
		System.out.println(l1.peekFirst());
		System.out.println("--------------");
		System.out.println(l1.peekLast());
		System.out.println("--------------");
		System.out.println(l1.pollFirst());
		System.out.println("--------------");
		System.out.println(l1.pollLast());
		System.out.println("Main method is stopped..");

	}
}
