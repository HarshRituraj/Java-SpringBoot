package recursion;

import java.util.Scanner;

public class SumUptoN {

	public static int sum(int num)
	{
		if(num == 0)
		{
			return 0;
		}
		else
		{
			return num + sum(num - 1);
		}
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter n: ");
		int num = scn.nextInt();
//		System.out.println(num);
		System.out.println(sum(num));
		scn.close();

	}

}
