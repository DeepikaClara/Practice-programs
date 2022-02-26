package basics3;

import java.util.ArrayList;

public class Arraylist1 {
public static void main(String args[])
{
	ArrayList<Integer> a=new ArrayList<>();
	a.add(3);
	a.add(7);
	a.add(10);
	a.add(9);
	a.add(0, 4);
	a.set(2, 5);
	System.out.println(a);
	System.out.println(a.get(3));
	a.remove(3);
	System.out.println(a);
	ArrayList<Integer> b=new ArrayList<>();
	for(int i=3;i<=7;i++)
	
		b.add(i);
		System.out.println(b);
	
	for(int i=0;i<b.size();i++)
	{
		System.out.println(b.get(i)+" ");
	}
}
}
