package basics3;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist4 {
public static void main(String args[])
{
	Student_array4 x=new Student_array4(101,"Arjun",24);
	Student_array4 y=new Student_array4(104,"Shakthi",23);
	Student_array4 z=new Student_array4(107,"Ammu",25);
	ArrayList<Student_array4> l=new ArrayList<>();
	l.add(x);
	l.add(y);
	l.add(z);
	Iterator itr=l.iterator();
	while(itr.hasNext()) {
	Student_array4 st=(Student_array4)itr.next();
	System.out.println(st.rollno+" "+st.name+" "+st.age);

	
	}
}
}
