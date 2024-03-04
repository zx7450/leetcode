package 二叉树.前序遍历;

import 二叉树类.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author zx
 * @date 2024/3/4 17:47
 */
public class Quiz144 {
    //递归法
//    List<Integer> ans;
//
//    public List<Integer> preorderTraversal(TreeNode root) {
//        ans = new ArrayList<>();
//        preorder(root);
//        return ans;
//    }
//
//    private void preorder(TreeNode node) {
//        if (node == null)
//            return;
//        ans.add(node.val);
//        preorder(node.left);
//        preorder(node.right);
//    }

    //迭代法
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null)
            return ans;
        Deque<TreeNode> nodeDeque = new ArrayDeque<>();
        nodeDeque.add(root);
        while (!nodeDeque.isEmpty()) {
            TreeNode node = nodeDeque.pollLast();
            ans.add(node.val);
            if (node.right != null) nodeDeque.addLast(node.right);
            if (node.left != null) nodeDeque.addLast(node.left);
        }
        return ans;
    }
}
