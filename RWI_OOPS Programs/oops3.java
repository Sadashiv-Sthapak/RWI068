//Inheritance

class Vehicle
{
	void move(){
		System.out.println("Vehicle Moving");
	}
	
	void stop(){
		System.out.println("Vehicle stopped");
	}
}

class car extends Vehicle{
	void move(){
		System.out.println("car moving");
	}
	
	void stop(int distance){
		System.out.println("car stopped after " +distance+" kms");
	}
}
public class oops3
{
	public static void main(String args[])
	{
		Vehicle v=new Vehicle();
		v.move();
		v.stop();
		
		car c=new car();
		c.move();
		c.stop();
		c.stop(50);
	}
}