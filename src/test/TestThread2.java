package test;

/**
 * @program: LeetCode
 * @description: new thread with runnable
 * @author: Keyang Wang
 * @create: 2021-09-08 19:49
 **/
//implement runnable interface
public class TestThread2  implements  Runnable{

    //rewrite run method
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("I am thread ");

        }

    }

    //this is main thread
    public static void main(String[] args) {
        //create instance
        TestThread2 testThread2 = new TestThread2();
        //create Thread class and proxy the the TestThread2
       // Thread thread = new Thread(testThread2);
       // thread.start();
        // can be write in this way
        new Thread(testThread2).start();

        for (int i = 0; i < 2000; i++) {
            System.out.println("I am main thread");
        }
    }
}
