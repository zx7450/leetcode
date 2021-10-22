package 二叉树.平衡二叉树;

import java.util.Map;

public class TreeNode {//Quiz110
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
    public boolean isBalanced(TreeNode root) {//递归法
        return gethigh(root)!=-1;
    }
    public int gethigh(TreeNode root){
        if (root==null) return 0;
        int lefthigh=gethigh(root.left);
        if (lefthigh==-1) return -1;
        int righthigh=gethigh(root.right);
        if (righthigh==-1) return -1;
        if (Math.abs(lefthigh-righthigh)>1)
            return -1;
        return (lefthigh>righthigh?lefthigh:righthigh)+1;
    }
}
