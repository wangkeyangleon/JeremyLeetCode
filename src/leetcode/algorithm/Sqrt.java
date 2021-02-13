package leetcode.algorithm;

/**
 * @program: LeetCode
 * @description: 69
 *
 * Given a non-negative integer x, compute and return the square root of x.
 *
 * Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.
 *
 * Example 1:
 *
 * Input: x = 4
 * Output: 2
 * Example 2:
 *
 * Input: x = 8
 * Output: 2
 * Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.
 * @author: Keyang Wang
 * @create: 2021-02-13 21:03
 **/
public class Sqrt {
    public int mySqrt(int x) {
        if (x==0)
            return 0;
        int answer = (int) Math.exp(0.5*Math.log(x));
        if (((answer+1)*(answer+1))<=x){
            return answer+1;
        }else {
            return answer;
        }
    }

    public static void main(String[] args) {
        Sqrt sqrt = new Sqrt();
        int x = 2147483647;
        System.out.println(sqrt.mySqrt(x));
    }
}
