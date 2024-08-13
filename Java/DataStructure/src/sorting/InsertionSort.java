package sorting;

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] arr = {6,3,5,1,4,7,9};
		
		for(int i=1; i<arr.length; i++)
		{
			int temp = arr[i];
			for(int j = i-1; j>=0; j--)
			{
				if(arr[j] > temp)
				{
					
					arr[j+1] = arr[j];
					arr[j] = temp;
				}	
			}
		}
		
		for(int k=0; k<arr.length; k++)
		{
			System.out.println(arr[k]);
		}

	}

}
