
class AB{
	public void show() {
	  System.out.println("In AB show");
	}
}

//class BC extends AB{
//	public void show() {
//		System.out.println("This is best");
//	}
//}

public class AnnonymousExample {

	public static void main(String[] args) {
		
		AB obj = new AB()
				{
			          public void show() {
			        	  System.out.println("This is best");
			          }
				};   // This is annonymous class
		obj.show();
		

	}

}
