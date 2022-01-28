package basics;

public class Encapsulation1   //Encapsulation/Data hiding
{
	private int length,breadth,area;  //decl.variables in private & using getter ,setter methods
	public int getLength()
	{
	return length;	
	}
	public int getBreadth() 
	{
		return breadth;
	}
	public int getArea()
	{
	return area;	
	}
	public void setLength(int l)
	{
		length=l;
	}
	public void setBreadth(int b)
	{
		breadth=b;
	}
	public void setArea()
	{
		area=length*breadth;
		System.out.println("Area= "+area);
	}
	public static void main(String args[])
	{
		Encapsulation1 E=new Encapsulation1();
		E.setLength(25);
		E.setBreadth(33);
		E.setArea();
	}
	}