package 二叉树.合并二叉树;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author zx
 * @date 2021/10/24 23:17
 */
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
//    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {//递归法
//        if (root1==null) return root2;
//        if (root2==null) return root1;
//        root1.val+=root2.val;
//        root1.left=mergeTrees(root1.left,root2.left);
//        root1.right=mergeTrees(root1.right,root2.right);
//        return root1;
//    }
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {//迭代（层序遍历）法
        if (root1==null) return root2;
        else if (root2==null) return root1;
        Queue<TreeNode> treeNodeQueue=new LinkedList<TreeNode>();
        treeNodeQueue.add(root1);
        treeNodeQueue.add(root2);
        while (!treeNodeQueue.isEmpty()) {
            TreeNode node1=treeNodeQueue.poll();
            TreeNode node2=treeNodeQueue.poll();
            node1.val+= node2.val;
            if (node1.left!=null&&node2.left!=null){
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
