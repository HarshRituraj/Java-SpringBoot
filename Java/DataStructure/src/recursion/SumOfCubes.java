package recursion;

import java.util.Scanner;

public class SumOfCubes {
	
//	public static double sumOfCubes(int num)
//	{
//		if(num == 0)
//		{
//			return 0;
//		}
//		else
//		{
//			return Math.pow(num, 3) + sumOfCubes(num-1);
//		}
//	}
	
	public static int sumOfCubes(int num, int pow)
	{
		if(num == 0)
		{
			return 1;
		}
		else
		{
			return  + (num * sumOfCubes(num, pow-1));
		}
	}

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scn.nextInt();
		
		System.out.println(sumOfCubes(num,3));
		scn.close();

	}

}
