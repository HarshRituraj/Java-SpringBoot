public class Abstraction {

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

    
}
