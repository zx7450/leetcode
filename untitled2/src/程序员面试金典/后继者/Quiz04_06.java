package 程序员面试金典.后继者;

import java.util.Stack;

/**
 * @author zx
 * @date 2022/4/18 9:08
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Quiz04_06 {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if (root==null||(root.left==null&&root.right==null))
            return null;
        Stack<TreeNode> treeNodeStack=new Stack<>();
        TreeNode curr=root,pre=null;
        while (!treeNodeStack.isEmpty()||curr!=null) {
            if (curr!=null) {
                treeNodeStack.push(curr);
                curr=curr.left;
            } else {
                curr=treeNodeStack.pop();
                if (pre==p)
                    return curr;
                pre=curr;
                curr=curr.right;
            }
        }
        return null;
    }
}
