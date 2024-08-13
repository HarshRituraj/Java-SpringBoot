import java.util.*; 
class areaCalculator
{

	static void area(float radius)
	{	
		System.out.println("Area of circle = "+ 3.14*radius*radius);
		System.out.println("Circumference of cirlce ="+2*3.14*radius);
	}
	
	static void area(float length, float breadth)
	{
		System.out.println("Area of rectangle ="+length*breadth);
		System.out.println("Perimeter of rectangle ="+2*(length+breadth));
	}
	
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter 1 for circle.");
		System.out.println("Enter 2 for Rectangle or Square.");
		int choice = scn.nextInt();

		switch(choice)
		{
			case 1:
			System.out.println("Enter radius of circle:" );
			float radius = scn.nextFloat();
			area(radius);
			break;

			case 2:
			System.out.println("Enter radius of circle:" );
			float length = scn.nextFloat();
			float breadth = scn.nextFloat();
			area(length, breadth);
			break;
	
			default:
			System.out.println("Invalid choice!!!");
		}	
		
		scn.close();
	}
}