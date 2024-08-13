package alphabetNum;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) throws Exception {
		
		Scanner scn = new Scanner(System.in);
		
		int arr[][] = {{1,2},{3,4}};
		
		for(int a[] : arr)
		{
			for(int x:a)
			{
				System.out.print(x+" ");
			}
			System.out.println("");
		}
		
		
	}

}
