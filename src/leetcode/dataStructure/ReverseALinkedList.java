package leetcode.dataStructure;

import java.util.Stack;

/**
 * @program: LeetCode
 * @description: jianzhi offer 06
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 *
 * 示例 1：
 *
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 * @author: Keyang Wang
 * @create: 2021-07-31 12:17
 **/
public class ReverseALinkedList {
    class ListNode{
        int value;
        ListNode next;
        ListNode(int value){
            this.value = value;
        }

        public int[] reversePrint(ListNode head) {
            // get a temp node
            ListNode temp = head;
            Stack<Integer> stack = new Stack<>();
            while(temp!=null){
                stack.push(temp.value);
                temp =temp.next;
            }
            // declare a array to save the reverse list node
            int [] array = new int[stack.size()];
            for(int i=0;i<array.length;i++){
                array[i] = stack.pop();
            }
            return array;

        }

    }

}
