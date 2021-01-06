package test;

/**
 * @program: LeetCode
 * @description: rewrite linkedList
 * @author: Keyang Wang
 * @create: 2021-01-06 21:39
 **/
public class PracticeLinkedList {
    public static void main(String[] args) {
        Node2 node2 = new Node2(1);
        Node2 node3 = new Node2(2);
        Node2 node4 = new Node2(3);
        Node2 node5 = new Node2(4);
        SingeLinkedList2 singeLinkedList2 = new SingeLinkedList2();
        singeLinkedList2.addNode(node2);
        singeLinkedList2.addNode(node3);
        singeLinkedList2.addNode(node4);
        singeLinkedList2.addNode(node5);
        singeLinkedList2.displayNode();

    }
}

class Node2 {
    //the value of the node
    private Integer val;
    //point to the next node
    private Node2 next;

    public Node2(Integer val) {
        this.val = val;
    }

    public Integer getVal() {
        return val;
    }

    public void setVal(Integer val) {
        this.val = val;
    }

    public Node2 getNext() {
        return next;
    }

    public void setNext(Node2 next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node2{" +
                "val=" + val +

                '}';
    }
}

class SingeLinkedList2 {
    //initialise a linkedList as a pseudo-head
    Node2 head = new Node2(null);


    void addNode(Node2 node2) {
        //create a temporary node
        Node2 temp = head;
        //use while loop to find the end of the node
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(node2);
    }

    void displayNode() {
        //create a temporary node
        Node2 temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
            System.out.println(temp.toString());
        }
    }
}
