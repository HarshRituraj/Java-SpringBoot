
public class OverloadingExp {

    public float area(float length, float breadth)
    {
        return (float)(length * breadth);
    }

    public float area(float radius)
    {
        return (float)(3.14 * radius * radius);
    }

    //testing for overloading -> methods having same no of parameters of same data types, but sequence is different 

    // public void no(String str, int num)
    // {
    //     System.out.println("String num called.");
    // }

    // public void no(int num, String str)
    // {
    //     System.out.println("int String called.");
    // }

        //main method can also be overloaded 
        // public static void main(String args){System.out.println("main with String");}  
        // public static void main(){System.out.println("main without args");}

        public static void main(String[] args) {
            
            OverloadingExp obj1 = new OverloadingExp();
            System.out.println( obj1.area(2.2f));
            System.out.println( obj1.area(2.5f, 2.3f));
            

            // obj1.no( 7,"ritu");

            // main("hello");
            // main();


        }
}
