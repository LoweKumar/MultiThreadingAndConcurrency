package crio.com;

public class TableCreatorApp {
    public static void main(String[] args) throws InterruptedException {
        // Input: n (you can replace with Scanner if needed)
        int n = 5;  // Example input

        // 1. Loop through each number from 1 to n
        for (int i = 1; i <= n; i++) {
            // 2. Create a new Thread with TableCreator
            Thread thread = new Thread(new TableCreator(i));

            // 3. Start the thread
            thread.start();

            // 4. Wait for the thread to finish before starting next one
            thread.join();
        }
    }
}
