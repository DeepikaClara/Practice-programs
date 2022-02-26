package basics3;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Arraylist3 {
	public static void main(String args[])
	{
List<String> a=new ArrayList<String>();
a.add("Amutha");//adding elements
a.add("Jaya");
a.add("Shanmugam");
a.add("Kamatchi");
System.out.println(a);
System.out.println("------------------------------");
System.out.println("Traversing using list iterator");
ListIterator<String> l=a.listIterator(a.size());
	while(l.hasPrevious())//in reverse order
		System.out.println(l.previous());
	System.out.println("------------------------------");
	System.out.println("traversing using for loop");
	for(int i=0;i<a.size();i++)
		System.out.println(a.get(i));
	System.out.println("------------------------------");
	a.forEach(c->{//using for each -lambda empression
	System.out.println(c);
	});
	System.out.println("------------------------------");
	l.forEachRemaining(c->//using for each remaining - lambda expression
	{System.out.println(c);
	});
	}
	
}
