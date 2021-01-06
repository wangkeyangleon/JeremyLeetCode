package leetcode.dataStructure;

/**
 * @program: LeetCode
 * @description: 21
 * Merge two sorted linked lists and return it as a sorted list.
 * The list should be made by splicing together the nodes of the first two lists.
 * <p>
 * Input: l1 = [1,2,4], l2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 * Example 2:
 * <p>
 * Input: l1 = [], l2 = []
 * Output: []
 * Example 3:
 * <p>
 * Input: l1 = [], l2 = [0]
 * Output: [0]
 * @author: Keyang Wang
 * @create: 2021-01-05 19:12
 **/
public class MergeTwoSortedLists {


    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);


    }
}


class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode();
        ListNode pre = listNode;
        while (l1!=null && l2!=null){
            if (l1.val<= l2.val){
                pre.next = l1;
                l1 = l1.next;
            }else {
                pre.next = l2;
                l2 = l2.next;
            }
            pre = pre.next;
        }
        if (l1!= null){
            pre.next = l1;
        }else if (l2!=null){
            pre.next = l2;
        }
//        pre.next = l1 == null ? l2 : l1;

        return listNode.next;
//        if (l1 == null){
//            return l2;
//        }else if (l2 == null){
//            return l1;
//        }else if (l1.val<l2.val){
//            l1.next = mergeTwoLists(l1.next,l2);
//            return l1;
//
//        }else {
//            l2.next = mergeTwoLists(l2.next,l1);
//            return l2;
//        }
//        ListNode pre = new ListNode();
//        //create a temporary variable
//        ListNode listNode = pre;
//        while (l1.next != null && l2.next != null) {
//            if (l1.val <= l2.val) {
//                listNode.next = l1;
//                l1 = l1.next;
//            } else {
//                listNode.next = l2;
//                l2 = l2.next;
//            }
//        }
//        listNode.next = l1;
//
//
//        return pre.next;
//        ListNode prehead = new ListNode(-1);
//
//        ListNode prev = prehead;
//        while (l1 != null && l2 != null) {
//            if (l1.val <= l2.val) {
//                prev.next = l1;
//                l1 = l1.next;
//            } else {
//                prev.next = l2;
//                l2 = l2.next;
//            }
//            prev = prev.next;
//        }
//
//        // 合并后 l1 和 l2 最多只有一个还未被合并完，我们直接将链表末尾指向未合并完的链表即可
//        prev.next = l1 == null ? l2 : l1;
//
//        return prehead.next;
    }
}


/**
 * define a Linked List
 */
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
