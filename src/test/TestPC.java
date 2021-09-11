package test;


/**
 * @program: LeetCode
 * @description: test producer and consumer
 * @author: Keyang Wang
 * @create: 2021-09-11 15:23
 **/
public class TestPC {
    public static void main(String[] args) {
        PCBuffer pcBuffer = new PCBuffer();
        new Producer(pcBuffer).start();
        new Consumer(pcBuffer).start();



    }
}
//consumer class
class Consumer extends Thread{
    PCBuffer pcBuffer;
    Consumer(PCBuffer pcBuffer){
        this.pcBuffer = pcBuffer;
        
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("consumer consume " + pcBuffer.buyChicken().id + "chicken");

        }
    }
}

//producer class
class Producer extends Thread{
    PCBuffer pcBuffer;
    Producer(PCBuffer pcBuffer){
        this.pcBuffer = pcBuffer;
        
    }
    
    @Override
    public void run() {
       //produce chickens
        for (int i = 0; i < 100; i++) {

            Chicken chicken = new Chicken(i);
            pcBuffer.pushChicken(chicken);
            System.out.println("producer produce " + i + "chicken");
        }
    }
}

class Chicken{
    int id;

    public Chicken(int id) {
        this.id = id;
    }
}
//buffer class
class PCBuffer extends Thread{
    //buffer can contain 10 chickens
    Chicken[] chickens = new Chicken[10];
    int count = 0;

    //producer push chickens
    public synchronized void pushChicken(Chicken chicken){
        if (chickens.length == count){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        // push chicken
        chickens[count] = chicken;
        count++;
        this.notifyAll();


    }

    //consumer buy chicken
    public synchronized Chicken buyChicken(){
        if (count == 0){
            //wait
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count --;
        Chicken chicken = chickens[count];

        this.notifyAll();


        //inform producer produce chicken

        return  chicken;
    }


    @Override
    public void run() {
        super.run();
    }
}


