package leetcode.dataStructure;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: LeetCode
 * @description: 101
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 * <p>
 * For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
 * 1
 * / \
 * 2   2
 * / \ / \
 * 3  4 4  3
 * <p>
 * <p>
 * But the following [1,2,2,null,3,null,3] is not:
 * <p>
 * 1
 * / \
 * 2   2
 * \   \
 * 3    3
 * @author: Keyang Wang
 * @create: 2021-01-27 20:50
 **/
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }

    public boolean isMirror(TreeNode t1, TreeNode t2) {
        if (t1==null&&t2==null){
            return true;
        }else if (t1==null ||t2 ==null){
            return false;
        }else {
            return (t1.val == t2.val)&&(isMirror(t1.left,t2.right))&&(isMirror(t1.right,t2.left));
        }
    }

    public boolean isSymmetric2(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(root);
        while (!queue.isEmpty()){
            //poll like remove, but when use poll if the element is null it will return false rather than error
            TreeNode treeNode = queue.poll();
            TreeNode treeNode1 = queue.poll();
            if (treeNode==null&&treeNode1==null)
                continue;
            if (treeNode==null||treeNode1==null)
                return false;
            if (treeNode.val!=treeNode1.val)
                return false;
            queue.add(treeNode.left);
            queue.add(treeNode1.right);
            queue.add(treeNode.right);
            queue.add(treeNode1.left);

        }
        return true;
    }


}

