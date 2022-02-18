public class Student2
{
String A,B,C,D,E;
public String E()
{
	E="Unknown";
	return E;
}
public static void main(String args[])
{
	Student2 classV=new Student2();
	classV.A="Sindhu";
	classV.B="Veer";
	classV.C="Seetha";
	classV.D="Ram";
	classV.E();
	System.out.println("Names of Top5 students of classV are:"+"\r\n"+classV.A+"\r\n"+classV.B+"\r\n"+classV.C+"\r\n"+classV.D+"\r\n"+classV.E);	
}
}
