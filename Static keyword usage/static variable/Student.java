package basics;

public class Student 
{
//static keyword in a variable(static variable):-> used to ref to common property 
											  //-> gets memory only once in class area at the time of class loading
											  //-> saves memory, making program memory efficient
	int rollno;
	String name;
	static String college_name="RRASE CLG OF ENGINEERING";//for all students, college name takes a single memory instead of occupying space each time.
	Student(String name,int rollno)//parameterized constructor
	{
	this.name=name;   //this to ref current object
	this.rollno=rollno;
	}
	void display()
	{
		System.out.println("Name: "+name+" Roll no: "+rollno+" College Name: "+college_name);
	}
	public static void main(String args[])
	{
		Student S=new Student("Deepika",6008);
		Student R=new Student("Chitra",6006);
		//can change clg name of all objects like this...
		Student.college_name="SRM UNIVERSITY";
		S.display();
		R.display();
		
	}
}
