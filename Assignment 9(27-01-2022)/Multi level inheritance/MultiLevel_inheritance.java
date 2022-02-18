package basics;
class Semester1
{
	static int a=91,b=91,c=91;
	static int average=(a+b+c)/3;
	void firstAverage()
	{
		System.out.println("Semester 1 average= "+average);
	}
}
	class Semester2 extends Semester1
	{
		static int d=91,e=91,f=90;
		static int average2=(d+e+f)/3;
		void secondAverage()
		{
			System.out.println("Semester 2 average = "+average2);
		}
	}
		class Semester3 extends Semester2
		{
			static int A=87,B=87,C=88;
			static int average3=(A+B+C)/3;
			void thirdAverage()
			{
				System.out.println("Semester 3 average= "+average3);
			}
		}
		class Semester4 extends Semester3
		{
			static int A1=85,B1=86,C1=86;
			static int average4=(A1+B1+C1)/3;
			void fourthAverage()
			{
			System.out.println("Smester 4 average= "+average4);
			}
		}
public class MultiLevel_inheritance extends Semester4
{
public static void main(String args[])
{
	int totalaverage=(average+average2+average3+average4)/4;
	MultiLevel_inheritance X=new MultiLevel_inheritance();
	X.firstAverage();
	X.secondAverage();
	X.thirdAverage();
	X.fourthAverage();
	System.out.println("Total average= "+totalaverage);
}
}
