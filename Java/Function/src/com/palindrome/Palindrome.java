package com.palindrome;

import java.util.Scanner;

public class Palindrome {
	
	public static boolean checkPalindrome(int num)
	{
		int rev = 0;
		int aux = num;
		while(num != 0)
		{
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		
		return (rev == aux);
	}

	public static void main(String[] args) {
		
		int num;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = scn.nextInt();
		
		System.out.println(num + " is palindrome ? : "+checkPalindrome(num));

	}

}
