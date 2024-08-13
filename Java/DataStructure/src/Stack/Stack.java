package Stack;

import java.util.Scanner;

import lindedList.Node;

public class Stack {
	
	public boolean isEmpty(Node top)
	{
		return top==null?true:false;
		
	}

	public Node push(int data, Node top)
	{
		Node newNode = new Node();
		newNode.setData(data);
		newNode.setNext(null);
		
		if(isEmpty(top))
		{
			return newNode;
		}
		else
		{
			newNode.setNext(top);
			top = newNode;
			return top;
			
		}
	}
	
	public Node pop(Node top)
	{
		if(isEmpty(top))
		{
			System.out.println("Stack is empty.");
			return top;
		}
		else
		{
			System.out.println(top.getData()+" Popped");
			top = top.getNext();
			return top;
		}
	}
	
	public void peek(Node top)
	{
		if(isEmpty(top))
		{
			System.out.println("Stack is empty.");
		}
		else
		{
			System.out.println(top.getData());
		}
	}
	public static void main(String[] args) {
		
		boolean flag = true;
		int choice;
		Stack s = new Stack();
		Node top = null;
		Scanner scn = new Scanner(System.in);
		while(flag)
		{
			System.out.println("**************************");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Peek");
			System.out.println("4. IsEmpty");
			System.out.println("5. Exit");
			System.out.println("**************************");
			System.out.println("Enter your choice:");
			choice = scn.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter data: ");
				int data = scn.nextInt();
				top = s.push(data,top);
				break;
			}
			case 2:{
				top = s.pop(top);
				break;
			}
			case 3:{
				s.peek(top);
				break;
			}
			case 4:{
				boolean res = s.isEmpty(top);
				System.out.println("Stack is empty: "+res);
				break;
			}
			case 5:{
				flag = false;
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		}

	}

}
