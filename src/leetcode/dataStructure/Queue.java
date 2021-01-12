package leetcode.dataStructure;

import java.util.Stack;

/**
 * @program: LeetCode
 * @description: 232
 * <p>
 * Implement a first in first out (FIFO) queue using only two stacks.
 * The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).
 * <p>
 * Implement the MyQueue class:
 * <p>
 * void push(int x) Pushes element x to the back of the queue.
 * int pop() Removes the element from the front of the queue and returns it.
 * int peek() Returns the element at the front of the queue.
 * boolean empty() Returns true if the queue is empty, false otherwise.
 * Notes:
 * <p>
 * You must use only standard operations of a stack, which means only push to top,
 * peek/pop from top, size, and is empty operations are valid.
 * Depending on your language, the stack may not be supported natively.
 * You may simulate a stack using a list or deque (double-ended queue) as long as you use only a stack's standard operations.
 * Follow-up: Can you implement the queue such that each operation is amortized O(1) time complexity? In other words,
 * performing n operations will take overall O(n) time even if one of those operations may take longer.
 * <p>
 * Example 1:
 * <p>
 * Input
 * ["MyQueue", "push", "push", "peek", "pop", "empty"]
 * [[], [1], [2], [], [], []]
 * Output
 * [null, null, null, 1, 1, false]
 * <p>
 * Explanation
 * MyQueue myQueue = new MyQueue();
 * myQueue.push(1); // queue is: [1]
 * myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
 * myQueue.peek(); // return 1
 * myQueue.pop(); // return 1, queue is [2]
 * myQueue.empty(); // return false
 * @author: Keyang Wang
 * @create: 2021-01-11 12:31
 **/
public class Queue {
    Stack<Integer> queue;
    Stack<Integer> backQueue;


    public Queue() {
        queue = new Stack<>();
        backQueue = new Stack<>();

    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        queue.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        while (!queue.isEmpty()) {
            backQueue.push(queue.pop());
        }
        int result = backQueue.pop();

        while (!backQueue.isEmpty()) {
            queue.push(backQueue.pop());
        }

        return result;
    }

    /**
     * Get the front element.
     */
    public int peek() {
        if (queue.isEmpty()) {
            System.out.println("this is a empty queue");
            return 0;
        }

        while (!empty()) {
            backQueue.push(queue.pop());
        }
        int result = backQueue.peek();
        while (!backQueue.isEmpty()){
            queue.push(backQueue.pop());
        }
        return result;

    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.push(1);
//        System.out.println(queue.pop());
        System.out.println(queue.peek());
        System.out.println(queue.empty());

    }
}
