import java.util.Scanner;

public class lambadaAddTest implements lambdaAdd {

    
    public void add(int num1 , int num2)
    {
        System.out.println("Sum= "+(num1+num2));
    }

public static void main(String[] args)
{
    // lambdaAdd la = ()-> Scanner scn = new Scanner();

    // int a = scn.nextInt();
    // int b = scn.nextInt();
    // System.out.println("Sum = "+(a+b));;

    // lambdaAdd laa = new lambadaAddTest();
    // laa.add();
    lambdaAdd la = new lambadaAddTest();
    la.add(5,3);
}
    
}
