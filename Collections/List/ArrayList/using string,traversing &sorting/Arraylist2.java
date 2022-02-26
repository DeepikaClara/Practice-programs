package basics3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Arraylist2 {
	public static void main(String args[])
	{
List<String> a=new ArrayList<String>();
a.add("Amutha");//adding elements
a.add("Jaya");
a.add("Shanmugam");
a.add("Kamatchi");
System.out.println(a);
System.out.println("----------------------------------");
Iterator i=a.iterator();//traversing through iterator
while(i.hasNext())//to check if iterator has elements
	System.out.println(i.next());//to print and move to next element
System.out.println("----------------------------------");
for(String s:a)//traversing list using for each loop
	System.out.println(s);
System.out.println("----------------------------------");
Collections.sort(a);
System.out.println("Sorted: "+a);
System.out.println("----------------------------------");
for(String s1:a)
	System.out.println(s1);
}
	
}
