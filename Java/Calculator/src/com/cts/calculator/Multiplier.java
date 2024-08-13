package com.cts.calculator;

public class Multiplier {
	
	int multiply(int a, int b, Calculator calculator)
	{
		int product = a;
		for(int i=1; i<b; i++)
		{
			product = calculator.add(product, a);
		}
		return product;
	}
}
