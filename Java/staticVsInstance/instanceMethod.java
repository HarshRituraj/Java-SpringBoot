public class instanceMethod {

     int num1;
     int num2;

    instanceMethod(int num1, int num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }

    int add()
    {
        return this.num1 +this.num2;
    }

    public static void main(String[] args)
    {
    //     instanceMethod i1 = new instanceMethod(5, 3);
    //     instanceMethod i2 = new instanceMethod(10, 17);

    //    System.out.println( i1.add());
    //    System.out.println( i2.add());
    }
    
}
