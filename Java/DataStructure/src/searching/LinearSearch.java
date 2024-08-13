package searching;

import java.util.Scanner;

public class LinearSearch {
	
	public static int linearSearch(int element, int[] arr) 
	{
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i] == element)
			{
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		int[] arr = {3,7,2,8,5,9};
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter element to search: ");
		int element = scn.nextInt();
		
		int res = linearSearch(element,arr);
		
//		if(res == -1)
//		{
//			System.out.println("Element not found.");
//		}
//		else
//		{
//			System.out.println("Element found on "+res+" index.");
//		}
		
		System.out.println((res==-1) ? "Element not found." : "Element found on "+res+" index.");
//		String str = (res == -1) ? "Element not found." : "Element found on "+res+" index.";
//		System.out.println(str);

	}

}
