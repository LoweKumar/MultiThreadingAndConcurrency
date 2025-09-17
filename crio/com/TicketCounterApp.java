package crio.com;

public class TicketCounterApp {
    public static void main(String[] args) {
        // Step 1: Initialize TicketCounter with 10 tickets
        TicketCounter ticketCounter = new TicketCounter(10);

        // Step 2: Create customer threads
        Thread customer1 = new Thread(new CustomerThread(ticketCounter, "Alice", 4));
        Thread customer2 = new Thread(new CustomerThread(ticketCounter, "Bob", 5));
        Thread customer3 = new Thread(new CustomerThread(ticketCounter, "Charlie", 3));

        // Step 3: Start threads (concurrently)
        customer1.start();
        customer2.start();
        customer3.start();

        // Optional: Wait for all threads to complete
        try {
            customer1.join();
            customer2.join();
            customer3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Display remaining tickets
        System.out.println("Tickets remaining: " + ticketCounter.getAvailableTickets());
    }
}
