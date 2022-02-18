package basics;

public class No_argument_constructor 
{
int num;
String A;
double B;
float C;
No_argument_constructor()
{
	System.out.println("This is a No argument constructor");
}
	public static void main(String args[])
	{
		//creating object for class & object will invoke No argument constructor
		
		No_argument_constructor obj=new No_argument_constructor();
		// when not given any values it assumes as default constructor &
		//provides default values to the object
	System.out.println(obj.num);
	System.out.println(obj.A);
	System.out.println(obj.B);
	System.out.println(obj.C);
	}

}
