package searching;

import java.util.Scanner;

public class BinarySearch {
	
	public static int binarySearch(int num, int[] arr)
	{
		int mid, left=0, right=arr.length-1;
		
		while(left<=right)
		{
			mid = (int)Math.ceil((left + right)/2.0);
			System.out.println(mid);
			if(arr[mid] >= num)
			{
				if(arr[mid] == num)
				{
					
					return mid;
				}
				right = mid-1;
				
			}
			else if(arr[mid] <= num)
			{
				if(arr[mid] == num)
				{
					return mid;
				}
				left = mid + 1;
				
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4};
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number to search: ");
		int num = scn.nextInt();
		int res = binarySearch(num, arr);
		System.out.println(res ==  -1 ? "Element not found." : "Element found at "+res+" index." );

	}

}
