package test;

/**
 * @program: LeetCode
 * @description: test synchronized
 * @author: Keyang Wang
 * @create: 2021-09-11 14:08
 **/
public class TestSynchronized {
    public static void main(String[] args) {
        BuyingTickets buyingTickets = new BuyingTickets();
        new Thread(buyingTickets,"a").start();
        new Thread(buyingTickets,"b").start();
        new Thread(buyingTickets,"c").start();
    }

}
class BuyingTickets implements Runnable{
    private int tickets = 10;
    boolean flag = true;


    @Override
    public void run() {
        while (flag){
            buy();
        }

    }

    private synchronized void buy(){
        if (tickets <=0){
            flag = false;
            return;
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "buy the tickets " + tickets--);
    }
}


