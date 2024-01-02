package 二叉树.验证二叉搜索树;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeNode {//Quiz98
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

//    public boolean isValidBST(TreeNode root) {//迭代法，通过中序遍历序列判断，二叉搜索树的中序遍历序列应该是一个递增序列
//        if (root.left == null && root.right == null) return true;
//        Stack<TreeNode> treeNodeStack = new Stack<TreeNode>();
//        TreeNode pre=null;
//        TreeNode node = root;
//        while (!treeNodeStack.isEmpty() || node != null) {
//            if (node != null) {
//                treeNodeStack.push(node);
//                node = node.left;
//            } else {
//                node = treeNodeStack.pop();
//                if (pre!=null&&pre.val>= node.val)
//                    return false;
//                pre=node;
//                node = node.right;
//            }
//        }
//        return true;
//    }
    public boolean isValidBST(TreeNode root) {//递归法
        return testBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean testBST(TreeNode root,long lower,long upper) {//注意，不能仅判断左右结点，必须判断左右子树的所有结点
        if (root==null) return true;
        if (root.val<=lower||root.val>=upper) return false;
        return testBST(root.left,lower,root.val)&&testBST(root.right,root.val,upper);
    }
}
