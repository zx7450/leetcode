package 剑指offer第二版.二叉树的深度;

/**
 * @author zx
 * @date 2022/3/7 8:52
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Quiz55_1 {

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        return getdepth(root, 0);
    }

    public int getdepth(TreeNode treeNode, int depth) {
        if (treeNode == null)
            return 0;
        return Math.max(getdepth(treeNode.left, depth), getdepth(treeNode.right, depth)) + 1;
    }
}
