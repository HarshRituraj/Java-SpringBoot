package recursion;

public class SortedArray {
	
	public static boolean isSortedArray(int arr[], int size)
	{
		if(size == 1 || size ==0)
		{
			return true;
		}
		if(arr[size-2] > arr[size-1])
		{
			return false;
		}
		
		return isSortedArray(arr, size-1);
	}

	public static void main(String[] args) {
		
		int arr [] = {3,4,5,6,7};
//		System.out.println(arr.length);
		System.out.println(isSortedArray(arr,arr.length));

	}

}
