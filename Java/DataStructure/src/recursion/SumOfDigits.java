package recursion;

import java.util.Scanner;

public class SumOfDigits {

	static int res=0;
	public static int sumOfDigits(int num)
	{
		if(num == 0)
		{
			return 0;
		}
		else
		{
			
			return num%10 + sumOfDigits(num/10);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scn.nextInt();
		
		System.out.println(sumOfDigits(num));
		scn.close();

	}

}
