package basics;

public class Break_Statement {
	public void whileLoop()
	{
		int i=3;
		//while loop
	while(i<=10)
	{
		if (i==5)
		{
			break;        
		}
		System.out.print(i+" ");
		i++;
	}
	}
	public void forLoop()
	{
	for(int j=3;j<=10;j++)
	{
		if (j==5)    
		{
			break;    
		}
		
	System.out.print(j+" ");	
	}
	}
	public void doWhileLoop()
	{
	int k=3;
	do
	{

		if (k==5)
		{
			break;    
		}
	System.out.print(k+" ");
	k++;
	}while(k<=10);
	}
	public static void main(String args[])
	{
	Break_Statement loops=new Break_Statement();
	loops.whileLoop();
	System.out.println();
	loops.forLoop();
	System.out.println();
	loops.doWhileLoop();
	}
	}
