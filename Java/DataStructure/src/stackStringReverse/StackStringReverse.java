package stackStringReverse;

import java.util.Scanner;

public class StackStringReverse {

	public static Node push(Node top, String data)
	{
		Node newNode = new Node();
		newNode.setData(data);
		newNode.setNext(null);
		
		if(top == null)
		{
			top = newNode;
			System.out.println( top.getData());
			return top;
		}
		else
		{
			newNode.setNext(top);
			return newNode;
		}
	}
	
	public static Node pop(Node top)
	{
		if(top == null)
		{
			System.out.println("Stack is empty.");
			return top;
		}
		else
		{
			System.out.printf(top.getData()+" ");
			top = top.getNext();
			return top;
		}
	}
	public static void main(String args[])
	{
		Node top = new Node();
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter sentence to reverse");
		String str = scn.nextLine();
		
		String[] words = str.split(" ");
		
		for(int i = 0; i<words.length; i++)
		{
//			System.out.println(words[i]);
			top = push(top,words[i]);
		}
		
		for(int i = 0; i<words.length; i++)
		{
			top = pop(top);
		}
	}
}
