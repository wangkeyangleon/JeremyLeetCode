package test;

/**
 * @program: LeetCode
 * @description: multiple thread manipulate same class
 * @author: Keyang Wang
 * @create: 2021-09-08 20:09
 **/
public class TestThread3 implements Runnable {

    //de fine the number of tickets
    private int ticketsNumber = 100;

    @Override
    public void run() {
        while (ticketsNumber > 0) {
            System.out.println(Thread.currentThread().getName() + " got: "+ticketsNumber--);
        }

    }

    public static void main(String[] args) {
        TestThread3 testThread3 = new TestThread3();
        new Thread(testThread3,"tom").start();
        new Thread(testThread3,"jack").start();
        new Thread(testThread3,"mike").start();
    }
}
