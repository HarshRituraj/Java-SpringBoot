package sorting;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr = {5,3,7,2,9};
		
		
		int i=0;
		while(i < arr.length-1)
		{
			if(arr[i] > arr[i+1])
			{
				int temp = arr[i+1];
				arr[i+1] = arr[i];
				arr[i] = temp;
				i=0;
			}
			else
			{
				i++;
			}
			
		}

		for(int j=0; j<arr.length; j++)
		{
			System.out.println(arr[j]);			
		}
	}

}
