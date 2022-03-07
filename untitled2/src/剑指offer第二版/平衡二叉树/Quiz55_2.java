package 剑指offer第二版.平衡二叉树;

/**
 * @author zx
 * @date 2022/3/7 8:59
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Quiz55_2 {
    public boolean isBalanced(TreeNode root) {
        return gethigh(root)!=-1;
    }

    public int gethigh(TreeNode treeNode) {
        if (treeNode==null) return 0;
        int lefthigh=gethigh(treeNode.left);
        if (lefthigh==-1)   return -1;//-1代表左子树不满足平衡二叉树性质
        int righthigh=gethigh(treeNode.right);
        if (righthigh==-1)  return -1;
        if (Math.abs(lefthigh-righthigh)>1) return -1;
        return lefthigh>righthigh?lefthigh+1:righthigh+1;
    }
}
