package lockDemo;

public class Main {
    public static void main(String[] args){
        BankAccount sbi = new BankAccount();
        Runnable withdrawTask = new Runnable(){
            @Override
            public void run(){
                sbi.withdraw(50);
            }
        };

        Thread t1 = new Thread(withdrawTask);
        Thread t2 = new Thread(withdrawTask);
        t1.start();
        t2.start();

    }
}
