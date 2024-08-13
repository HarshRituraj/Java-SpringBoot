// package privateAccess;
class privateTest
{
    
    private float length;
    private float breadth;

    void setData(float l, float b)
    {
        length = l;
        breadth =b;
    }

    float getLength()
    {
        return length;
    }

    float getBreadth()
    {
        return breadth;
    }

        double area()
        {
            return getLength()*getBreadth();
        }
}

    public class privateAccess
    {
        public static void main(String[] args)
        {
            privateTest p1 = new privateTest();
            // p1.setData(50, 10);
        System.out.println( "Area "+p1.area());
        System.out.println("L "+p1.getLength());
        System.out.println("B "+p1.getBreadth());

        }
    }

