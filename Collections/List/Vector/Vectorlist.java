package basics3;

import java.util.Vector;

public class Vectorlist {
public static void main(String args[]) {
	Vector<Integer> v=new Vector<>();
	v.add(300);
	v.add(7);
	v.add(4);
	v.add(2,300);
	v.addElement(0);
	System.out.println(v);
	System.out.println("------------------------");
	Vector <String> w=new Vector<>();
	w.add("Ram");
	w.add("Hanuman");
	w.add("Lakshman");
	w.add("Chatrukan");
	w.add("Ratchagan");
	System.out.println(w);
	System.out.println("Size: "+w.size()+" "+"\r\n"+"Default capacity: "+w.capacity());
	if(w.contains("Ram"))
	{
		System.out.println("Ram is present in the index of "+w.indexOf("Ram"));
	}
	else
	{
		System.out.println("Ram is not present");
	}
	System.out.println("first element: "+w.firstElement());
	System.out.println("Last element: "+w.lastElement());
	v.remove((Integer)(300));//removes first occurrence of 300
	System.out.println(v);
	w.removeElementAt(4);
	System.out.println(w);
	
	
	
}
}
