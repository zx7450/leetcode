package 二叉树.另一颗树的字树;

public class TreeNode {
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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return dfs(root,subRoot);
    }
    public boolean dfs(TreeNode root, TreeNode subRoot) {
        if (root==null)
            return false;
        return Compare(root,subRoot)||dfs(root.left,subRoot)||dfs(root.right,subRoot);
    }
    public boolean Compare(TreeNode root, TreeNode subRoot) {
        if (root==null&&subRoot==null) return true;
        else if (root!=null&&subRoot==null) return false;
        else if (root==null&&subRoot!=null) return false;
        else if (root.val!=subRoot.val)
            return false;
        return Compare(root.left,subRoot.left)&&Compare(root.right,subRoot.right);
    }
}
