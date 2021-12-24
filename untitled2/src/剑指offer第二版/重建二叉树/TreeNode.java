package 剑指offer第二版.重建二叉树;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zx
 * @date 2021/12/24 15:29
 */
public class TreeNode {//Quiz07
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    int[] preord;
    int[] inord;
    int preindex;
    Map<Integer,Integer> position=new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int nodenum=preorder.length;
        if (nodenum==0)
            return null;
        else if (nodenum==1)
            return new TreeNode(preorder[0]);
        this.preord=preorder;
        this.inord=inorder;
        preindex=0;
        for (int i = 0; i < nodenum; i++) {
            position.put(inorder[i],i);
        }
        return createTree(0,nodenum-1);
    }

    public TreeNode createTree(int left,int right) {
        if (left>right)
            return null;
        int rootval=preord[preindex++];
        int posit=position.get(rootval);
        TreeNode newnode=new TreeNode(rootval);
        newnode.left=createTree(left,posit-1);
        newnode.right=createTree(posit+1,right);
        return newnode;
    }
}
