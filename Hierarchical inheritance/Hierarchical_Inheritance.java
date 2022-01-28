package basics;
class A1   //Hierarchical inheritance:using super class to extends 												//every subclass
{
	 void methodA()
	 {
		System.out.println("print the value of A"); 
	 }
}
class B extends A1
{
	 void methodB()
	 {
		System.out.println("print the value of B");
	 }
}
class C extends A1
{
	void methodC()
	{
		System.out.println("print the value of C");
	}
}
class F extends A1
{
	void methodF()
	{
		System.out.println("print the  value of F");
	}
}
public class Hierarchical_Inheritance {
	public static void main(String[] args)
	{
		A1 o4=new A1();
		o4.methodA();
		B o1=new B();//		A obj=new A();
		C o2=new C();//		obj.methodB();
		F o3=new F();//		obj.methodA();						
		o1.methodB();
		o2.methodC();
		o3.methodF();
		o3.methodA();
		
        //run time error
		//compile time error
	}
}
