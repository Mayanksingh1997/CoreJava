import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Compl implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) { //we will tell how to compare two Integer objects, based on what
		
		//return o1>o2 ? 1 : -1;
		return o1%10>o2%10 ?1 : -1;
	}
	
}

public class CollectionDemo {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<>();
		values.add(404);
		values.add(908);
		values.add(299);
		values.add(265);
		Comparator<Integer> ob = new Compl();
		//Collections.sort(values);
		Collections.sort(values, ob); //comparator object is passed over here
		for(Integer o : values)
		   System.out.println(o);
				

	}

}
//Annonymous Class
//Comparator<Integer> ob1 = new Comparator<Integer>() {
//	@Override
//	public int compare(Integer o1, Integer o2) { //we will tell how to compare two Integer objects, based on what
//		
//		//return o1>o2 ? 1 : -1;
//		return o1%10>o2%10 ?1 : -1;
//	}
//}
                    
//Lambda Function
//Comparator<Integer> ob1 = (Integer o1, Integer o2)->
//		{
//	       return o1%10 > o2%10 ? 1 : -1;
//		};
//Collections.sort(values, ob1);
//		
//		OR
//Collections.sort(values,(o1,o2)-> o1%10>o2%10 ? 1 : -1 );
