package crio.com;

public class TicketCounter {
    private int availableTickets;

    public TicketCounter(int tickets) {
        this.availableTickets = tickets;
    }

    // Synchronized to avoid race conditions
    public synchronized boolean bookTicket(String customerName, int numberOfTickets) {
        if (availableTickets >= numberOfTickets) {
            System.out.println(customerName + " successfully booked " + numberOfTickets + " tickets.");
            availableTickets -= numberOfTickets;
            return true;
        } else {
            System.out.println(customerName + " failed to book tickets. Not enough tickets available.");
            return false;
        }
    }

    // Synchronized getter to ensure consistency
    public synchronized int getAvailableTickets() {
        return availableTickets;
    }
}
