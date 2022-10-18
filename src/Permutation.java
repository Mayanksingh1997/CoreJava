import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permutation {
	
	public static void permute(String str, String sp, List<String> value)
	{
		if(str.length() == 0)
		{
			System.out.println(sp +" ");
			value.add(sp);
			return;
		}
		for(int i =0; i<str.length(); i++) {
			char ch = str.charAt(i);
			String newstr = str.substring(0, i)+ str.substring(i+1);
			permute(newstr,sp+ch, value);
		}
	}
	
	public static List<Integer> printDistinct(List<Integer> value)
	{
//		int arr[] = new int[100000];
		Set<Integer> set = new HashSet<>();
		List<Integer> newValue = new ArrayList<>();
		for(int i =0; i<value.size(); i++)
		{
			if(!set.contains(value.get(i)))
			{
				newValue.add(value.get(i));
				set.add(value.get(i));
			}
//			if(arr[value.get(i)]==0) { //2 1
//			  newValue.add(value.get(i));
//			  arr[value.get(i)]++;
//			}
			
		}
		return newValue;
	}
	

	public static void main(String[] args) {
//		String s = "ABC";
//		List<String> values = new ArrayList<>();
//		permute(s, "", values);
//		System.out.println(values);
		// [2,2,5,5,3,4,5,4] = [2,5,3,4]
		List<Integer> values = Arrays.asList(2,2,5,5,3,4,5,4);
		System.out.println(printDistinct(values));

	}

}
