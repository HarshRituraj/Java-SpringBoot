
public class Display implements Printable{

    public void print()
    {
        System.out.println("Printing");
    }

    public static void main(String args[])
    {
        Display d1 = new Display();
        d1.print();
    } 
    
}
