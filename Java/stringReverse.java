import java.util.Scanner;

public class stringReverse {


static String method2(String str)
{
    // char ch;
    String nstr = "";

    for(int i=0; i<str.length(); i++)
    {
        // ch = str.charAt(i);
        nstr = str.charAt(i) +nstr;
    }

    // System.out.println("Reversed string is: "+nstr);
    return nstr;
}

    public static void main(String[] args)
    {

        String str = new String("hello");
        System.out.print("Enter a string to reverse: ");
        Scanner scn = new Scanner(System.in);
        str = scn.nextLine();

        char[] aux = new char[str.length()];
        for(int i =str.length()-1; i>=0; i--)
        {
            aux[str.length()-1-i] = str.charAt(i);
        }
        

        for(int i=0; i<aux.length; i++)
        System.out.print(aux[i]);
        System.out.println();
        System.out.println("Reversed string is: "+method2(str));

    }
    
}
