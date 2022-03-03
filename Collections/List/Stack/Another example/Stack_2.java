package basics3;

import java.util.EmptyStackException;
import java.util.Stack;

public class Stack_2 {
	public static void main(String args[])   
	{  
	//creating an object of Stack class  
	Stack <Integer> stk = new Stack<>();  
	System.out.println("stack: " + stk);  
	//pushing elements into the stack  
	pushelmnt(stk, 20); //calls the 'pushelmnt' method 
	pushelmnt(stk, 13);  
	pushelmnt(stk, 89);  
	pushelmnt(stk, 90);  
	pushelmnt(stk, 11);  
	pushelmnt(stk, 45);  
	pushelmnt(stk, 18);  
	//popping elements from the stack  
	popelmnt(stk); //calls the 'popelmnt' method  
	popelmnt(stk);
	//throws exception if the stack is empty  
	try   
	{  
	popelmnt(stk);  
	}   
	catch (EmptyStackException e)   
	{  
	System.out.println("empty stack");  
	}  
	}  
	//performing push operation  
	static void pushelmnt(Stack stk, int x)//pushelmnt & popelmnt is a method   
	{  
	//invoking push() method      
		Integer z=(Integer) stk.push(x);
	System.out.println("push -> " +z );  
	//prints modified stack  
	System.out.println("stack: " + stk);  
	}  
	//performing pop operation  
	static void popelmnt(Stack stk)   
	{  	
	//invoking pop() method   
	Integer y = (Integer) stk.pop();  
	System.out.println("pop ->" +y);  
	//prints modified stack  
	System.out.println("stack: " + stk);  
	}  
}
