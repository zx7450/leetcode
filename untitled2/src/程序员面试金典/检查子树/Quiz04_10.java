package 程序员面试金典.检查子树;

/**
 * @author zx
 * @date 2022/4/19 9:23
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Quiz04_10 {
    public boolean checkSubTree(TreeNode t1, TreeNode t2) {
        return dfs(t1, t2);
    }

    public boolean dfs(TreeNode t1, TreeNode t2) {
        if (t1 == null)
            return false;
        return checkNode(t1, t2) || dfs(t1.left, t2) || dfs(t1.right, t2);
    }

    public boolean checkNode(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null)
            return true;
        else if (t1 == null || t2 == null)
            return false;
        else if (t1.val != t2.val)
            return false;
        return checkNode(t1.left, t2.left) && checkNode(t1.right, t2.right);

    }
}
