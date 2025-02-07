class Vehicle
{
 	String brand="toyota";
}
class car extends Vehicle
{
 	String Model="corolla";
               void display()
	{
               	System.out.println("BRAND:"+brand);
               	System.out.println("MODEL:"+Model);
	}
}
public class SingleInheritance
{
	public static void main(String[] args)
	{
		car obj=new car();
		obj.display();
	}
}