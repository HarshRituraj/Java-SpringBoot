package recursion;

import java.util.ArrayList;
import java.util.List;

public class IndexcesAll {
	
	public static List<Integer> allIndexces(int arr[], int size, int elem, List<Integer> res)
	{
//		List<Integer> myList = new ArrayList<>();
//		for(int i=0; i<size; i++)
//		{
//			if(arr[i] == elem)
//			{
//				myList.add(i);
//			}
//		}
//		return myList;
		
		if(elem == arr[size-1])
		{
			res.add(size-1);
//			return res;
		}
		
		if(size == 1)
		{
			return res;
		}
		
		return allIndexces(arr, size-1, elem, res);
	}

	public static void main(String[] args) {
		
		int arr[] = {2,3,4,5,7,5,3};
		
		List<Integer> res = new ArrayList<>();
		res = allIndexces(arr,7,5,res);
		
		for(Integer i : res)
		{
			System.out.println(i);
		}

	}

}
