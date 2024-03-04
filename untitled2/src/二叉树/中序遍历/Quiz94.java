package 二叉树.中序遍历;

import 二叉树类.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author zx
 * @date 2024/3/4 17:55
 */
public class Quiz94 {
    //递归法
//    List<Integer> ans;
//
//    public List<Integer> inorderTraversal(TreeNode root) {
//        ans = new ArrayList<>();
//        inorder(root);
//        return ans;
//    }
//
//    private void inorder(TreeNode node) {
//        if (node == null)
//            return;
//        inorder(node.left);
//        ans.add(node.val);
//        inorder(node.right);
//    }
    //迭代法
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Deque<TreeNode> nodeDeque = new ArrayDeque<>();
        TreeNode node = root;
        while (node != null || !nodeDeque.isEmpty()) {
            if (node != null) {
                nodeDeque.addLast(node);
                node = node.left;
            } else {
                node = nodeDeque.pollLast();
                ans.add(node.val);
                node = node.right;
            }
        }
        return ans;
    }
}
