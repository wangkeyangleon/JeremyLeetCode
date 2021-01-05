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
}

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        return null;
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
