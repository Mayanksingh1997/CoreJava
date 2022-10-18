import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Emp1
{
	int eid;
	String ename;
	public Emp1(int eid, String ename)
	{
		this.eid=eid;
		this.ename=ename;
	}
}
public class StreamApi3 {

	public static void main(String[] args) {
		List<Emp1> emp = new ArrayList<>();
		//Emp1[] emp = new Emp1[3];
		emp.add(new Emp1(1,"mayank"));
		emp.add(new Emp1(2,"singh"));
		emp.add(new Emp1(3, "rajput"));
//		emp[0] = new Emp1(1,"mayank");
//		emp[1] = new Emp1(2,"singh");
//		emp[2] = new Emp1(3, "rajput");
		Stream<Emp1> s = emp.stream().filter(i->i.ename=="singh");
		s.forEach(i->System.out.println(i.eid + " : " + i.ename));
		//s.forEach(System.out::println);
		//emp.forEach(i->System.out.println(emp[i].ename));
		
//		for(Emp1 em : emp) {
//			System.out.println(em.eid + " : " + em.ename);
//		}

	}

}
