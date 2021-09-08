package test;

/**
 * @program: LeetCode
 * @description: this class to show the thread
 * @author: Keyang Wang
 * @create: 2021-09-08 19:36
 **/
//extend thread class
public class TestThread extends Thread {

    //rewrite the run method
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("I am thread: "+ i);
        }
    }

    // this is main thread
    public static void main(String[] args) {
        //create thread instance
        TestThread testThread = new TestThread();
        //invoke start method
        testThread.start();
        for (int i = 0; i <10 ; i++) {
            System.out.println("I am main thread"+i);
        }

    }
}
