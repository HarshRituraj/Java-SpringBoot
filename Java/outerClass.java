public class outerClass {


    static void outerMethod()
    {
        System.out.println("Outer class method.");
    }

    static class innerClass
    {
       static  void innerMethod()
        {
            System.out.println("Inner class method.");
        }
    } 

    public static void main(String[] args)
    {
        // outerClass o1=new outerClass();

        outerClass.outerMethod();

        outerClass.innerClass.innerMethod();


    }
    
}
