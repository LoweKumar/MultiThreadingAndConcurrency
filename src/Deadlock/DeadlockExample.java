package Deadlock;

public class DeadlockExample {
    public static void main(String[] args) {
        Pen pen = new Pen();
        Paper paper = new Paper();

        Thread thread1 = new Thread(new Task1(pen, paper), "Thread-1");
        Thread thread2 = new Thread(new Task2(pen, paper), "Thread-2");

        thread1.start();
        thread2.start();
    }

    /*
========================================
Four Required Conditions for Deadlock:
========================================
Condition	        Present?	Explanation
-----------------	----------	----------------------------------------------
Mutual exclusion	✔	        synchronized blocks allow only one thread at a time
Hold & Wait        	✔	        Thread-1 holds Pen & waits for Paper
No preemption	    ✔	        Locks cannot be forcibly released
Circular Wait	    ✔	        Thread-1 waits for Paper, Thread-2 waits for Pen
    */
}
