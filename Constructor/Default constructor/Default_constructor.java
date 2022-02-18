package basics;

public class Default_constructor 
	{
	int num;
	String A;
	double B;
	float C;
	boolean D;
	// (constructor name=class name)
	//default constructor: used to provide default values to the 
	//object like 0,null etc,depending on the type
	
	//if not created any constructor,then compiler takes as if there a default constructor
	//like this.,
	//Default_constructor2()
	//{
		
	//}
	//and run the program
		public static void main(String args[])
		{
			//creating object for class & object will invoke default constructor
			
			Default_constructor obj=new Default_constructor();
			//default constructor provide default values to the object
		System.out.println(obj.num);
		System.out.println(obj.A);
		System.out.println(obj.B);
		System.out.println(obj.C);
		System.out.println(obj.D);
		}
}

