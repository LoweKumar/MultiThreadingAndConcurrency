package basics;

public class Test {

    public static void main(String[] args){
        System.out.println("Main Thread Start");
//        World world = new World();
//            world.start();
        World world = new World();//NEW state
        Thread thread = new Thread(world);
        thread.start();//RUNNABLE state
        for (; ; ) {
            System.out.println("Hello From Main Thread");
        }

//        System.out.println("Main Thread End");

    }
}
