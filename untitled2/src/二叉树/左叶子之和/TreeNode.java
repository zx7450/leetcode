package 二叉树.左叶子之和;

import java.util.Stack;

public class TreeNode {//Quiz404
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
//    public int sumOfLeftLeaves(TreeNode root) {//递归法
//        if (root==null) return 0;
//        int midval=0;
//        if (root.left!=null&&root.left.left==null&&root.left.right==null)
//            midval+=root.left.val;
//        return midval+sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right);
//    }
    public int sumOfLeftLeaves(TreeNode root) {//迭代法，前中后层序皆可
        Stack<TreeNode> stack=new Stack<TreeNode>();
        stack.push(root);
        int ans=0;
        while (!stack.isEmpty()){
            TreeNode node=stack.pop();
            if (node.left!=null&&node.left.left==null&&node.left.right==null)
                ans+=node.left.val;
            if (node.right!=null)
                stack.push(node.right);
            if (node.left!=null)
                stack.push(node.left);
        }
        return ans;
    }
}
