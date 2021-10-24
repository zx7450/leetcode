package 二叉树.构造二叉树.从中序与后序遍历序列构造二叉树;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zx
 * @date 2021/10/24 19:43
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    int[] inorder;
    int[] postorder;
    int postindex;
    Map<Integer,Integer> position=new HashMap<Integer, Integer>();
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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.inorder=inorder;
        this.postorder=postorder;
        for (int i = 0; i < inorder.length; i++) {
            position.put(inorder[i],i);
        }
        postindex=postorder.length-1;
        return Create(0,inorder.length-1);
    }
    public TreeNode Create(int left,int right){
        if (left>right)// 如果这里没有节点构造二叉树了，就结束
            return null;
        int root_val=postorder[postindex];// 选择 postindex 位置的元素作为当前子树根节点
        TreeNode root=new TreeNode(root_val);
        int index=position.get(root_val);// 根据 root 所在位置分成左右两棵子树
        postindex--;
        root.right=Create(index+1,right);
        root.left=Create(left,index-1);
        return root;
    }
}
