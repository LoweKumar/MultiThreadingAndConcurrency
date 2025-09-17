package crio.com;

public class TableCreator implements Runnable {
    private final int number;

    public TableCreator(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        // Generate multiplication table
        for (int i = 1; i <= 10; i++) {
            int product = number * i;
            System.out.println(number + " times " + i + " is " + product);
        }
    }
}
