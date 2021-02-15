package leetcode.dataStructure;

/**
 * @program: LeetCode
 * @description: 110
 *
 * Given a binary tree, determine if it is height-balanced.
 *
 * For this problem, a height-balanced binary tree is defined as:
 *
 * a binary tree in which the left and right subtrees of every node differ in height by no more than 1.
 *
 * Example 1:
 *
 *
 * Input: root = [3,9,20,null,null,15,7]
 * Output: true
 * Example 2:
 *
 *
 * Input: root = [1,2,2,3,3,null,null,4,4]
 * Output: false
 * Example 3:
 *
 * Input: root = []
 * Output: true
 * @author: Keyang Wang
 * @create: 2021-02-15 21:13
 **/
public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;
        else {
            return Math.abs(calculateDepth(root.left)-calculateDepth(root.right))<=1&&isBalanced(root.right)&&isBalanced(root.left);
        }

    }

    //calculate the depth of the tree
    public int calculateDepth(TreeNode root){
        if (root == null){
            return 0;
        }else {
            return Math.max(calculateDepth(root.left),calculateDepth(root.right))+1;
        }
    }
    public boolean isBalanced2(TreeNode root){

    }
}
