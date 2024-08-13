package alphabetNum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class OddPlaceSum {

	public static int oddPlaceSum(int num)
	{
		List<Integer> myList = new ArrayList<>();
		Stack<Integer> myStack = new Stack<>();
		while(num != 0)
		{
			int digit = num % 10;
			myList.add(digit);
			myStack.add(digit);
			num = num / 10;
		}
		
		int count = 1;
		int oddSum = 0;
		while(!myStack.isEmpty())
		{
			if(count % 2 != 0)
			{
				oddSum += myStack.pop();
				
			}
			else
			{
				myStack.pop();
			}
			count++;
		}
		return oddSum;
	}
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scn.nextInt();
		System.out.println(oddPlaceSum(num));
		scn.close();
		
	}

}
