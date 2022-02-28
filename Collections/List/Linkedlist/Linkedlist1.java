package basics3;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist1 {
	public static void main(String args[])
	{
		LinkedList<String> d=new LinkedList<>();
		d.add("Keerthi");
		d.add("Ramya");
		d.add("Kavya");
		d.add("Ajith");
		System.out.println(d);
		System.out.println("--------------------");
		d.add(1, "Shiva");
		System.out.println(d);
		System.out.println("--------------------");
		LinkedList<String>e=new LinkedList<>();
		e.add("janu");
		e.add("janu");
		e.addAll(1, d);
		System.out.println(e);
		System.out.println("--------------------");
		e.addFirst("Arul");
		e.addLast("Nakul");
		System.out.println(e);
		System.out.println("--------------------");
		Iterator itr=e.iterator();//traverses and prints one by one 
		while(itr.hasNext())
			System.out.println(itr.next());
		e.remove("Ajith");
		System.out.println(e);
		System.out.println("--------------------");
		e.remove(0);
		System.out.println(e);
		System.out.println("--------------------");
		e.addFirst("Kumar");
		System.out.println(e);
		System.out.println("--------------------");
		e.removeFirst();
		e.removeLast();
		e.add("Shiva");
		System.out.println(e);
		System.out.println("--------------------");
		e.removeFirstOccurrence("janu");
		e.removeLastOccurrence("Shiva");
		System.out.println(e);
		System.out.println("--------------------");
		e.removeAll(d);
		System.out.println(e);
		System.out.println("--------------------");
		e.clear();
		System.out.println(e);
		System.out.println("--------------------");
		Iterator itr1=d.descendingIterator();//traverses from reverse order
		while(itr1.hasNext())
			System.out.println(itr1.next());
		
		
	}

}
