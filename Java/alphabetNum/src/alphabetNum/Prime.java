package alphabetNum;

public class Prime {

	public static void main(String args[])
	{
		int num=53;
		int flag=0; 
		for(int i = 2; i< num; i++)
		{
			if(num % i == 0)
			{
				flag=1;
				break;
			}
		}
		if(flag == 0)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("Not prime");
		}
	}
}
