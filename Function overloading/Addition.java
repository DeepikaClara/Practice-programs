package basics2;

public class Addition
{
//Function overloading/Method overloading:Function overloading or method overloading refers to the action 
//of a developer creating multiple methods having identical names but differing parameters.
//Method overloading occurs when a class contains two or more methods of the same name.
	
	
	//type1:modifying no.of arguments
	static int add(int a,int b)
	{
		return a+b;
	}
	static int add(int a,int b,int c)
	{
		return a+b+c;
	}
	//type2: modifying data types of arguments
	static int sub(int a,int b)
	{
		return a-b;
	}
	static double sub(double a,double b)
	{
		return a-b;
	}
	public static void main(String args[])
	{
		System.out.println("ADD1= "+add(4,5));
		System.out.println("ADD2= "+add(4,5,6));
		System.out.println("SUB1= "+sub(5,4));
		System.out.println("SUB2= "+sub(7,5));
	}
}
