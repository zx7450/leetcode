package 二叉树.把二叉搜索树转换为累加树;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeNode {//Quiz538
    int val;
    TreeNode left;
    TreeNode right;
    int pre=0;
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

//    public TreeNode convertBST(TreeNode root) {//法1：两次中序遍历，一次获得递增序列一次修改节点值，比较麻烦
//        if (root==null) return root;
//        List<Integer> nodesval=new ArrayList<Integer>();
//        TreeNode curr=root;
//        Stack<TreeNode> treeNodeStack=new Stack<TreeNode>();
//        while (!treeNodeStack.isEmpty()||curr!=null) {
//            if (curr!=null) {
//                treeNodeStack.push(curr);
//                curr=curr.left;
//            } else {
//                curr=treeNodeStack.pop();
//                nodesval.add(curr.val);
//                curr=curr.right;
//            }
//        }
//        treeNodeStack.clear();
//        curr=root;
//        int pre=-1;
//        int sumofval=0;
//        for (int i = 0; i < nodesval.size(); i++) {
//            sumofval+=nodesval.get(i);
//        }
//        while (!treeNodeStack.isEmpty()||curr!=null) {
//            if (curr!=null) {
//                treeNodeStack.push(curr);
//                curr=curr.left;
//            } else {
//                curr=treeNodeStack.pop();
//                if (pre>=0){
//                    sumofval-=nodesval.get(pre);
//                }
//                curr.val=sumofval;
//                pre++;
//                curr=curr.right;
//            }
//        }
//        return root;
//    }
//    public TreeNode convertBST(TreeNode root) {//法2：反中序遍历(从右到左修改)，递归法,需要一个pre存储上一个节点的值
//        reverseinorder(root);
//        return root;
//    }
//
//    public void reverseinorder(TreeNode root) {
//        if (root==null) return;
//        reverseinorder(root.right);
//        root.val+=pre;
//        pre=root.val;
//        reverseinorder(root.left);
//    }

    public TreeNode convertBST(TreeNode root) {//法2：反中序遍历(从右到左修改)，迭代法,需要一个pre存储上一个节点的值
        if (root==null) return root;
        Stack<TreeNode> treeNodeStack=new Stack<TreeNode>();
        TreeNode curr=root;
        while (!treeNodeStack.isEmpty()||curr!=null) {
            if (curr!=null) {
                treeNodeStack.push(curr);
                curr=curr.right;
            } else {
                curr=treeNodeStack.pop();
                curr.val+=pre;
                pre=curr.val;
                curr=curr.left;
            }
        }
        return root;
    }
}
