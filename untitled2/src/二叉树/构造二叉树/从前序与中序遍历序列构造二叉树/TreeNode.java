package 二叉树.构造二叉树.从前序与中序遍历序列构造二叉树;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zx
 * @date 2021/10/24 22:38
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    int[] inorder;
    int[] preorder;
    int preindex;
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.inorder=inorder;
        this.preorder=preorder;
        preindex=0;
        for (int i = 0; i < inorder.length; i++) {
            position.put(inorder[i],i);
        }
        return Create(0,inorder.length-1);
    }
    public TreeNode Create(int left,int right){
        if (left>right) return null;
        int root_val=preorder[preindex++];
        int index=position.get(root_val);
        TreeNode root=new TreeNode(root_val);
        root.left=Create(left,index-1);
        root.right=Create(index+1,right);
        return root;
    }
}
