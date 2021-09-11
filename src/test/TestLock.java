package test;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: LeetCode
 * @description: test lock
 * @author: Keyang Wang
 * @create: 2021-09-11 14:50
 **/
public class TestLock {
    public static void main(String[] args) {
        BuyTicket buyTicket = new BuyTicket();
        new Thread(buyTicket,"a").start();
        new Thread(buyTicket,"b").start();
    }

}

class BuyTicket implements  Runnable{
    int ticket = 10;

    // add lock
    private final ReentrantLock lock = new ReentrantLock();


    @Override
    public void run() {
        while (true){
            try {
                lock.lock();
                if (ticket > 0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(ticket--);
                }else {
                    break;
                }
            }finally {
                lock.unlock();
            }

        }
    }
}
