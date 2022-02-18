//To write a program to count the number of employees working in the company(excluding interns)

//Garbage collector:to free up heap memory (where objects are created)
                  //by destroying unreachable objects/unused objects.
package basics2;
class Employee
{
	    private int ID;
	    private String name;
	    private int age;
	    private static int nextId = 1;
	    // it is made static because it
	    // is kept common among all and
	    // shared by all objects
	   
	    public Employee(String name, int age)
	    {
	        this.name = name;
	        this.age = age;
	        this.ID = nextId++;
	    }
	    public void show()
	    {
	        System.out.println("Id=" + ID + "\nName=" + name
	                           + "\nAge=" + age);
	    }
	    public void showNextId()
	    {
	        System.out.println("Next employee id will be="
	                           + nextId);
	    }
	    protected void finalize() 
	    {
	     --nextId;    // In this case,
	                  // gc will call finalize()
	                 // for 2 times for 2 objects.
	    }
}
	    
	 
	class UseEmployee {
	    public static void main(String[] args)
	    {
	        Employee E = new Employee("GFG1", 56);
	        Employee F = new Employee("GFG2", 45);
	        Employee G = new Employee("GFG3", 25);
	        E.show();
	        F.show();
	        G.show();
	        E.showNextId();
	        F.showNextId();
	        G.showNextId();
	 
	        { // It is sub block to keep
	            // all those interns.
	            Employee X = new Employee("GFG4", 23);
	            Employee Y = new Employee("GFG5", 21);
	            X.show();
	            Y.show();
	            X.showNextId();
	            Y.showNextId();
	         // After countering this brace, X and Y
	            // will be removed.Therefore,
	            // now it should show nextId as 4.but it instead it shows as 6.
	            
//Hence garbage collector(gc) is used to free 2 objects. 
//Now to decrement nextId,gc(garbage collector) will call method to finalize() only 
//when we programmers have overridden it in our class.
	            X = Y = null;
	            System.gc();
	            System.runFinalization();
	        }
	       
	        E.showNextId();
	       
	    }
	}

