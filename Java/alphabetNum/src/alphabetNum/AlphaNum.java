package alphabetNum;

import java.util.Scanner;

public class AlphaNum {

	public static void main(String[] args) throws Exception {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str = scn.nextLine();
		System.out.println(str);
		String regex = "^[a-zA-Z0-9]+$"; 
		if(str.matches(regex))
		{
			System.out.println(str.toUpperCase());
		}
		else
		{
			throw new Exception("String contains special characters");
		}

	}

}
