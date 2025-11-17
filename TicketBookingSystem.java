class TicketBooking {
    private int availableTickets = 1;

    public synchronized void bookTicket(String customerName) {
        if (availableTickets > 0) {
            System.out.println(customerName + " booked the ticket successfully.");
            availableTickets--;
        } else {
            System.out.println(customerName + " tried to book, but tickets are sold out.");
        }
    }
}

public class TicketBookingSystem {
    public static void main(String[] args) {
        TicketBooking booking = new TicketBooking();

        Thread t1 = new Thread(() -> booking.bookTicket("Customer 1"));
        Thread t2 = new Thread(() -> booking.bookTicket("Customer 2"));

        t1.start();
        t2.start();
    }
}
