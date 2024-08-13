public class passenger {

    private int id;
    private String firstName;
    private String lastName;

    void setId(int id)
    {
        this.id = id;
    }

    void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    int getId()
    {
        return id;
    }

    String getFirstName()
    {
        return firstName;
    }
    
    String getLastName()
    {
        return lastName;
    }

    @Override
    public boolean equals(Object obj)
    {
        passenger p = (passenger) obj;

        if(this.getId() == p.getId() && this.getFirstName() == p.getFirstName() && this.lastName == p.getLastName() )
        return true;

        return false;
    }
    
}
