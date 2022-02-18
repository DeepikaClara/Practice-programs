package basics;
public class Sample2    //
{
	 String name;
	 Sample2()  //no-argument constructor
	{
	System.out.println("No name yet.");
	}
	 //Sample2(String initialName)  //parameterized constructor
	//{
	//name = initialName;
	//}
	public void setName(String newName)  //setter method
	{
	name = newName;
	}
	public String getName()  //getter method
	{
	return name;
	}
	public void writeOutput()  //writeOutput method
	{
	System.out.println("Name: "+name);
	}
	public boolean sameName(String A)  		//method to compare two strings using
	{										//boolean type sameName method
	return (this.name.equalsIgnoreCase(A));//this ref to current object's variable -'name'
	}									   //equalsIgnorecase to accept both caps & small cases without ignoring .
public static void main(String args[])
	{
	//Sample2 i=new Sample2();
	Sample2 j=new Sample2();
	j.setName("Priyanka");
	j.writeOutput();
	//j.sameName("priyanka");
	System.out.println(j.sameName("priyanka"));
	}
}
