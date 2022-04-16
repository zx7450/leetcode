package 程序员面试金典.合法二叉搜索树;

import java.util.Stack;

/**
 * @author zx
 * @date 2022/4/16 10:50
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Quiz04_05 {
    //    public boolean isValidBST(TreeNode root) {//中序遍历法
//        if (root==null||(root.left==null&&root.right==null))
//            return true;
//        Stack<TreeNode> treeNodeStack=new Stack<>();
//        TreeNode curr=root;
//        double pre=-Double.MAX_VALUE;
//        while (!treeNodeStack.isEmpty()||curr!=null) {
//            if (curr!=null) {
//                treeNodeStack.push(curr);
//                curr = curr.left;
//            } else {
//                curr=treeNodeStack.pop();
//                if (pre>=curr.val)
//                    return false;
//                pre=curr.val;
//                curr=curr.right;
//            }
//        }
//        return true;
//    }
    public boolean isValidBST(TreeNode root) {
        if (root==null)
            return true;
        else if (root.val<root.left.val)
    }

    public boolean judgeBST(TreeNode root,int low,int high) {
        if (root==null)
            return true;
        if (root.left!=null)
    }
}
