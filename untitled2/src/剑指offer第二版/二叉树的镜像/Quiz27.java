package 剑指offer第二版.二叉树的镜像;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author zx
 * @date 2022/2/21 9:32
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Quiz27 {
//    public TreeNode mirrorTree(TreeNode root) {//递归法
//        if (root==null||(root.left==null&&root.right==null))
//            return root;
//        mirror(root);
//        return root;
//    }
//    public void mirror(TreeNode root) {
//        if (root==null)
//            return;
//        TreeNode temp=root.left;
//        root.left=root.right;
//        root.right=temp;
//        mirror(root.left);
//        mirror(root.right);
//    }

    public TreeNode mirrorTree(TreeNode root) {//层序遍历法
        if (root==null||(root.left==null&&root.right==null))
            return root;
        Queue<TreeNode> treeNodes=new LinkedList<>();
        treeNodes.add(root);
        while (!treeNodes.isEmpty()) {
            int size= treeNodes.size();
            for (int i = 0; i < size; i++) {
                TreeNode node=treeNodes.poll();
                swapnode(node);
                if (node.left!=null) treeNodes.add(node.left);
                if (node.right!=null) treeNodes.add(node.right);
            }
        }
        return root;
    }

    public void swapnode(TreeNode treeNode) {
        TreeNode temp=treeNode.left;
        treeNode.left=treeNode.right;
        treeNode.right=temp;
        return;
    }
}
