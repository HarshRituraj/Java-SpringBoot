import java.util.*;
public class searchExample {

    public static void main(String[] args)
    {
        BinarySearch binarySearch = new BinarySearch(new QuickSort());
        
        int ret = binarySearch.search(new int[] {1,2,3},4);

        System.out.println(ret);

        BinarySearch binarySearch2 = new BinarySearch(new BubbleSort());
        binarySearch2.search(new int[] {123},3);
    }

    
}
