package basics;
//Program to show child thread will sleep for 5sec and main thread will complete its execution first
//public class MyThread extends Thread {
//    @Override
//    public void run() {
//        try {
//            System.out.println("Child Thread Start");
//            Thread.sleep(5000);   // Child thread sleeping for 5 sec
//            System.out.println("Child Thread Woke Up");
//            System.out.println("RUNNING");
//            System.out.println("Child Thread Ends");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Main Thread Start");
//        MyThread t1 = new MyThread();
//        System.out.println(t1.getState());
//        t1.start();
//        System.out.println(t1.getState());
//
//        // Main thread continues without waiting for child
//        System.out.println("Main Thread ends");
//    }
//}

//// Program to show main thread will sleep for 5sec and child thread will complete its execution first
//public class MyThread extends Thread {
//    @Override
//    public void run() {
//        System.out.println("Child Thread Start");
//        System.out.println("RUNNING");
//        System.out.println("Child Thread Ends");
//    }
//
//    public static void main(String[] args) throws InterruptedException {
//        System.out.println("Main Thread Start");
//        MyThread t1 = new MyThread();
//        System.out.println(t1.getState());
//        t1.start();
//        System.out.println(t1.getState());
//
//        // Main thread will sleep for 5 seconds
//        Thread.sleep(5000);
//        System.out.println(Thread.currentThread().getState());//to get status of main thread ----prints RUNNABLE
//
//        System.out.println("Main Thread ends");
//    }
//}

//3 Example to Show TIMED_WAITING State
public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(10000); // child thread sleeping for 5 sec
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Child thread finished");
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        System.out.println(t1.getState()); // NEW

        t1.start();
        System.out.println(t1.getState()); // RUNNABLE

        Thread.sleep(5000); // give time for child to start sleeping
        System.out.println("Child Thread State during sleep: " + t1.getState());
        // This should print TIMED_WAITING

        t1.join();
        System.out.println("Child Thread State: " + t1.getState()); // TERMINATED
    }
}


