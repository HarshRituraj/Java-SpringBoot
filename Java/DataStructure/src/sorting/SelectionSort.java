package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] arr = {4,2,7,9,3,10};
		
		int min;
		for(int i = 0; i<arr.length; i++)
		{
			min = arr[i];
			int c=i;
			for(int j=i; j<arr.length; j++)
			{
				if(min > arr[j])
				{
					min = arr[j];
					c=j;
				}
			}
			arr[c] = arr[i];
			arr[i] = min;
		}
		
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}

	}

}
