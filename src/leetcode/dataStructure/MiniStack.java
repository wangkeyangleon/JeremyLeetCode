package leetcode.dataStructure;

import java.util.Deque;

/**
 * @program: LeetCode
 * @description: 155
 * <p>
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * <p>
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 * <p>
 * Example 1:
 * <p>
 * Input
 * ["MinStack","push","push","push","getMin","pop","top","getMin"]
 * [[],[-2],[0],[-3],[],[],[],[]]
 * <p>
 * Output
 * [null,null,null,null,-3,null,0,-2]
 * <p>
 * Explanation
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin(); // return -3
 * minStack.pop();
 * minStack.top();    // return 0
 * minStack.getMin(); // return -2
 * @author: Keyang Wang
 * @create: 2021-01-07 21:58
 **/
public class MiniStack {
    private int maxsize = 100;
    private int[] element;
    private int size;
    private int min;

    /**
     * initialize your data structure here.
     */
    public MiniStack() {
        element = new int[maxsize];
        min = Integer.MAX_VALUE;
        size = 0;
    }

    public void push(int x) {
        if (size >= maxsize) {
            return;
        } else {
            size++;
            element[size-1] = x;
        }
        if (x <= min)
            min = x;
    }

    public void pop() {
        if (min==element[size-1]){
            min = Integer.MAX_VALUE;
            for (int i = 0; i < size-1; i++) {
                if (min>= element[i])
                    min = element[i];
            }
            element[size-1]=0;
            size--;
        }else
        {
            element[size-1] = 0;
            size --;
        }

    }

    public int top() {
        if (size == 0) {
            System.out.println("the stack is empty");
            return 0;
        } else {
            return element[size-1];
        }

    }

    public int getMin() {
        return min;
    }

    public static void main(String[] args) {
       int a = -2;
       int b = -3;
       MiniStack miniStack = new MiniStack();
       miniStack.push(a);
       miniStack.push(b);
        System.out.println(miniStack.getMin());
        System.out.println("top"+miniStack.top());
        System.out.println("+++++++++++++++++++");
        miniStack.pop();
        System.out.println("top"+miniStack.top());
        System.out.println("min"+miniStack.getMin());
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

