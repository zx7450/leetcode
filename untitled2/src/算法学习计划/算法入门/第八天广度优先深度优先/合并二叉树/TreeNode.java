package 算法学习计划.算法入门.第八天广度优先深度优先.合并二叉树;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author zx
 * @date 2021/12/21 9:18
 */
public class TreeNode {//Quiz617
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

//    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {//深度优先法
//        return merge(root1,root2);
//    }
//
//    public TreeNode merge(TreeNode root1, TreeNode root2) {
//        if (root1==null)
//            return root2;
//        if (root2==null)
//            return root1;
//        root1.val+= root2.val;
//        root1.left=merge(root1.left,root2.left);
//        root1.right=mergeTrees(root1.right,root2.right);
//        return root1;
//    }

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {//层序遍历法
        if (root1==null)
            return root2;
        if (root2==null)
            return root1;
        Queue<TreeNode> treeNodeQueue=new LinkedList<>();
        treeNodeQueue.add(root1);
        treeNodeQueue.add(root2);
        while (!treeNodeQueue.isEmpty()) {
            TreeNode node1=treeNodeQueue.poll();
            TreeNode node2=treeNodeQueue.poll();
            node1.val+= node2.val;
            if (node1.left!=null&&node2.left!=null) {
                treeNodeQueue.add(node1.left);
                treeNodeQueue.add(node2.left);
            }
            if (node1.left==null&&node2.left!=null) node1.left=node2.left;
            if (node1.right!=null&&node2.right!=null) {
                treeNodeQueue.add(node1.right);
                treeNodeQueue.add(node2.right);
            }
            if (node1.right==null&&node2.right!=null) node1.right=node2.right;
        }
        return root1;
    }
}
