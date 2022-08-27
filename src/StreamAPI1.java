import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class StreamAPI1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> values = new ArrayList<>();
		for(int i =1; i<=100; i++)
		{
			values.add(i);
		}
		System.out.println(values.stream().filter(i->{
			System.out.println("hi");
			return true;
		}).findFirst().orElse(0));

	}

}
