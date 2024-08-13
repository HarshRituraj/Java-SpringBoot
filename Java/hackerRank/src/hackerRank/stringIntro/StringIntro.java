package hackerRank.stringIntro;

import java.util.Scanner;

public class StringIntro{
	
	public static void main(String args[])
	{
		String str1, str2;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter first string ");
		str1 = scn.next();
		
		System.out.println("Enter second string ");
		str2 = scn.next();
		
		StringBuilder stb1 = new StringBuilder(str1);
		StringBuilder stb2 = new StringBuilder(str2);
		
		StringBuilder stb0Index = new StringBuilder(str1.charAt(str1.length()-1)+"");
		StringBuilder stb1Index = new StringBuilder(str2.charAt(0)+"");
		
		str1 = stb0Index.toString().toUpperCase();
		str2 = stb1Index.toString().toUpperCase();
		
		stb1.replace(stb1.length()-1, stb1.length(), str1);
		stb2.replace(stb2.length()-1, stb2.length(), str2);
		
		System.out.println(stb1 + " "+ stb2);
		
	}
}