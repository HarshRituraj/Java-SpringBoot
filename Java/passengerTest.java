public class passengerTest {

    public static void main(String[] args)
    {
        passenger p1 = new passenger();
        passenger p2 = new passenger();

        p1.setId(7);
        p1.setFirstName("Ritu");
        p1.setLastName("Harsh");

        p2.setId(7);
        p2.setFirstName("Ritu");
        p2.setLastName("Harsh");

        System.out.println(p1.equals(p2));
    }
    
}
