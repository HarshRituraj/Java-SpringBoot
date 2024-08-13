public class b implements a {


    public void meth()
    {
        System.out.println("Under meth of b.");
    }
    public static void main(String[] args)
    {
        a a1 = new b();
        a1.meth();
    }
    
}
