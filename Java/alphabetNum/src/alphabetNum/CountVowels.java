package alphabetNum;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str = scn.nextLine();
		int vowelCount = 0;
		int consonantCount = 0;
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i) =='a' || str.charAt(i) =='e' || str.charAt(i) =='i' || str.charAt(i) =='o' || str.charAt(i) =='u')
			{
				vowelCount += 1;
			}
			else if(!(str.charAt(i) == ' ' || str.charAt(i) == '@' || str.charAt(i) == '.' || str.charAt(i) == ',' || str.charAt(i) == '\''))
			{
				consonantCount += 1;
			}
		}
		System.out.println("No. of vowels are: "+vowelCount);
		System.out.println("No. of consonant are: "+consonantCount);
	}

}
