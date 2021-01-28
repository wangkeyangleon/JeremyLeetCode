package leetcode.dataStructure;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: LeetCode
 * @description: 104
 * A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: root = [3,9,20,null,null,15,7]
 * Output: 3
 * Example 2:
 * <p>
 * Input: root = [1,null,2]
 * Output: 2
 * Example 3:
 * <p>
 * Input: root = []
 * Output: 0
 * Example 4:
 * <p>
 * Input: root = [0]
 * Output: 1
 * @author: Keyang Wang
 * @create: 2021-01-28 19:54
 **/
public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }else
        {
            return (Math.max(maxDepth(root.left),maxDepth(root.right)))+1;
        }

    }

    public static void main(String[] args) {

        TreeNode left = new TreeNode(null);
        TreeNode right = new TreeNode(2);
        TreeNode root = new TreeNode(1,left,right);
        MaximumDepthOfBinaryTree maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();
        maximumDepthOfBinaryTree.maxDepth(root);


    }

}
