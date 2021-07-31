package leetcode.dataStructure;

/**
 * @program: LeetCode
 * @description: 707
 * Design your implementation of the linked list. You can choose to use a singly or doubly linked list.
 * A node in a singly linked list should have two attributes: val and next.
 * val is the value of the current node, and next is a pointer/reference to the next node.
 * If you want to use the doubly linked list, you will need one more attribute prev to indicate the previous node in the linked list.
 * Assume all nodes in the linked list are 0-indexed.
 * <p>
 * Implement the MyLinkedList class:
 * <p>
 * MyLinkedList() Initializes the MyLinkedList object.
 * int get(int index) Get the value of the indexth node in the linked list. If the index is invalid, return -1.
 * *************************************************
 * method
 * <p>
 * void addAtHead(int val) Add a node of value val before the first element of the linked list.
 * After the insertion, the new node will be the first node of the linked list.
 * <p>
 * void addAtTail(int val) Append a node of value val as the last element of the linked list.
 * <p>
 * void addAtIndex(int index, int val) Add a node of value val before the indexth node in the linked list.
 * If index equals the length of the linked list, the node will be appended to the end of the linked list.
 * If index is greater than the length, the node will not be inserted.
 * <p>
 * void deleteAtIndex(int index) Delete the indexth node in the linked list, if the index is valid.
 * <p>
 * ******************************************************
 * Example 1:
 * <p>
 * Input
 * ["MyLinkedList", "addAtHead", "addAtTail", "addAtIndex", "get", "deleteAtIndex", "get"]
 * [[], [1], [3], [1, 2], [1], [1], [1]]
 * Output
 * [null, null, null, null, 2, null, 3]
 * <p>
 * Explanation
 * MyLinkedList myLinkedList = new MyLinkedList();
 * myLinkedList.addAtHead(1);
 * myLinkedList.addAtTail(3);
 * myLinkedList.addAtIndex(1, 2);    // linked list becomes 1->2->3
 * myLinkedList.get(1);              // return 2
 * myLinkedList.deleteAtIndex(1);    // now the linked list is 1->3
 * myLinkedList.get(1);              // return 3
 * @author: Keyang Wang
 * @create: 2021-01-04 21:47
 **/
public class LinkedListDemo {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addAtHead(0);
        singleLinkedList.addAtTail(1);
        singleLinkedList.addAtTail(2);
        singleLinkedList.addAtTail(3);
        singleLinkedList.addAtTail(4);
        System.out.println("size: "+singleLinkedList.size);
        System.out.println(singleLinkedList.get(2));
        singleLinkedList.showLinkedList();
        System.out.println("+++++++++++++++++++++++++");
        singleLinkedList.deleteAtIndex(2);
        System.out.println("size: "+singleLinkedList.size);
        singleLinkedList.showLinkedList();



    }
}

/**
 * this is a singleLinkedList
 * * Your MyLinkedList object will be instantiated and called as such:
 * * MyLinkedList obj = new MyLinkedList();
 * * int param_1 = obj.get(index);
 * * obj.addAtHead(val);
 * * obj.addAtTail(val);
 * * obj.addAtIndex(index,val);
 * * obj.deleteAtIndex(index);
 */
class SingleLinkedList {
    //set a pseudo-head without value
    Node head;
    int size;


    /**
     * Initialize your data structure here.
     */
    public SingleLinkedList() {
        head = new Node(null);
        size = 0;
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        //if the index is invalid return -1
        if (index<0 || index>= size)
            return -1;
        //set a temporary variable as the head
        Node temp = head;
        //get the value of the index
        for (int i = 0; i <index+1; i++) temp = temp.next;
        return temp.val;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        //add the pseudo-node
        addAtIndex(0,val);

    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        addAtIndex(size,val);
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list,
     * the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        //if the index greater than the length,the node will not be inserted
        if(index>size)
            return;
        //if the index is a negative just add at the head
        if (index<0)
            index = 0;

        //set a temporary variable
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        //add node
        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
        size+=1;


    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        if (index<0 || index>=size)
            return;
        Node temp = head;
        for (int i = 0; i <index ; i++) {
            temp = temp.next;

        }
        size-=1;
        temp.next = temp.next.next;

    }

    public void showLinkedList(){
        Node temp = head;
        for (int i = 0; i <size ; i++) {
            System.out.println(temp.next);
            temp = temp.next;
        }
    }
}

/**
 * this is a node in the linkedList
 * it has value(val) and next(point to the next node)
 */
class Node {
    //the value of the node
    public Integer val;
    //point to the next node
    public Node next;

    public Node(Integer val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                '}';
    }
}
