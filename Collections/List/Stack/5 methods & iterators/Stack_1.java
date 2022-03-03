package basics3;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class Stack_1 {
public static void main(String args[])
{
	Stack<String> s=new Stack<>();
	s.push("Rose");
	s.push("lily");
	s.push("jasmine");
	s.push("marie gold");
	s.push("lotus");
	System.out.println("Stack after push: "+s);
	System.out.println("---------------------");
	s.pop();
	System.out.println("Stack after pop: "+s);

    System.out.println("Stack after peek(top element): "+s.peek());
  
    System.out.println("Stack after search: "+s.search("lily"));//it searches the location
    														//if not present gives-1
    System.out.println("---------------------");
    System.out.println("to check whether stack is empty: "+s.empty());
 
    int size=s.size();
    System.out.println("Size of stack: "+size);
    System.out.println("---------------------");
    Iterator itr=s.iterator();//traversing using iterator
    while(itr.hasNext())
    {
    	System.out.println(itr.next());
    }
    System.out.println("---------------------");
    s.forEach(n->		//traversing using foreach
    {
    	System.out.println(n);
    });
    System.out.println("---------------------");
    ListIterator<String> l=s.listIterator(s.size());//traversing using listiterator
    System.out.println("Iteration over the stack from top to bottom:");
    while(l.hasPrevious())
    {
    	String d=l.previous();
    	System.out.println(d);
    }
}
}
//Note: Stack is a subclass of Vector and a legacy class. 
//It is thread-safe which might be overhead in an environment where thread safety is not needed. 
//An alternate to Stack is to use ArrayDequeue which is not thread-safe and 
//has faster array implementation.
