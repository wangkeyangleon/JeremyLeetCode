package leetcode.dataStructure;

import com.sun.codemodel.internal.JWhileLoop;

import java.util.ArrayDeque;
import java.util.LinkedList;

/**
 * @program: LeetCode
 * @description: 225
 * <p>
 * Implement a last in first out (LIFO) stack using only two queues.
 * The implemented stack should support all the functions of a normal queue (push, top, pop, and empty).
 * <p>
 * Implement the MyStack class:
 * <p>
 * void push(int x) Pushes element x to the top of the stack.
 * int pop() Removes the element on the top of the stack and returns it.
 * int top() Returns the element on the top of the stack.
 * boolean empty() Returns true if the stack is empty, false otherwise.
 * Notes:
 * <p>
 * You must use only standard operations of a queue, which means only push to back, peek/pop from front, size,
 * and is empty operations are valid.
 * Depending on your language, the queue may not be supported natively.
 * You may simulate a queue using a list or deque (double-ended queue), as long as you use only a queue's standard operations.
 * <p>
 * Example 1:
 * <p>
 * Input
 * ["MyStack", "push", "push", "top", "pop", "empty"]
 * [[], [1], [2], [], [], []]
 * Output
 * [null, null, null, 2, 2, false]
 * <p>
 * Explanation
 * MyStack myStack = new MyStack();
 * myStack.push(1);
 * myStack.push(2);
 * myStack.top(); // return 2
 * myStack.pop(); // return 2
 * myStack.empty(); // return False
 * @author: Keyang Wang
 * @create: 2021-01-14 20:12
 **/
public class QueueToStack {
    Queue stack = new Queue();
    Queue backStack = new Queue();


    /**
     * Initialize your data structure here.
     */
    public QueueToStack() {


    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        stack.push(x);

    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        int size = 0;
        while (!stack.empty()){
            backStack.push(stack.pop());
            size++;
        }
        while (size>1){
            stack.push(backStack.pop());
            size--;
        }
        return backStack.pop();

    }

    /**Queue stack = new Queue();
     Queue backStack = new Queue();
     * Get the top element.
     */
    public int top() {
        int size = 0;
        while (!stack.empty()){
            backStack.push(stack.pop());
            size++;
        }
        while (size>1){
            stack.push(backStack.pop());
            size--;
        }
        int top = backStack.peek();
        stack.push(backStack.pop());
        return top;
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return stack.empty();
    }


    public static void main(String[] args) {
        QueueToStack queueToStack = new QueueToStack();
        queueToStack.push(1);
        queueToStack.push(2);
        System.out.println(queueToStack.pop());
        System.out.println(queueToStack.top());

    }
    
}

