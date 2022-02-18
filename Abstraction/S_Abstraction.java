package basics2;
//Abstraction: hiding unnecessary details and showing only necessary details.
abstract class Bike  //creating abstract class using 'abstract' keyword
{
	abstract void run();//abstract method 'run'
	Bike()//No arg constructor
	{
		System.out.println("Bike...");
	}
	void type()//non-abstract method
	{
		System.out.println("Hero honda...");
	}
	void type2()//non-abstract method
	{
	System.out.println("Bajaj...");
	}
}
class Honda extends Bike //inheriting Bike to Honda 
{
void run()//implementing abstract method 'run' here
{
	System.out.println("Hero honda is running...");
}
}
class Bajaj extends Bike
{
	void run()//implementing abstract method 'run' again here
	{
	System.out.println("Bajaj is running...");
}
}
public class S_Abstraction {
public static void main(String args[])
		{
	Bike b;//creating object for class Bike
	b=new Honda();//calling class Honda via object 'b' and calling all methods
	b.type();
	b.run();
	b=new Bajaj();//calling class Bajaj via object 'b' & calling all methods
	b.type2();
	b.run();
	
		}
}
