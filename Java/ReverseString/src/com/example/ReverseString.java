package com.example;

public class ReverseString {
	
	public static void main(String args[])
	{
		String str = "hello world";
		String reverse = "";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			reverse = reverse + str.charAt(i);
		}
		System.out.println("Original String: "+str);
		System.out.println("Reversed String: "+reverse);
		
		//splitting string
		String arr[] = str.split(" ");
		
		for(String a:arr)
		{
			System.out.println(a);
		}
	}
}
