// package ticketBooking;

public class Ticket {

    private int ticketid;
    private int price;
    private static int availableTickets;

    public void setTicketId(int ticketid)
    {
        this.ticketid = ticketid;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    public void setAvailableTickets(int availableTickets)
    {
        this.availableTickets = availableTickets;
    }

    public int getTicketId()
    {
        return ticketid;
    }

    public int getPrice()
    {
        return price;
    }

    public static int getAvailableTickets()
    {
        return availableTickets;
    }
    
    public int calculateTicketCost(int nooftickets)
    {
        if(availableTickets >= nooftickets)
        {
            availableTickets = availableTickets - nooftickets;

            return price*nooftickets;
        }
        else
        {
            return -1;
        }
    }

    public static void main(String[] args)
    {

    }
}
