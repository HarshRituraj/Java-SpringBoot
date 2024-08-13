class array
{
	static int max(int a[])
	{	int maximum = a[0];
		for(int i=0; i<6; i++)			
		{
			if(a[i] > maximum)
			{
				maximum = a[i];
			}
		}

		return maximum;	
	
	} 

	public static void main(String[] args)
	{
		int arr[] = {1,2,13,4,5,6},ret;
		ret = max(arr);
		System.out.println("Max= "+ret);
	}
}
