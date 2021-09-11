package test;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: LeetCode
 * @description: prove that arraylist is not thread safe
 * @author: Keyang Wang
 * @create: 2021-09-11 13:49
 **/
public class TestList{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                list.add(Thread.currentThread().getName());
            }).start();
        }
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println(list.size());
    }


}
