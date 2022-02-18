class Car
{
//String brand;
public String carBrand()
{
	String brand="Ford";
	return brand;
	//this.brand="Ford";
}
//public String getBrand()
//{
	//return brand;
//}
 void run() 
{
	System.out.println("Car is running...");
}
}
public class Sample
{
public static void main(String args[])
{
	Car ford=new Car();
	System.out.println(ford.carBrand());
	ford.run();
	//String brand=ford.getBrand();
	//System.out.println(ford.getBrand());
}
}
