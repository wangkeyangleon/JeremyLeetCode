package test;

/**
 * @program: LeetCode
 * @description: test join thread
 * @author: Keyang Wang
 * @create: 2021-09-09 21:43
 **/
public class TestJoin implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("VIP thread: "+ i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        TestJoin testJoin = new TestJoin();
        Thread thread = new Thread(testJoin);
        thread.start();

        for (int i = 0; i < 50; i++) {
            if (i==25){
                thread.join();
            }
            System.out.println("Main thread: "+ i);

        }

    }
}
