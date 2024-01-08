package 二叉树.求根节点到叶节点数字之和;

import 二叉树类.TreeNode;

/**
 * @author zx
 * @date 2024/1/3 11:05
 */
public class Quiz129 {
    int ans;

    public int sumNumbers(TreeNode root) {
        ans = 0;
        traverse(root, 0);
        return ans;
    }

    public void traverse(TreeNode node, int val) {
        val = val * 10 + node.val;
        if (node.left == null && node.right == null) {
            ans += val;
            return;
        } else {
            if (node.left != null) traverse(node.left, val);
            if (node.right != null) traverse(node.right, val);
        }
    }
}
