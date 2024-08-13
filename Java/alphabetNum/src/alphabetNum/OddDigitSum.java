package alphabetNum;

import java.util.Scanner;

public class OddDigitSum {
	
	public static int checkSum(int num)
	{
		int sum=0;
		while(num != 0)
		{
			int digit = num % 10;
			if(digit % 2 != 0)
			{
				sum += digit;
			}
			num = num / 10;
		}
		return sum%2 == 0 ? 1 : -1;
	}

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scn.nextInt();
		System.out.println(checkSum(num));
		scn.close();

	}

}
