package basics2;
class Address
{
	String city,state,country;
	Address(String c,String s,String co)
	{
	city=c;
	state=s;
	country=co;
	}
}
class Student
{
	String name;
	char sex;
	Address a;//Aggregation:it Has-A reference from class 'Address'
	Student(String n,char sex,Address a)
	{
		name=n;
		this.sex=sex;
	    this.a=a;
	}
	void display()
	{
System.out.println("Name: "+name+"\n"+"Sex: "+sex+"\n"+"Address: "+a.city+","+a.state+","+a.country);	
	}
}
class Aggregation
{
		public static void main(String args[])
		{			
			Address a1= new Address("chennai","TN","India");
			Address a2= new Address("Kochi","Kerala","India");
			Student S=new Student("Deepika",'F',a1);
			Student R= new Student("Clara",'F',a2);
			S.display();
	        R.display();
		}
		
	}
