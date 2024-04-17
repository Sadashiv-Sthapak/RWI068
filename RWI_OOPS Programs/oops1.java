//Abstraction
abstract class Animal
{
	// Abstract method (method without body)
	public abstract void makeSound();
}
class Dog extends Animal
{
	@Override
	public void makeSound(){
		System.out.println("Woof");
	}
	
}
class Cat extends Animal 
{
	@Override
	public void makeSound()
	{
		System.out.println("meow");
	}
}

public class oops1
{
	public static void main(String args[])
	{
		Animal dog=new Dog();
		Animal cat=new Cat();
		
		dog.makeSound();
		cat.makeSound();
	}
}