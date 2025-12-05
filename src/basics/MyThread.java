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
//public class MyThread extends Thread {
//    @Override
//    public void run() {
//        try {
//            Thread.sleep(10000); // child thread sleeping for 5 sec
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Child thread finished");
//    }
//
//    public static void main(String[] args) throws InterruptedException {
//        MyThread t1 = new MyThread();
//        System.out.println(t1.getState()); // NEW
//
//        t1.start();
//        System.out.println(t1.getState()); // RUNNABLE
//
//        Thread.sleep(5000); // give time for child to start sleeping
//        System.out.println("Child Thread State during sleep: " + t1.getState());
//        // This should print TIMED_WAITING
//
//        t1.join();//waiting for child thread to end
//        System.out.println("Main Thread ends after waiting for Child Thread to end after 10 sec");
//        System.out.println("Child Thread State: " + t1.getState()); // TERMINATED
//    }
//}



////4
//public class MyThread extends Thread {
//    public MyThread(String name) {
//        super(name);
//    }
//
//    @Override
//    public void run() {
//        System.out.println("Thread is Running...");
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority() + " - count: " + i);
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//
//                }
//            }
//        }
//    }
//
//    public static void main(String[] args) throws InterruptedException {
//
//        MyThread l = new MyThread("Low Priority Thread");
//        MyThread m = new MyThread("Medium Priority Thread");
//        MyThread n = new MyThread("High Priority Thread");
//        l.setPriority(Thread.MIN_PRIORITY);
//        m.setPriority(Thread.NORM_PRIORITY);
//        n.setPriority(Thread.MAX_PRIORITY);
//        l.start();
//        m.start();
//        n.start();
//
//    }
//}



////5 - interrupt demo
//public class MyThread extends Thread {
//    public MyThread(String name) {
//        super(name);
//    }
//
//    @Override
//    public void run() {
//        System.out.println("Thread is Running...");
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public static void main(String[] args) {
//        MyThread t1 = new MyThread("Thread-1");
//
//        System.out.println(t1.getName() + " State: " + t1.getState());
//        t1.start();
//
//        System.out.println(t1.getName() + " State: " + t1.getState());
//        t1.interrupt();
//
//    }
//}


////6 - Yield Demo
//public class MyThread extends Thread {
//    public MyThread(String name) {
//        super(name);
//    }
//
//    @Override
//    public void run() {
//        for (int i = 1; i <= 5; i++) {
//            System.out.println(Thread.currentThread().getName() + " - count: " + i);
//            Thread.yield();
//        }
//    }
//
//    public static void main(String[] args) {
//       MyThread t1 = new MyThread("Thread-1");
//       MyThread t2 = new MyThread("Thread-2");
//       t1.start();
//       t2.start();
//
//    }
//}




////7. Daemon Thread Demo
//class MyThread extends Thread{
//    public MyThread(String name){
//        super(name);
//    }
//
//   @Override
//    public void run(){
//        while(true) {
//           System.out.println("Hello");
//       }
//   }
//
//    public static void main(String[] args) {
//        MyThread t1 = new MyThread("Daemon Thread");
//        t1.setDaemon(true);
//        t1.start();
//        System.out.println("Main Thread Ends");
//
//    }
//}




//8. Synchronization Demo


