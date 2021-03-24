package leetcode.algorithm;

/**
 * @program: LeetCode
 * @description:
 * @author: Keyang Wang
 * @create: 2021-03-22 21:07
 **/
public class FibonacciArray {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);

    }

    /**
     * create a memory to remember the previous result to reduce the cycle
     * from the top to bottom
     */

    public int fibonacci2(int n) {
        if (n == 0) {
            return n;
        }
        int[] memory = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            memory[i] = -1;
        }
        return fib2(n,memory);

    }

    public int fib2(int n,int[] memory){
        if (memory[n]!=-1){
            return memory[n];
        }
        if (n<=2){
            return memory[n]=1;
        }else {
            memory[n] = fib2(n-1,memory)+fib2(n-2,memory);
        }
        return memory[n];
    }

    /**
     * use memory from the bottom to the top to calculate the result
     * @param n
     * @return
     */
    public int fib3(int n){
        if (n==0)
            return n;
        int[] memory = new int[n+1];
        memory[0] = 0;
        memory[1] = 1;
        for (int i = 2; i <=n ; i++) {
            memory[i] = memory[i-1]+memory[i-2];
        }
        return memory[n];
    }



    public static void main(String[] args) {
        FibonacciArray fibonacciArray = new FibonacciArray();
        System.out.println(fibonacciArray.fib(6));
        System.out.println(fibonacciArray.fibonacci2(6));
        System.out.println(fibonacciArray.fib3(6));
    }
}
