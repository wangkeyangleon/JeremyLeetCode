package test;

/**
 * @program: LeetCode
 * @description: create a method to stop the thread
 * @author: Keyang Wang
 * @create: 2021-09-08 21:26
 **/
public class StopThread implements Runnable{
    private boolean flag = true;
    @Override
    public void run() {
        int i = 0;
        while (flag){
        System.out.println("I am thread "+ i++);
        }

    }

    //create a method to stop the thread
    public void stop(){
        this.flag = false;
    }

// this is main thread
    public static void main(String[] args) {
        //create instance
        StopThread stopThread = new StopThread();
        //achieve run method
        new Thread(stopThread).start();

        for (int i = 0; i < 10; i++) {
            if(i == 5){
                stopThread.stop();
                System.out.println("Thread is stopping");
                System.out.println("I am main"+i);
            }

        }

    }
}
