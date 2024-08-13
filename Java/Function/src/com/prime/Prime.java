package com.prime;

import java.util.Scanner;

public class Prime {

	public static boolean checkPrime(int num)
	{
		boolean flag = true;
		if(num <= 1)
		{
			return false; 
		}
		else
		{
			for(int i = 2; i*i<=num; i++)
			{
				if(num % i == 0)
				{
					flag = false;
				}
			}
			return flag;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scn.nextInt();
		System.out.println(num + " is prime? : "+checkPrime(num));
		
	}

}
