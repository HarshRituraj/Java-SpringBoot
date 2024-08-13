import java.lang.Math;
class cylinder
{
    float radius;
    float height;

    cylinder()
    {}

    cylinder(float radius, float height)
    {
        this.radius = radius;
        this.height = height;
    }

    double lidArea()
    {
        return Math.PI*radius*radius;
    }

    double circumference()
    {
        return 2*Math.PI*radius;
    }

    double totalSurfaceArea()
    {
        return circumference()*(radius+height);
    }

    double cylinderVolume()
    {
        return lidArea()*height;
    }

    public static void main(String[] args)
    {
        cylinder c1 = new cylinder(7,10);
        System.out.println("TSA= "+c1.totalSurfaceArea());
        System.out.println("Lid Area= "+c1.lidArea());
        System.out.println("Volume= "+c1.cylinderVolume());
    }
}