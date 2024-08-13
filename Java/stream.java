// import java.util.List;
// import java.util.stream.Collector;
// import java.util.stream.Collectors;
// import java.lang.reflect.Array;
import java.util.*;
public class stream {

    public static void main(String[] args) 
    {
        Integer[] arr = {1,2,3,4,5};


        List<Integer> newList =   Arrays.stream(arr).filter(i -> (i%2==0)).collect(Collectors.toList());
        
        for(int i=0; i<newList.size(); i++)
        {
            System.out.println(newList.get(i));
        }
    }
    
}
