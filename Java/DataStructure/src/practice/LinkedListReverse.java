package practice;

public class LinkedListReverse {
	
	public static Node reverse(Node head)
	{
		if(head == null)
		{
			return head;
		}
		else
		{
			Node temp = head;
			Node prev = null;
			while(temp != null)
			{
				Node aux = temp.getNext();
				temp.setNext(prev);
				prev = temp;
				temp = aux;
			}
			return prev;
		}
	}
	
	public static void traverse(Node head)
	{
		if(head == null)
		{
			System.out.println("Linked List is empty");
		}
		else
		{
			while(head != null)
			{
				System.out.println(head.getData());
				head = head.getNext();
			}
		}
	}

	public static void main(String[] args) {
		
		Node head = null;
		
		Node first = new Node();
		first.setData(10);
		head = first;
		
		
		Node second = new Node();
		second.setData(20);
		first.setNext(second);
		
		Node third = new Node();
		third.setData(30);
		second.setNext(third);
		
		Node forth = new Node();
		forth.setData(40);
		forth.setNext(null);
		third.setNext(forth);
		
		System.out.println("Before reverse");
		traverse(head);
		head = reverse(head);
		System.out.println("After reverse");
		traverse(head);

	}

}
