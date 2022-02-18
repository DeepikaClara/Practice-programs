package basics;

public class Count
{
	//instance variable:get memory each time when instance is created
	int count=0;
Count()
{
	count++;
	System.out.println(count);
}
public static void main(String args[])
{//creating object
//each obj have copy of instance variable & if incremented
//won't reflect other objects..						
Count C=new Count();
Count D=new Count();
Count E=new Count();
}
}
