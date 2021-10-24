package 二叉树.路径总和;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author zx
 * @date 2021/10/24 12:00
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
//    public boolean hasPathSum(TreeNode root, int targetSum) {//这里用累加也可，但代码比较麻烦，且要多写一个下面的函数
//        if (root==null) return false;
//        targetSum-=root.val;
//        if (root.left==null&&root.right==null)//左右孩子均为空，则为叶子结点
//            if (targetSum==0)
//                return true;
//            else
//                return false;
//        boolean leftjudge=false;
//        boolean rightjudge=false;
//        if (root.left!=null) leftjudge=hasPathSum(root.left,targetSum);
//        if (root.right!=null) rightjudge=hasPathSum(root.right,targetSum);
//        return leftjudge||rightjudge;
//    }
//    public boolean judge(TreeNode root, int targetSum,int routesum){
//        if (root.left==null&&root.right==null)//左右孩子均为空，则为叶子结点
//            if (routesum==targetSum)
//                return true;
//            else
//                return false;
//        boolean leftjudge=false;
//        boolean rightjudge=false;
//        if (root.left!=null) leftjudge=judge(root.left,targetSum,routesum+root.left.val);
//        if (root.right!=null) rightjudge=judge(root.right,targetSum,routesum+root.right.val);
//        return leftjudge||rightjudge;
//    }
    public boolean hasPathSum(TreeNode root, int targetSum) {//迭代法（层次遍历）
        if (root==null) return false;
        Queue<TreeNode> treeNodeQueue=new LinkedList<TreeNode>();
        Queue<Integer> traceSum=new LinkedList<Integer>();
        treeNodeQueue.add(root);
        traceSum.add(root.val);
        while (!treeNodeQueue.isEmpty()){
            TreeNode node=treeNodeQueue.poll();
            int sum=traceSum.poll();
            if (node.left==null&&node.right==null&&targetSum==sum)
                return true;
            if (node.left!=null) {
                treeNodeQueue.add(node.left);
                traceSum.add(sum + node.left.val);
            }
            if (node.right!=null) {
                treeNodeQueue.add(node.right);
                traceSum.add(sum+node.right.val);
            }
        }
        return false;
    }
}
