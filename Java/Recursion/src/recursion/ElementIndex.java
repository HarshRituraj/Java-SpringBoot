package recursion;

import java.util.Scanner;

public class ElementIndex {

	public static int elementIndex(int arr[], int size, int n, int element)
	{
		if(size == n)
		{
			return -1;
		}
		if(arr[n] == element)
		{
			return n;
		}
		return elementIndex(arr, size, n+1, element);
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = {2,6,3,4,2,5,6};
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter element to search");
		int elem = scn.nextInt();
		System.out.println(elem+" found at index: "+elementIndex(arr, arr.length,0, elem));
	}

}
