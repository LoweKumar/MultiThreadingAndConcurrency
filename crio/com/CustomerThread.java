package crio.com;

public class CustomerThread implements Runnable {
    private final TicketCounter ticketCounter;
    private final String customerName;
    private final int numberOfTickets;

    public CustomerThread(TicketCounter ticketCounter, String customerName, int numberOfTickets) {
        this.ticketCounter = ticketCounter;
        this.customerName = customerName;
        this.numberOfTickets = numberOfTickets;
    }

    @Override
    public void run() {
        ticketCounter.bookTicket(customerName, numberOfTickets);
    }
}
