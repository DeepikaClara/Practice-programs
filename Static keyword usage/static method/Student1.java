package basics;

public class Student1
{
static String college_name="ABC College";
int rollno;
String name;
//static method to change the value of static variable
//restrictions in static method:->it cannot call non-static data member
									//or call non-static method directly
							  //->this & super cannot be used in static context.
static void change()
{
	college_name="xyz college";
}
//parameterized constructor
Student1(String name,int rollno)
{
this.name=name;
this.rollno=rollno;
}
public static void main(String args[])
{
	Student1 S=new Student1("Ramya",4001);
	Student1 R=new Student1("Swetha",4002);
	System.out.println("Name: "+S.name+" Rollno: "+S.rollno+" college_name: "+college_name);
System.out.println("Name: "+R.name+" Rollno: "+R.rollno+" college_name: "+college_name);
}

}
