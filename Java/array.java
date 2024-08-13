import java.util.Scanner;

public class array {

    public static int[] arrayManupulate(int[] arr)
    {
        System.out.println("under arraymanupulate");
        for(int i=0; i<10; i++)
        {
            System.out.println("under for loop of am");
            if(i < 9)
            {
                if(arr[i] == 3 && arr[i+1] == 5)
                {
                    arr[i+1] = 0;
                }
            }
        }

        System.out.println("for loop exited of am");
        return arr;
    }

    public static void main(String[] args)
    {
        int[] arr = new int[10];

        Scanner scn = new Scanner(System.in);

        for(int i = 0; i<10; i++)
        {
            arr[i] = scn.nextInt();
        }

       arr = arrayManupulate(arr);

       for(int element: arr)
       {
        System.out.println(element);
       }
    }
    
}
