
class Student{
	int stdid;
	String name;
	
	Student(int stdid, String name)
	{
		this.stdid = stdid;
		this.name = name;
	}
	void display()
	{
		System.out.println("Student id : " + stdid + " | Name : " + name);
	}
}
public class ArrayOfObjects {

	public static void main(String[] args) {
		
		Student[] arr = new Student[2];
		arr[0] = new Student(121,"Aman");
		arr[1] = new Student(122, "Nayan");
		arr[0].display();
		arr[1].display();
		

	}

}
