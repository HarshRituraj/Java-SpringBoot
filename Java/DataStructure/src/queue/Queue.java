package queue;

import java.util.Scanner;

public class Queue {
	
	public static Node enqueue(Node front, int data)
	{
		Node newNode = new Node();
		newNode.setData(data);
		newNode.setNext(null);
		
		
		if(front == null)
		{
			front = newNode;
			return front;
		}
		else
		{
			Node prev = null;
			Node temp = front;
			
			while(temp != null)
			{
				prev = temp;
				temp = temp.getNext();
			}
			prev.setNext(newNode);
			return front;
		}
	}
	
	public static Node dequeue(Node front)
	{
		if(front == null)
		{
			System.out.println("Queue is empty.");
			return null;
		}
		else
		{
			System.out.println(front.getData()+" dequeued.");
			front = front.getNext();
			return front;
		}
	}
	
	public static void peek(Node front)
	{
		if(front == null)
		{
			System.out.println("Queue is empty.");		
		}
		else
		{
			System.out.println(front.getData());
		}
	}

	public static void main(String[] args) {
		
		Node front = null;
		Scanner scn = new Scanner(System.in);
		boolean flag = true;
		int choice;
		
		while(flag)
		{
			System.out.println("**************************************");
			System.out.println("1. Enqueue");
			System.out.println("2. Dequeue");
			System.out.println("3. Peek");
			System.out.println("4. Exit");
			System.out.println("**************************************");
			System.out.println("Enter your choice");
			choice = scn.nextInt();
			
			switch (choice) {
			case 1: {
				System.out.println("Enter data");
				int data = scn.nextInt();
				front = enqueue(front,data);
				System.out.println(front);
				break;
			}
			case 2: {
				front = dequeue(front);
				break;
			}
			case 3: {
				System.out.println(front);
				peek(front);
				break;
			}
			case 4: {
				flag = false;
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		}

	}

}
