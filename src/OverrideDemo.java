//method overriding and super keyword
class A{
	//int i;
	public void show()
	{
		System.out.println("In A");
	}
}

class B extends A
{
	// int i;
	public void show()
	{
		//super.i=8;
		super.show();
		System.out.println("In B");
	}
}

public class OverrideDemo {

	public static void main(String[] args) {
		
		B obj1 = new B();
		obj1.show();

	}

}

// super keyword is used in case of using parent class during method overriding
