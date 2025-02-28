class Animal
{
	void sound()
	{
		System.out.println("animal makes sound");
	}
}
class Dog extends Animal
{
	void sound()
	{
		System.out.println("dog barks");
	}
}
class Cat extends Animal
{
	void sound()
	{
		System.out.println("cat make sound like meow meow");
	}
}
public class Interface
{
	public static void main(String[] args)
	{
		Animal animal=new Animal();
		animal.sound();
		Animal mydog=new Dog();
		mydog.sound();
		Animal mycat=new Cat();
		mycat.sound();
	}
}