package test;


/**
 * @program: LeetCode
 * @description: test signal
 * @author: Keyang Wang
 * @create: 2021-09-11 15:45
 **/
public class TestPC2 {
    public static void main(String[] args) {
        Tv tv = new Tv();
        new Player(tv).start();
        new Visitor(tv).start();
    }
}

class Player extends Thread{
    Tv tv;
    Player (Tv tv){
        this.tv = tv;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if (i%2 == 0){
                this.tv.play("voice of china");
            }else {
                this.tv.play("NBA");
            }
        }
    }
}

class Visitor extends Thread{
    Tv tv;
    Visitor(Tv tv){
        this.tv = tv;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            tv.watch();
        }
    }
}

class Tv {
    String voice;
    boolean flag = true;
    // T player play
    //F visitor watches
    public synchronized void play(String voice){
        if (!flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("Player play " + voice);
        this.notifyAll();
        this.voice = voice;
        this.flag = !this.flag;

    }

    public synchronized void watch(){
        if (flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println(" watch "+ voice);
        this.notifyAll();
        this.flag = !this.flag;

    }
}

