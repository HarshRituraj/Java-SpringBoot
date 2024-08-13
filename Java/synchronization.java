public class synchronization {

    public static void main(String[] args)
    {
        myThread t1 = new myThread("Ritu");
        myThread t2 = new myThread("Harsh");

        t1.start();
        t2.start();
    }
    
}
