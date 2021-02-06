package leetcode.dataStructure;

import java.util.*;
import java.util.Queue;

/**
 * @program: LeetCode
 * @description: 107
 *
 * Given a binary tree, return the bottom-up level order traversal of its nodes’ values. (ie, from left to right, level by level from leaf to root).
 *
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its bottom-up level order traversal as:
 * [
 *   [15,7],
 *   [9,20],
 *   [3]
 * ]
 * @author: Keyang Wang
 * @create: 2021-02-02 20:56
 **/
public class BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> tree = new ArrayList<>();
        if (root==null){
            return tree;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            List<Integer> layers = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i <size ; i++) {
                TreeNode treeNode = queue.poll();
                layers.add(treeNode.val);
                if (treeNode.left!=null)
                    queue.add(treeNode.left);
                if (treeNode.right!=null)
                    queue.add(treeNode.right);
            }
            tree.add(layers);

        }
        Collections.reverse(tree);
        return tree;

    }
}
