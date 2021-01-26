package leetcode.dataStructure;

import java.util.ArrayList;

/**
 * @program: LeetCode
 * @description: 100
 * Given the roots of two binary trees p and q, write a function to check if they are the same or not.
 * <p>
 * Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: p = [1,2,3], q = [1,2,3]
 * Output: true
 * Example 2:
 * <p>
 * <p>
 * Input: p = [1,2], q = [1,null,2]
 * Output: false
 * Example 3:
 * <p>
 * <p>
 * Input: p = [1,2,1], q = [1,1,2]
 * Output: false
 * @author: Keyang Wang
 * @create: 2021-01-26 19:48
 **/
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
//        TreeNode tempP = p;
////        TreeNode tempQ = q;
////        //traverse left subtree
////        while (tempP != null && tempQ != null) {
////            if (tempP.val != tempQ.val) {
////                return false;
////            }
////            tempP = tempP.left;
////            tempQ = tempQ.left;
////        }
////        if (tempP!=null || tempQ!=null){
////            return  false;
////        }
////
////        //traverse right subtree
////        while (p != null && q != null) {
////            if (p.val != q.val) {
////                return false;
////            }
////            p = p.right;
////            q = q.right;
////        }
////        return q == null && p == null;
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        } else if (p.val != q.val) {
            return false;
        } else {
            return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
        }
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
