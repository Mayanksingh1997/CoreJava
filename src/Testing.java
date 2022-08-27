import java.util.Arrays;

public class Testing {
	
	static int[] mergeArray(int a[], int b[])
	{
		int len, lem;
		len = a.length;
		lem = b.length;
		int arr[] = new int[len+lem];
		for(int i=0,j=0; i<len+lem; i++)
		{
			if(i<len)
			{
				arr[i]=a[i];
			}
			else {
				arr[i]=b[j];
				j++;
			}
		}
		return arr;
		
	}

	public static void main(String[] args) {
		int a[] = {1,2,3,4};
		int b[] = {5,6,7};
		
		int len = a.length;
		int lem = b.length;
		
		int c[] = new int[len+lem];
		
   	    c = mergeArray(a,b);
		System.out.println(Arrays.toString(c));
		

	}

}
