public class abstraction {

    private String name;
    private String address;
    private long phone;

    void setName(String name)
    {
        this.name= name;
    }

    void setAddress(String address)
    {
        this.address = address;
    }

    void setPhone(long phone)
    {
        this.phone = phone;
    }

    String getName()
    {
        return name;
    }

    String getAddress()
    {
        return address;
    }

    long getPhone()
    {
        return phone;
    }



    public static void main(String[] args)
    {
        abstraction a1 = new abstraction();

        a1.setName("Rituraj");
        a1.setAddress("India");
        a1.setPhone(8340163058l);
        a1.name = "ritu";

        System.out.println("Name = "+ a1.getName());
        System.out.println("Address = "+ a1.getAddress());
        System.out.println("Phone = "+ a1.getPhone());

        
    }
    
}
