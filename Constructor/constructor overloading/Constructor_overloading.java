package basics;
//constructing overloading:->Each differentiated constructor can be made to perform varying tasks.
//						   ->Overloading enables programmers to use default constructors 
//								along with constructors that have parameters
public class Constructor_overloading
{
	String name;
	int age;
	float salary;
	Constructor_overloading()
	{
		System.out.println("This is constructor overloading");
	}
	Constructor_overloading(String N,int A)
	{
		name=N;
		age=A;
	}
	Constructor_overloading(String name,int age,float salary)
	{
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	void show1()
	{
		System.out.println("Name= "+name+"\r\n"+"Age= "+age+"\r\n"+"Salary= "+salary);
	}
	public static void main(String args[])
	{
		Constructor_overloading R=new Constructor_overloading();
		Constructor_overloading Q=new Constructor_overloading("Seetha",29);
		Constructor_overloading P=new Constructor_overloading("Ram",29,20000);
		Q.show1();
		P.show1();
	}
}
