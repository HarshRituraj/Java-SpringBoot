package alphabetNum;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a string to reverse: ");
		String s = scn.next();
		StringBuilder str = new StringBuilder(s);
		
		str.reverse();
		System.out.println(str);
		System.out.println(s);
		
		if(str.toString().equals(s))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}

	}

}
