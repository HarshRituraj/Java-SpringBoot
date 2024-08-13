package alphabetNum;

import java.util.Scanner;

public class SubStr {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter first string: ");
		String str1 = scn.nextLine();
		
		System.out.println("Enter second string: ");
		String str2 = scn.nextLine();
		
		String small="";
		String large="";
		
		if(str1.length() > str2.length())
		{
			large = str1;
			small = str2;
		}
		else
		{
			large = str2;
			small = str1;
		}
		
		String subStr = large.substring(large.length()-small.length());
		System.out.println("Substr: "+subStr);
		System.out.println("small: "+small);
		if(subStr.equals(small))
		{
			System.out.println("Ends with same");
		}
		else
		{
			System.out.println("Do not ends with same");
		}


	}

}
