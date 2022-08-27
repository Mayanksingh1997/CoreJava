
public class OperationsOnLL {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.insert(18);
		list.insert(25);
		list.insert(45);
		list.insert(42);
		list.insert(12);
		list.insert(80);
		list.insert(40);
		list.show();
		list.insertAtStart(5);
		list.show();
		list.insertAt(3, 20);
		list.show();
		list.deleteNthFromEnd(4);
		list.show();
		list.insertAtStart(42);
		list.show();
		list.deleteAt(2);
		list.show();
		list.reverse();
		list.show();

	}

}
