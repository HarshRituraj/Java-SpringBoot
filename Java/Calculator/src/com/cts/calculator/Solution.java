package com.cts.calculator;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Adder add = new Adder();
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		System.out.println("Testing Addition");
		System.out.println("Sum = "+add.add(a, b));
		System.out.println();
		System.out.println("Testing Multiplication");
		Multiplier m = new Multiplier();
		
		int product = m.multiply(a, b, add);
		
		System.out.println("Product = "+product);
		scn.close();
	}
}
