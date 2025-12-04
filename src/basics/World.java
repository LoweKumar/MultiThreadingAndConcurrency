package basics;
//1st method to create a thread by extending Thread class
//public class World extends Thread{
//
////    @Override
//    public void run(){
//        System.out.println("World Thread");
//    }
//
//}

//2nd Method to create a thread by implementing Runnable interface
public class World implements Runnable{
    @Override
    public void run(){
        System.out.println("World Thread start");
        for (; ; ) {
            System.out.println("World Thread");
        }
    }

}
