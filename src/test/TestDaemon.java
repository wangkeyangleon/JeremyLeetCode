package test;

/**
 * @program: LeetCode
 * @description: test daemon thread
 * @author: Keyang Wang
 * @create: 2021-09-09 22:12
 **/
public class TestDaemon {
    public static void main(String[] args) {
        DaemonThread daemonThread = new DaemonThread();
        Thread thread = new Thread(daemonThread);
        thread.setDaemon(true);
        thread.start();

        UserThread userThread = new UserThread();
        new Thread(userThread).start();
    }
}

class DaemonThread implements Runnable {

    @Override
    public void run() {
        while (true) {
            System.out.println("I am daemon");
        }
    }
}

class UserThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 360; i++) {

            System.out.println("all happy");
        }
        System.out.println("bye world");
    }
}
