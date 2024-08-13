public class myThread extends Thread {

    String name;

    myThread(String name)
    {
        this.name = name;
    }

    public void run()
    {
        displayMessage.sayHello(name);
    }

    
}
