package 二叉树.找树左下角的值;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    int maxdeep=-1;
    int value=0;
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
//    public int findBottomLeftValue(TreeNode root) {//迭代法（层序遍历）
//        if (root.left==null&&root.right==null)
//            return root.val;
//        Queue<TreeNode> treeNodes=new LinkedList<TreeNode>();
//        treeNodes.add(root);
//        int left=0;
//        while (!treeNodes.isEmpty()) {
//            int size=treeNodes.size();
//            for (int i = 0; i < size; i++) {
//                TreeNode node=treeNodes.poll();
//                if (i==0)
//                    left=node.val;
//                if (node.left!=null) treeNodes.add(node.left);
//                if (node.right!=null) treeNodes.add(node.right);
//            }
//        }
//        return left;
//    }
    public int findBottomLeftValue(TreeNode root) {//递归法，需要声明一个全局变量
        value=root.val;
        findleft(root,0);
        return value;
    }
    public void findleft(TreeNode root,int deep){
        if (root==null) return;
        if (root.left==null&&root.right==null)
            if (deep>maxdeep){
                maxdeep=deep;
                value=root.val;
                return;
            }
        if (root.left!=null) findleft(root.left,deep+1);
        if (root.right!=null) findleft(root.right,deep+1);
    }
}
