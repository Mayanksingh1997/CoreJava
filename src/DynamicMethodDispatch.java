
class X{
	public void show()
	{
		System.out.println("In X");
	}
}

class Y extends X
{
	public void show()
	{
		//super.show();
		System.out.println("In Y");
	}
}
class Z extends X
{
	public void show()
	{
		System.out.println("In Z");
	}
}
public class DynamicMethodDispatch {

	public static void main(String[] args) {
		//assigning the object at run time
		X obj1 = new Y(); // runtime polymorphism
		obj1.show(); //runtime
		
		obj1 = new Z();// runtime
		obj1.show(); // dynamic method dispatch(since you are changing the object and its calling different method)

		//To achieve dynamic method dispatch, we need to use run time polymorphism
	}

}
