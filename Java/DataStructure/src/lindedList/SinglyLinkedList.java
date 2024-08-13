package lindedList;

import java.util.Scanner;

public class SinglyLinkedList {
	
	public void nthNode(int nth, Node head)
	{
		if(head == null)
		{
			System.out.println("Linked List is empty.");
		}
		else
		{
			Node temp = head;
			int size=0;
			
			while(temp != null)
			{
				size++;
				temp = temp.getNext();
			}
			if(size < nth)
			{
				System.out.println("Nodes in LL is less than given node");
			}
			else
			{
				size= size - nth+1;
				Node aux = null;
				for(int i=1; i<=size; i++)
				{
					aux = head;
					head = head.getNext();
				}
				System.out.println("Value at "+ nth+" node from back is "+aux.getData());
			}
		}
	}
	
	public Node reverse(Node head)
	{
		Node prev = null;
		Node temp = head;
		Node aux;
		
		while( temp != null)
		{
			aux = temp.getNext();
			temp.setNext(prev);
			prev = temp;
			temp = aux;
		}
		return prev;
		
		
	}
	
	
	public Node addLastNode(int data, Node head)
	{
		
		Node newNode = new Node();
		newNode.setData(data);
		newNode.setNext(null);
		
		if(head == null)
		{
			return newNode;
		}
		else
		{
			Node temp = head;
			

			while(temp != null)
			{
				
				if(temp.getNext() == null)
				{
					temp.setNext(newNode);
					return head;
				}
				temp = temp.getNext();
			}
			return head;
		}
		
	}
	
	public Node addFirstNode(int data, Node head)
	{
		Node newNode = new Node();
		newNode.setData(data);
		newNode.setNext(null);
		
		if(head == null)
		{
			return newNode;
		}
		else
		{
			newNode.setNext(head);
			head = newNode;
			return head;
		}
	}
	
	public void traversal(Node head)
	{
		if(head == null)
		{
			System.out.println("Linked List is empty.");
			
		}
		else
		{
			while(head != null)
			{
				if(head.getNext() != null)
				System.out.printf(head.getData()+" -> ");
				else
				System.out.print(head.getData()+"\n");
				head= head.getNext();
			}
		}
	}
	
	public Node deleteLast(Node head)
	{
		if(head == null)
		{
			System.out.println("Deletion is not possible, Linked List is already empty.");
			return null;
		}
		else
		{
			
			if(head.getNext() == null)
			{
				head = null;
				return head;
			}
			else
			{
				Node back = head;
				Node temp = head;
				while( temp != null)
				{
					if(temp.getNext() == null)
					{
						System.out.println(temp.getData()+" deleted");
						back.setNext(null);
						return head;
					}
					else
					{
						back = temp;
						temp = temp.getNext();
					}
				}
				return head;
				
			}
			
		}
	}
	
	public Node deleteFirst(Node head)
	{
		if(head == null)
		{
			System.out.println("Deletion is not possible, Linked List is already empty.");
			return null;
		}
		else
		{
			
			if(head.getNext() == null)
			{
				head = null;
				return head;
			}
			else
			{
				head = head.getNext();
				return head;
			}
		}
	}
	
	public Node deleteMatching(int data, Node head)
	{
		if(head == null)
		{
			System.out.println("Deletion is not possible, Linked List is already empty.");
			return null;
		}
		else
		{
			Node temp = head;
			if(temp.getNext() == null)
			{
				if(temp.getData() == data)
				{
					System.out.println(temp.getData()+" deleted");
					head = null;
					return head;
				}
				else
				{
					System.out.println("No maching node found.");
				}
			}
			else
			{
				Node prev = head;
				while(temp != null)
				{
					if(temp.getData() == data && temp == head)
					{
						head = head.getNext();
						return head;
					}
					else if(temp.getData() == data)
					{
						System.out.println(temp.getData()+" deleted");
						prev.setNext(temp.getNext());
						return head;
					}
					prev = temp;
					temp = temp.getNext();
				}
				System.out.println("No maching node found.");
			}
			return head;
		}
	}

	public static void main(String[] args) {
		SinglyLinkedList ll= new SinglyLinkedList();
		
		boolean flag = true;
		int choice;
		Scanner scn = new Scanner(System.in);
		Node head = null;
		
		while(flag)
		{
			System.out.println("**********************************");
			System.out.println("1. Insert Node at first");
			System.out.println("2. Insert Node at last");
			System.out.println("3. Delete First Node");
			System.out.println("4. Delete Last Node");
			System.out.println("5. Traverse LinkedList");
			System.out.println("6. Reverse");
			System.out.println("7. Delete matching");
			System.out.println("8. Nth node from ending");
			System.out.println("9. Exit");
			System.out.println("Enter your choice: ");
			choice = scn.nextInt();
			System.out.println("**********************************");
			switch (choice) {
			case 1: {
				System.out.println("Enter value of node");
				int data = scn.nextInt();
				head = ll.addFirstNode(data,head);
				
			break;
			}
			case 2:{
				System.out.println("Enter value of node");
				int data = scn.nextInt();
				head = ll.addLastNode(data,head);
				break;
			}
			case 3:{
				
				head = ll.deleteFirst(head);
				break;
			}
			
			case 4:{
				
				head = ll.deleteLast(head);
				break;
			}
			
			case 5:{
				
				ll.traversal(head);
				
				break;
			}
			
			case 6:{
				head = ll.reverse(head);
				break;
			}
			case 7:{
				System.out.println("Enter value to delete: ");
				int data = scn.nextInt();
				head = ll.deleteMatching(data,head);
				break;
			}
			case 8:{
				System.out.println("Enter nth node: ");
				int nth = scn.nextInt();
				ll.nthNode(nth, head);
				break;
			}
			case 9:{
				flag = false;
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		}
		
		
		

	}

}
