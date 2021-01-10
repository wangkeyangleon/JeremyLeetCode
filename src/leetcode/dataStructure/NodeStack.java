package leetcode.dataStructure;

import com.sun.org.apache.regexp.internal.RE;

import java.util.EmptyStackException;

/**
 * @program: LeetCode
 * @description: 155
 * <p>
 * design a stack use Linked List
 * @author: Keyang Wang
 * @create: 2021-01-10 22:39
 **/
public class NodeStack {
    //initialize a Node as a head
    Node1 head;

    public NodeStack() {
    }

    public void push(int x) {
        //first push the node
        if (head == null) {
            head = new Node1(x, x);
        } else {
            head = new Node1(x, Math.min(x, head.min), head);
        }
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.min;
    }
}

class Node1 {
    int val;
    int min;
    Node1 next;

    public Node1() {
    }

    public Node1(int val, int min) {
        this.val = val;
        this.min = min;
    }

    public Node1(int val, int min, Node1 next) {
        this.val = val;
        this.min = min;
        this.next = next;
    }
}
