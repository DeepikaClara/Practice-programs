package basics;
//multiple inheritance with help of interface
interface P1  //interface1
{
	//default method
	default void show()//overriding //default/abstract/static /private/
	{
		System.out.println("this a default method");
	}
}

interface  P2   //interface 2
{
	  public static void show()//overriding 
	{
		System.out.println("this is my second method");
	}
}
public class Multiple_Inheritance2 implements P1,P2,P3
{
//to override the default method
	//super keyword calling the method of show()
	public void show()
	{
		P1.super.show();
		//P2.super.show();	
	}
	public static void main(String[] args) 
	{
		 Multiple_Inheritance2 m=new  Multiple_Inheritance2();
		m.show();
//		m.show();
      P2.show();
	  m.show();		
	}	
}
