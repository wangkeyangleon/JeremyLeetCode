package test;

/**
 * @program: LeetCode
 * @description: test yield thread
 * @author: Keyang Wang
 * @create: 2021-09-09 21:26
 **/
public class TestYield implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+ "Start");
        Thread.yield();
        System.out.println(Thread.currentThread().getName()+ "End");

    }

    public static void main(String[] args) {
        TestYield testYield = new TestYield();
        new Thread(testYield,"a").start();
        new Thread(testYield,"b").start();
    }
}
