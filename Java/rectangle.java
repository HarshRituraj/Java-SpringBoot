import java.util.*;

class rectangle
{

    static float length;
    static float breadth;

   static float area()
    {
        // this.length = length;
        // this.breadth = breadth;

        return length * breadth;
    }

    static float perimeter()
    {
        return (2*(length+breadth));
    }

    public static void main(String[] args)
    {
        // rectangle r1 = new rectangle();
        length=5;
        breadth=10;

        System.out.println("Area = "+area()); 
        System.out.println("Perimeter = "+perimeter());

        length = 10;
        breadth = 20;

        

        System.out.println(area());
        System.out.println(perimeter());

    }
}