
interface OS
{
	void spec();
}

class Android implements OS
{
	public void spec() {
		System.out.println("open OS");
	}
}
class IOS implements OS
{
	public void spec()
	{
		System.out.println("closed OS");
	}
}
class Windows implements OS
{
	public void spec()
	{
		System.out.println("faltu OS");
	}
}

class OSFactory
{
	public OS getInstance(String str)
	{
		if(str == "open")
			return new Android();
		else if(str == "closed")
			return new IOS();
		else
			return new Windows();
	}
}

public class FactoryDP {

	public static void main(String[] args) {
		
		OSFactory obj = new OSFactory();
		OS obj1 = obj.getInstance("open");
		obj1.spec();

	}

}
