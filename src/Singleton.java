class App
{
	private static App app;
	
	private App(){
		
	}
	
	public static App getInstance()
	{
		if(null == app)
			app = new App();
		return app;
		
	}
}
public class Singleton {

	public static void main(String[] args) {
		App app = App.getInstance();
		App app1 = App.getInstance();
		
		System.out.println("Hashcode of app is " +app.hashCode());
		System.out.println("Hashcode of app1 is " +app1.hashCode());
		

	}

}
