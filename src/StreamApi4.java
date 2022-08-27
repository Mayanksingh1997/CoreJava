import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi4 {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(12,20,35,46,55,68,75);
		
		// WRONG IMPLEMENTATION
		//s.forEach(i->System.out.println(i));
		//Stream<Integer> s = values.stream().filter(i->i%5==0).map(i->i*2).reduce(0,(c,e)->c+e);
		// AS HERE REDUCE WILL RETURN A SINGLE INTEGER VALUE
		
		System.out.println(values.stream().filter(i->i%5==0).map(i->i*2).reduce(0,(c,e)->c+e));
//                                         OR
//		Integer s = values.stream().filter(i->i%5==0).map(i->i*2).reduce(0,(c,e)->c+e);
//		System.out.println(s);

	}

}
