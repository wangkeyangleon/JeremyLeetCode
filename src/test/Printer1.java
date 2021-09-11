package test;

/**
 * @program: LeetCode
 * @description:
 * @author: Keyang Wang
 * @create: 2021-09-11 17:39
 **/
public class Printer1 implements Runnable{
        int id;
        static int num = 1;

        public Printer1(int id) {
            this.id = id;
        }

        @Override
        public void run() {
            synchronized (Printer1.class) {
                while (num <= 75) {
                    if (num / 5 % 3 == id) {
                        System.out.print("id" + id + ":");
                        for (int i = 0; i < 5; i++)
                            System.out.print(num++ + ",");
                        System.out.println();
                        Printer1.class.notifyAll();
                    } else {
                        try {
                            Printer1.class.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }

    public static void main(String[] args) {
        new Thread(new Printer1(0)).start();
        new Thread(new Printer1(1)).start();
        new Thread(new Printer1(2)).start();

    }
    }
