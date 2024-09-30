package task_1;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test_Task_1 {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        Bank bank = new Bank();

        Runnable runnable = ()->{
            lock.lock();
            for (int i = 0; i < 1000; i++) {
                bank.increaseBalance();
            }
            lock.unlock();
        };
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);

        t1.start();
        t2.start();
        t3.start();

        Thread.sleep(2000);

        System.out.println(bank);
    }

}
