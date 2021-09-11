package test;

/**
 * @program: LeetCode
 * @description: show that thread is not safe
 * @author: Keyang Wang
 * @create: 2021-09-11 13:30
 **/
public class BuyTickets implements Runnable{
    //define the ticket number
    private int ticketNumber = 10;


    @Override
    public void run() {
        boolean flag = true;
        while (flag){
            if(ticketNumber <=0){
                flag = false;
                return;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "buy the tickets " + ticketNumber--);

        }

    }

    public static void main(String[] args) {
        BuyTickets buyTickets = new BuyTickets();
        new Thread(buyTickets,"a").start();
        new Thread(buyTickets,"b").start();
        new Thread(buyTickets,"c").start();

    }
}


