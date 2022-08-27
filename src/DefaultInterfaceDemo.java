@FunctionalInterface
interface Demo{
	void abc();
	default void show() {
		System.out.println("in show");
	}
}

class DemoImp implements Demo{
	
	public void abc() {
		System.out.println("in abc");
	}
	
	public void speak() {
		System.out.println("I can speak");
	}
	
//	public void show() {
//		System.out.println("In new show");  //method overriding works
//	}
}

public class DefaultInterfaceDemo {

	public static void main(String[] args) {
		Demo obj = new DemoImp();
		obj.abc();
		obj.show();
		// obj.speak(); TO USE THIS WE NEED TO CREATE INSTANCE OF DemoImp()

	}

}
