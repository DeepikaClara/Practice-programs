package basics;
interface D
{
 int a=10,b=20;
	default void addition()
	{
		int add= a+b;
	System.out.println("Value of addition = "+add);	
	}
}
interface E
{
	    int a=10,b=20;
 public static void subtraction() //it takes only default and static 
{
	int sub=b-a;
	System.out.println("Value of subtraction= "+sub);
}
}
public class Multiple_Inheritance1 implements D,E
{
	//we have to use 'super' keyword and call the method again
	//in parent class when created any methods using 'default' 
	public void addition() 
	{
	D.super.addition();
	}                   
	public static void main(String args[])
	{

		Multiple_Inheritance1 show= new Multiple_Inheritance1();
		
		show.addition();
		E.subtraction(); // when using default then we can call using object
		                 // but when using public static we have to use class/interface name
	}
}
