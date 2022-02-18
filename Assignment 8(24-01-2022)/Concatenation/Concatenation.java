package basics;
public class Concatenation {
public static void main(String args[])
{
	String a="deepica";
	String b="ravi".concat("1512");
	String c=a.concat(b);
	String d="gmail";
	String e="com";
	String f=c.concat("@").concat(d).concat(".").concat(e);
	System.out.println("Enter your mail-id: "+f);
}
}
