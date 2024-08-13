package recursion;

import java.util.Scanner;

public class Factorial {
	
	public static int fact(int num)
	{
		if(num == 0)
		{
			return 1;
		}
		else
		{
			return num * fact(num - 1);
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number to calculate factorial: ");
		int num = scn.nextInt();
		
		System.out.println(fact(num));
		scn.close();

	}

}
