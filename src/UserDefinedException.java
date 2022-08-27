
public class UserDefinedException {

	public static void main(String[] args) {
		
		int i = 8;
		int j = 9;
		
		try {
			int k = i/j;
			if (k==0)
			{
				throw new TeluskoException();
			}
		}
		
		catch( TeluskoException e)
		{
			System.out.println("Error " + e);
		}

	}

}
