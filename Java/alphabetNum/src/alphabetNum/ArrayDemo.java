package alphabetNum;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) throws Exception {
		
		Scanner scn = new Scanner(System.in);

/* declaring and printing array
		int arr[] = {1,2,3,4,5};
		
		
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("");
*/
		
/*max from array 
		int a[] = new int[5];
		a[0] = 5;
		a[1] = 10;
		a[2] = 20;
		a[3] = 12;
		a[4] = 7;
		
		int max = a[0];
		for(int j = 0; j<a.length; j++)
		{
			if(max < a[j])
			{
				max = a[j];
			}
		}
		System.out.println(max);
*/
		
/* reversing an array 
		int a[] = new int[6];
		
		a[0] = 5;
		a[1] = 10;
		a[2] = 20;
		a[3] = 40;
		a[4] = 80;
		a[5] = 160;
		
		int aux;
		for(int i=0; i<a.length/2; i++)
		{
			aux = a[i];
			a[i] = a[a.length-1-i];
			a[a.length-1-i] = aux;
		}
		
		for(int i:a)
		{
			System.out.println(i);
		}
*/
		
/* palindrome number 
		int num = 12121;
		int temp = num;
		int rev = 0;
		while(num != 0)
		{
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		
		if(rev == temp)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
*/
		
/* factorial 
		int num = 5;
		int fact = 1;
		for(int i =1; i<=num; i++)
		{
			fact = fact * i;
		}
		System.out.println(fact);
		
*/
		/* Armstrong number 
		int num = 407;
		int temp = num;
		int sum = 0;
		int rem = 0;
		while(num != 0)
		{
			rem = num % 10;
			sum = sum + rem * rem * rem; 
			num = num / 10;
		}
		System.out.println(sum == temp);
*/
/* fibonacci series 
		int n1 = 0 , n2 = 1, n3 = 0;
		int elements = 15;
		System.out.print(n1 + " "+n2);
		for(int i = 2 ; i< elements; i++)
		{
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" "+n3);
		}
*/
		
		
	}
}
