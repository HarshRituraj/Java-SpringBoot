package alphabetNum;

import java.util.Scanner;

public class StringOrNum {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = scn.next();
		
//		String alphaNum = "^(?=.*\\d).+$";
		String alphaNum = "^[\\w]*[0-9]+[\\w]*$";
//		String num = "[0-9]+";
//		String alpha = "[a-zA-Z]+";
			
		
			if(str.matches(alphaNum))
			{
				System.out.println("Contains number.");
			}
			else
			{
				System.out.println("Don't contains number.");
			}

	}

}
