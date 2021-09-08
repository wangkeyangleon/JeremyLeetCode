package test;

/**
 * @program: LeetCode
 * @description: simulate the turtle and rabbit racing
 * @author: Keyang Wang
 * @create: 2021-09-08 20:22
 **/
public class Race implements Runnable {
    // define a winner
    //static variable can be shared by every instance
    private static String winner;

    @Override
    public void run() {

        for (int i = 0; i <= 100; i++) {
            if(Thread.currentThread().getName().equals("rabbit") && i%50 ==0){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            boolean flag = checkWinner(i);
            if (flag){
                break;
            }
            System.out.println(Thread.currentThread().getName() + " running " + i + " meters");

        }
    }

    private boolean checkWinner(int meter) {
        if (winner != null){
            return  true;
        }
        if (meter >= 100) {
            winner = Thread.currentThread().getName();
            System.out.println("Winner is " + winner);
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        Race race = new Race();
        new Thread(race,"rabbit").start();
        new Thread(race,"turtle").start();
    }
}
