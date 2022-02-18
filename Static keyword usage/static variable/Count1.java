package basics;

public class Count1
{
static int count=0;
Count1()
{
	count++;
	System.out.println(count);
}
public static void main(String args[])
{
	//creating objects
	//static variable get memory only once,if any object changes the value of static variable,
	//it will retain its value..
	Count1 C=new Count1();
	Count1 D=new Count1();
	Count1 E=new Count1();
}
}
