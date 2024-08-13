package alphabetNum;

import java.util.Scanner;

public class StringPalin {

	public static void main(String[] args) throws Exception {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str = scn.nextLine();
		
		
		String reverse = "";
//		
//		for(int i=str.length()-1; i>=0; i--)
//		{
//			reverse += str.charAt(i);
//		}
		
		reverse = new String(new StringBuffer(str).reverse());
		
		if(str.equals(reverse))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}

	}

}
