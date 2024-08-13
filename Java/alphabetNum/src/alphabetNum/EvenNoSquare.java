package alphabetNum;

import java.util.Scanner;

public class EvenNoSquare {

	public static int evenNoSquare(int num)
	{
		int sqSum = 0;
		while(num != 0)
		{
			int digit = num % 10;
			if(digit % 2 == 0)
			{
				sqSum += Math.pow(digit, 2);
			}
			num = num / 10;
		}
		return sqSum;
	}
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scn.nextInt();
		System.out.println(evenNoSquare(num));
		scn.close();

	}

}
