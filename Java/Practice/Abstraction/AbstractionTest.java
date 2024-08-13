
public class AbstractionTest {
    
    public static void main(String[] args)
    {
        Abstraction A1 = new Abstraction();

        A1.setName("Rituraj");
        A1.setAddress("India");
        A1.setPhone(8340163058l);
        // A1.name = "ritu";

        System.out.println("Name = "+ A1.getName());
        System.out.println("Address = "+ A1.getAddress());
        System.out.println("Phone = "+ A1.getPhone());

        
    }
}
