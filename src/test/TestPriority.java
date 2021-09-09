package test;

/**
 * @program: LeetCode
 * @description: test priority
 * @author: Keyang Wang
 * @create: 2021-09-09 22:01
 **/
public class TestPriority {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+ " -> " + Thread.currentThread().getPriority());
        MyThread myThread = new MyThread();
        Thread t1 = new Thread(myThread,"t1");
        Thread t2 = new Thread(myThread,"t2");
        Thread t3 = new Thread(myThread,"t3");
        Thread t4 = new Thread(myThread,"t4");
        t1.start();
        t2.setPriority(1);
        t2.start();
        t3.setPriority(Thread.MAX_PRIORITY);
        t3.start();
        t4.setPriority(3);
        t4.start();




    }

}
class MyThread implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+ " -> " + Thread.currentThread().getPriority());
    }
}
