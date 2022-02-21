package 剑指offer第二版.对称的二叉树;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author zx
 * @date 2022/2/21 9:51
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Quiz28 {
//    public boolean isSymmetric(TreeNode root) {//递归法
//        if (root==null)
//            return true;
//        return Compare(root.left,root.right);
//    }
//
//    public boolean Compare(TreeNode lef,TreeNode righ) {
//        if (lef==null&&righ!=null) return false;
//        else if (lef!=null&&righ==null) return false;
//        else if (lef==null&&righ==null) return true;
//        else if (lef.val!= righ.val) return false;
//        else return Compare(lef.left,righ.right)&&Compare(lef.right,righ.left);
//    }

    public boolean isSymmetric(TreeNode root) {//层序遍历法
        if (root==null)
            return true;
        Queue<TreeNode> treeNodes=new LinkedList<>();
        treeNodes.add(root.left);
        treeNodes.add(root.right);
        while (!treeNodes.isEmpty()) {
            TreeNode lef=treeNodes.poll();
            TreeNode righ=treeNodes.poll();
            if (lef==null&&righ==null) continue;
            else if (lef==null||righ==null) return false;
            else if (lef.val!= righ.val) return false;
            treeNodes.add(lef.left);
            treeNodes.add(righ.right);
            treeNodes.add(lef.right);
            treeNodes.add(righ.left);
        }
        return true;
    }
}
