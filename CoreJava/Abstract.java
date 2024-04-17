abstract class Abstract
{
	abstract void start();
}
class Car extends Abstract
{
	void start()
	{
		System.out.println("car start with key");
	}
}
class Scooter extends Abstract
{
	void start()
	{
		System.out.println("scooter start with kick");
	}
	public static void main(String []args)
	{
		
		Car c=new Car();
		c.start();
		
		Scooter s=new Scooter();
		s.start();
	}
}