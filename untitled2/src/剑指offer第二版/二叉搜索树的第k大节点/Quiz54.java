package 剑指offer第二版.二叉搜索树的第k大节点;

/**
 * @author zx
 * @date 2022/3/4 15:59
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Quiz54 {
    int ans, k;

    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        revermidtravel(root);
        return ans;
    }

    public void revermidtravel(TreeNode treeNode) {
        if (treeNode == null) return;
        revermidtravel(treeNode.right);
        if (k == 0) return;
        if (--k == 0) ans = treeNode.val;
        revermidtravel(treeNode.left);
    }
}
