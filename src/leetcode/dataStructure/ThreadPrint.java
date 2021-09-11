package leetcode.dataStructure;

import java.io.PrintWriter;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: LeetCode
 * @description: 要求创建三个线程，输出1-75，
 * * 最开始第一个线程输出1-3，第二个输出4-6，第三个输出7-9
 * * 接着再第一个线程输出10-12...就这样循环下去，直到打印出75个数
 * @author: Keyang Wang
 * @create: 2021-09-11 16:45
 **/
public class ThreadPrint {

    public static void main(String[] args) {

        new Thread(new Printer(0)).start();
        new Thread(new Printer(1)).start();
        new Thread(new Printer(2)).start();



    }
}
class Printer implements Runnable{
    int id;
    static int number = 1;

    Printer(int id){
        this.id = id;
    }


    @Override
    public void run() {
        while (number <= 75){
            synchronized (Printer.class){
                if(number/5%3 == id){
                    System.out.print("id "+ id +": ");
                    for (int i = 0; i < 5; i++) {
                        System.out.print(number++ + ",");

                    }
                    System.out.println();
                    Printer.class.notifyAll();
                }else {
                    try {
                        Printer.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }
    }
}


