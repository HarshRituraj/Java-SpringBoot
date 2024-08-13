public class staticMethod {

    static int num1;
    static int num2;

   public static int add()
    {
        return num1 + num2;
        // System.out.println("Under static add method.");

    }

    public static void main(String[] args)
    {
        //staticMethod s1 = new staticMethod();
        num1 = 10; 
        num2 =20;
        System.out.println( add());
    }
    
}
