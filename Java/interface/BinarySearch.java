

public class BinarySearch {

    private Sorting algo;

    public BinarySearch(Sorting algo)
    {   super();
        this.algo = algo;
    }

    public int search(int[] numbers, int valueToBeSearched)
    {
        numbers = algo.sort(numbers);
        
        return 3;
    }
    
}
