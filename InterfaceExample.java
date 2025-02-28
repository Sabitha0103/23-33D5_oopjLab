interface Animal
{
	void sound();
}
class Dog implements Animal
{
	public void sound()
	{
		System.out.println("dog barks");
	}
}
class Cat implements Animal
{
	public void sound()
	{
		System.out.println("cat make sound like meow meow");
	}
}
public class InterfaceExample
{
	public static void main(String[] args)
	{
		Animal mydog=new Dog();
		mydog.sound();
		Animal mycat=new Cat();
		mycat.sound();
	}
}