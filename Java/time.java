import java.util.Scanner;

public class time {

    public static void main(String[] args)
    {
        long start = System.currentTimeMillis();

        // Scanner scn = new Scanner(System.in);
        // int num = scn.nextInt();

        for(int i=1; i<=10; i++)
        {
            System.out.println(i*5);
        }

        long end = System.currentTimeMillis();
        System.out.println("execution time: "+(end - start));

    }
    
}
