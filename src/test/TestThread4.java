package test;

import java.util.concurrent.*;

/**
 * @program: LeetCode
 * @description: test callable
 * @author: Keyang Wang
 * @create: 2021-09-08 20:46
 **/
public class TestThread4 implements Callable {
    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName());
        return Thread.currentThread().getName();
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TestThread4 t1 = new TestThread4();
        TestThread4 t2 = new TestThread4();
        TestThread4 t3 = new TestThread4();
        //create service
        ExecutorService service = Executors.newFixedThreadPool(3);
        //submit executor
        Future<String> r1 = service.submit(t1);
        Future<String> r2 = service.submit(t2);
        Future<String> r3 = service.submit(t3);

        //get the results
        String result1 = r1.get();
        String result2 = r2.get();
        String result3 = r3.get();

        //close service
        service.shutdown();


    }
}
