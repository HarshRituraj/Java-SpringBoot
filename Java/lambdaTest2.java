public class lambdaTest2 implements lambda {

    public void myMethod() {
        System.out.println("Under myMethod implementation.");


    };

    public static void main(String[] args)
    {
        lambda l = new lambdaTest2();

        l.myMethod();
    }
    
}
