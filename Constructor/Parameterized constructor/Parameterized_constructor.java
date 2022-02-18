package basics;

public class Parameterized_constructor {
int age;
String name;
//creating parameterized constructor
Parameterized_constructor(int age,String name)
{
	//if using same variables then this keyword must be used
	this.age=age;
	this.name=name;
}
public static void main(String args[])
{
	//creating object for the class to invoke
	//parameterized constructor and giving parameters
	Parameterized_constructor obj=new Parameterized_constructor(27,"Sindhu");
	System.out.println("Name= "+obj.name+"\r\n"+"Age= "+obj.age);
}
}


