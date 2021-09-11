package test;

/**
 * @program: LeetCode
 * @description: test dead lock
 * @author: Keyang Wang
 * @create: 2021-09-11 14:25
 **/
public class TestDeadLock {
    public static void main(String[] args) {
        MakeUp makeUp = new MakeUp(0,"a");
        MakeUp makeUp1 = new MakeUp(1,"b");
        makeUp.start();
        makeUp1.start();
    }
}

class LipStick{

}
class Mirror{

}
class MakeUp extends  Thread{
    //get the only one resource
    static LipStick lipStick = new LipStick();
    static Mirror mirror = new Mirror();
    int choice;
    String name;

    MakeUp (int choice, String name){
        this.choice = choice;
        this.name = name;

    }

    private void makeUp(){
        if (choice ==0){
            synchronized (lipStick){
                System.out.println(this.name + "got lipstick");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            synchronized (mirror){
                System.out.println(this.name + "got mirror");
            }
        }else {
            synchronized (mirror){
                System.out.println(this.name + "got mirror");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            synchronized (lipStick){
                System.out.println(this.name + "got mirror");
            }
        }
    }


    @Override
    public void run() {
        makeUp();

    }



}


