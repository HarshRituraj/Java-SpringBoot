public class mainThread {

    public static void main(String[] args) throws InterruptedException
    {

        childThread t = new childThread();
        t.start();

        synchronized (t)
        {
            t.wait();
            System.out.println(t.sum);
        }
    }
    
}
