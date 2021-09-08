package leetcode.dataStructure;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: LeetCode
 * @description: 输入一个数，计算他的位数并逆序输出
 * @author: Keyang Wang
 * @create: 2021-09-06 17:32
 **/
public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("please input a number");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char [] array = input.toCharArray();
        System.out.println(Arrays.toString(array));
        System.out.println("Number length: "+array.length);
        int length = array.length-1;
        int result = 0;
        for (int i = length;i>=0 ; i--) {
            int a = Integer.parseInt(String.valueOf(array[i]));
            result = (int) (result+a*Math.pow(10,i));


        }
       System.out.println(result);
    }
}
