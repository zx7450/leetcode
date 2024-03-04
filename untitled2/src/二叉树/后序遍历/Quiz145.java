package 二叉树.后序遍历;

import 二叉树类.TreeNode;

import java.util.*;

/**
 * @author zx
 * @date 2024/3/4 18:05
 */
public class Quiz145 {
    //递归法
//    List<Integer> ans;
//
//    public List<Integer> postorderTraversal(TreeNode root) {
//        ans = new ArrayList<>();
//        postorder(root);
//        return ans;
//    }
//
//    private void postorder(TreeNode node) {
//        if (node == null)
//            return;
//        postorder(node.left);
//        postorder(node.right);
//        ans.add(node.val);
//    }
    //迭代法
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null)
            return ans;
        Deque<TreeNode> nodeDeque = new ArrayDeque<>();
        nodeDeque.addLast(root);
        while (!nodeDeque.isEmpty()) {
            TreeNode node = nodeDeque.pollLast();
            ans.add(node.val);
            if (node.left != null) nodeDeque.addLast(node.left);
            if (node.right != null) nodeDeque.addLast(node.right);
        }
        Collections.reverse(ans);
        return ans;
    }
}
