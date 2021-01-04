package test;

/**
 * @program: LeetCode
 * @description: linked list
 * @author: Keyang Wang
 * @create: 2021-01-04 21:11
 **/
public class LinkedListDemo {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addAtTail(node1);
        singleLinkedList.addAtTail(node2);
        singleLinkedList.addAtTail(node3);
        singleLinkedList.addAtTail(node4);
        singleLinkedList.showSingleList();
        System.out.println("+++++++++++++++++++++++");
        SingleLinkedList singleLinkedList1 = new SingleLinkedList();
        singleLinkedList1.showSingleList();

    }
}

class SingleLinkedList {
    //initialise a pseudo-node
    //this node just indicates that this is the beginning of linkedList and does not contain any value
    Node head = new Node(null);

    /**
     * add the node to the end of the single linkedList
     * method: find the end of the node and make the next point to the new node
     *
     * @param node
     */
    public void addAtTail(Node node) {
        //because the pseudo-node can not be moved so that it should have a temporary variable
        //set a temporary variable
        Node temp = head;

        //traverse the linkedList and find the end of the linkedList
        while (temp.next != null) {
            temp = temp.next;
        }
        //after the while loop the temp should be pointed to the end of the node in the linkedList
        temp.next = node;
        node.next = null;

    }

    /**
     * display the whole list
     */
    public void showSingleList() {
        //judge whether this list is null
        if (head.next == null)
        {
            System.out.println("sorry! this is a null list");
            return;
        }

        //set a temporary variable
        Node temp = head.next;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }
    }


}

//create a node
class Node {
    //every node has value
    public Integer val;
    //every node has point to the next node
    Node next;

    public Node(Integer val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + val +
                '}';
    }
}
