import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi2 {

	public static void main(String[] args) {
		
		List<Integer> values = Arrays.asList(4,5,8,12,10,16,20);
		Stream<Integer> s = values.stream().filter(i->i%5==0).map(i->i*2);
		//int i;
		s.forEach(i->System.out.println(i));
		values.stream().sorted().forEach(System.out::println);
//		for(int i: values)
//		{
//			System.out.println(i);
//		}

	}

}
