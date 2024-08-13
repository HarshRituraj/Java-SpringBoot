class method
{
	double avg(double a, double b)
	{
		return sum(a,b)/2;
	}


	double sum(double c,double d)
	{
		return (c + d);
	}

public static void main(String[] args)
{
	int num1=12,num2=13;
	method m = new method();
	System.out.println(m.avg(num1,num2));
	//System.out.println(method.avg(num1,num2));
}

}