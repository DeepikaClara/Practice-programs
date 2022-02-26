package basics3;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist6 {
public static void main(String args[])
{
	ArrayList<Integer> u=new ArrayList<>();
	u.add(4);
	u.add(5);
	u.add(7);
	u.add(90);
	u.add(76);
	System.out.println(u);
	System.out.println("After Insertion");  
    System.out.println("Is ArrayList Empty: "+u.isEmpty());
	System.out.println("------------------------");
	ArrayList<Integer> v=new ArrayList<>();
	v.add(0);
	v.add(8);
	v.add(5);
	System.out.println(v);
	System.out.println("------------------------");
	v.addAll(u);//adding u elements to v
	System.out.println("Adding u to v:");
System.out.println(v);
System.out.println("------------------------");
ArrayList<Integer> w=new ArrayList<>();
w.add(67);
w.add(55);
System.out.println(w);
System.out.println("------------------------");
w.addAll(0, u);//adding u elements to w at w's 0th position
System.out.println("Adding u to w:");
System.out.println(w);
System.out.println("------------------------");
v.remove(5);
System.out.println(v);
System.out.println("------------------------");
w.removeAll(w);
System.out.println(w);
System.out.println("------------------------");
v.removeIf(str->v.contains(3));//removes all elements if true ,otherwise gives all elements
System.out.println(v);
System.out.println("------------------------");
v.clear();
System.out.println("After deletion");  
System.out.println("Is ArrayList Empty: "+v.isEmpty());//return true / false checking if object is empty/not
System.out.println(v);
System.out.println("------------------------");
w.add(76);
w.add(91);
u.addAll(w);
u.retainAll(w);//retain u's element which is equal to w and print all w elements
				//if no u's element is equal to w then print only w elements
Iterator itr=u.iterator();  
while(itr.hasNext()){  
 System.out.println(itr.next()); 
//System.out.println(u);

}
}
}
