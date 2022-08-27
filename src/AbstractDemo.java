
abstract class Human{   // abstract class
	public abstract void eat(); //or just void eat()
	//public abstract void run(); //will cause an error
	void run()
	{
		System.out.println("Running...");
	}
	
	public void walk() {
		System.out.println("Walking...");
	}
}

class Man extends Human{ // concrete class
	
	public void eat() {
		walk();
		System.out.println("Eating...");
	}
}
class Boy extends Man{
	Man ob = new Man();
	public void eat() {
	ob.eat();
	run();}
	
}

public class AbstractDemo {

	public static void main(String[] args) {
		
		Human obj = new Man();
		Boy obj1 = new Boy();
		obj.eat();
		obj.walk();
		obj.run();
		obj1.eat();

	}

}
