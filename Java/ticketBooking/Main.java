// package ticketBooking;

import java.util.Scanner;

 class Main {

    public static void main(String[] args)
    {
        Ticket t1 = new Ticket();
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number of bookings:");
        int bookings = scn.nextInt();
        System.out.println("Enter the available tickets:");
        int available = scn.nextInt();
        t1.setAvailableTickets(available);


        for(int i =0; i<bookings; i++)
        {
            System.out.println("Enter the ticketId:");
            int id = scn.nextInt();
            t1.setTicketId(id);

            System.out.println("Enter price:");
            int price = scn.nextInt();
            t1.setPrice(price);

            System.out.println("Enter the no of tickets:");
            int tickets = scn.nextInt();

            System.out.printf("Available tickets: %d",t1.getAvailableTickets());

            System.out.printf("\nTotal amount: %d",t1.calculateTicketCost(tickets));

            System.out.printf("\nAvailable ticket after booking: %d\n",t1.getAvailableTickets());

        }

    }
}
