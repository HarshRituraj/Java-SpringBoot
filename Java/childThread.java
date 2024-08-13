public class childThread extends Thread{

    int sum;


    @Override
    public void run()
    {
        synchronized(this)
        {
            for(int i=1; i<=100; i++)
            {
                sum = sum + i;
            }
        }
        this.notify();
    }
    


}
