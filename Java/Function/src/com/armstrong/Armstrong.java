package com.armstrong;

import java.util.Scanner;

public class Armstrong {
	
	public boolean checkArmstrong(int num)
	{
		int temp = num;
		int sum = 0;
		while(num != 0)
		{
			sum += (int) Math.pow((num % 10),3);
			num = num / 10;
		}
		return temp == sum;
		
	}
	
	public void printArmstrong()
	{
		for(int i=1; i<500; i++)
		{
			int sum = 0;
			int temp = i;
			int rem=0, cube=0;
			int num = i;
			while(num != 0)
			{
				rem  = num % 10;
				cube = cube + (rem * rem * rem);
				num = num / 10;
			}
			if(temp == cube)
			System.out.println(temp);
		}
	}

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		boolean i = true;
		while(i)
		{
			int num;
			int choice;
			System.out.println("*******************************************");
			System.out.println("1. Check Armstrong");
			System.out.println("2. Print Armstrong");
			System.out.println("3. Exit");
			System.out.println("*******************************************");
			choice = scn.nextInt();
			Armstrong arm = new Armstrong();
			switch (choice) {
			case 1: {
				
				System.out.println("Enter a number: ");
				num = scn.nextInt();
				System.out.println(arm.checkArmstrong(num));
				break;
			}
			case 2: {
				arm.printArmstrong();
				break;
			}
			case 3:{
//				System.exit(0);
				i = false;
				break;
			}
			default:
//				throw new IllegalArgumentException("Unexpected value: " + choice);
				System.out.println("Illegal Argument");
				break;
			}
		}

	}

}
