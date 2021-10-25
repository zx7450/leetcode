package 二叉树.二叉搜索树的最小绝对差;

import java.util.Stack;

public class TreeNode {//Quiz530
    int val;
    TreeNode left;
    TreeNode right;
    int minDifference=Integer.MAX_VALUE;
    TreeNode pre=null;

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

//    public int getMinimumDifference(TreeNode root) {//迭代法(中序遍历)
//        TreeNode now=root;
//        Stack<TreeNode> treeNodeStack=new Stack<TreeNode>();
//        while (!treeNodeStack.isEmpty()||now!=null) {
//            if (now!=null) {
//                treeNodeStack.push(now);
//                now=now.left;
//            } else {
//                now=treeNodeStack.pop();
//                if (pre!=null) {
//                    int difference = now.val - pre.val;
//                    if (minDifference == 0)
//                        minDifference = difference;
//                    else
//                        minDifference = minDifference < difference ? minDifference : difference;
//                }
//                pre=now;
//                now=now.right;
//            }
//        }
//        return minDifference;
//    }
    public int getMinimumDifference(TreeNode root) {//递归法
        traversal(root);
        return minDifference;
    }
    public void traversal(TreeNode root) {
        if (root==null) return;
        traversal(root.left);
        if (pre!=null)
            minDifference=Math.min(minDifference,root.val- pre.val);
        pre=root;
        traversal(root.right);
    }
}
