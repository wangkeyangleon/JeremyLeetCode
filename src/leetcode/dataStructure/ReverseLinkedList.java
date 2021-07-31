package leetcode.dataStructure;

/**
 * @program: LeetCode
 * @description: 206
 *
 * Reverse a singly linked list.
 *
 * Example:
 *
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 *
 * @author: Keyang Wang
 * @create: 2021-01-10 21:25
 **/
public class ReverseLinkedList {
    public ListNode1 reverseList(ListNode1 head) {
        ListNode1 result = null;
        ListNode1 temp = head;
        while (temp!=null){
            //assign a temporary variable
            ListNode1 nextTemp = temp.getNext();
            temp.setNext(result);
            result = temp;
            temp = nextTemp;
        }

        return result;
    }
}

class ListNode1 {
    int val;
    private ListNode1 next;

    public ListNode1() {
    }

    public ListNode1(int val) {
        this.val = val;
    }

    public ListNode1(int val, ListNode1 next) {
        this.val = val;
        this.setNext(next);
    }

    public ListNode1 getNext() {
        return next;
    }

    public void setNext(ListNode1 next) {
        this.next = next;
    }
}
