package 算法学习计划.算法基础.第七天深度优先广度优先.另一棵树的子树;

/**
 * @author zx
 * @date 2022/1/5 10:51
 */


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Quiz572 {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return dfs(root,subRoot);
    }

    public boolean dfs(TreeNode root, TreeNode subRoot) {
        if (root==null)
            return false;
        return Compareval(root,subRoot)||dfs(root.left,subRoot)||dfs(root.right,subRoot);
    }

    public boolean Compareval(TreeNode root, TreeNode subRoot) {
        if (root==null&&subRoot==null) return true;
        else if (root!=null&&subRoot==null) return false;
        else if (root==null&&subRoot!=null) return false;
        else if (root.val!=subRoot.val) return false;
        return Compareval(root.left,subRoot.left)&&Compareval(root.right,subRoot.right);
    }
}
