import java.util.Scanner;

public class string {

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        String str = scn.next();

        if(str.equals("hello"))
        System.out.println(str);
        else
        System.out.println("Not equal");

        scn.close();

    }
    
}
