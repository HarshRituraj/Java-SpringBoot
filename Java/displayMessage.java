public class displayMessage {

    public synchronized static void sayHello(String name)
    {

        for(int i=0; i<10; i++)
        {
            System.out.println("Hello "+name);
            try {
                    Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }
    
}
