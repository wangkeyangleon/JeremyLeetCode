package test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: LeetCode
 * @description: thread Pool
 * @author: Keyang Wang
 * @create: 2021-09-11 16:03
 **/
public class TestThreadPool {
    public static void main(String[] args) {
        //create service and thread pool
        ExecutorService service = Executors.newFixedThreadPool(10);
        //executor
        service.execute(new MyThread1());
        service.execute(new MyThread1());
        service.execute(new MyThread1());
        service.execute(new MyThread1());

        //close service
        service.shutdown();

    }


}

class MyThread1 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
