package recursion;

import java.util.Scanner;

public class Power {
	
	public static int power(int num, int pow)
	{
		if(pow == 0)
		{
			return (1);
		}
		else
		{
			return num * power(num, pow - 1);
		}
	}

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = scn.nextInt();
		System.out.println("Enter power: ");
		int pow = scn.nextInt();
		
		System.out.println(power(num,pow));
		
		scn.close();

	}

}
