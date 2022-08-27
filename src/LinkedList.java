
public class LinkedList {
	Node head;
	public void insert(int data)
	{
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(head == null)
		{
			head = node;
		}
		else {
			Node n = head;
			while(n.next != null)
			{
				n = n.next;
			}
			n.next = node;
		}
	}
	
	public void insertAtStart(int data)
	{
		Node node = new Node();
		node.data = data;
		node.next = head;
		head = node;
	}
	
	public void insertAt(int index, int data)
	{
		Node node = new Node();
		node.data = data;
		node.next = null;
		Node n = head;
		Node n1 = null;
		if(index == 1)
		{
			insertAtStart(data);
		}
		else if(index == 0)
		{
			System.out.println("Invalid input");
		}
		else
		{
			for(int i = 1; i<index; i++)
			{
				n1=n;
				n = n.next;
			}
			n1.next = node;
			node.next = n;
		}
	}
	
	public void deleteAt(int index)
	{
		if(index == 0)
		{
			System.out.println("Invalid Input");
		}
		else if(index == 1)
		{
			head = head.next;
		}
		else
		{
			Node n = head;
			Node n1 = null;
			for(int i=1;i<index;i++)
			{
				n1 = n;
				n=n.next;
			}
			n1.next = n.next;
		}
		
	}
	
	public void deleteNthFromEnd(int index)
	{
		if(index == 0)
			System.out.println("Invalid Input");
		else if(head == null)
			System.out.println("Empty Linked List");
		else
		{
			Node n = head;
			Node n1 = head;
			Node n2 = null;
			int i =1;
			while(n.next!=null)
			{
				if(i<index)
				{
					n=n.next;
					i++;
				}
				else
				{
					n2=n1;
					n1 = n1.next;
					n=n.next;
				}
			}
			n2.next = n1.next;		
		}
	}
	public void reverse()
	{
		if(head == null)
		{
			System.out.println("Empty Linked list");
		}
		Node n = head;
		Node n1 = null;
		Node prev = null;
		while(n!=null)
		{
			n1 = n.next;
			n.next = prev;
			prev = n;
			n = n1;
		}
		head = prev;
		
	}
	
	public void show()
	{
		if(head == null)
		{
			System.out.println("Empty linked list");
		}
		else
		{
			Node n = head;
			while(n.next!=null)
			{
				System.out.print(n.data + " -> ");
				n=n.next;
			}
			System.out.println(n.data);
		}
	}
	

}
