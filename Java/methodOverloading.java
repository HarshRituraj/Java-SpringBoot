public class methodOverloading
{
	static double area(int length, int breadth)
	{
		return (length * breadth);
	}
	
	static double area(int radius)
	{
		return (3.14 * radius * radius);
	}

	public static void main(String[] args)
	{
		System.out.println("Area of rectangle="+area(3,4));
		System.out.println("Area of circle="+area(3));
	}
}