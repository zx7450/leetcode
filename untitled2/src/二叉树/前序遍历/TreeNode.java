package 二叉树.前序遍历;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

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

//    public List<Integer> preorderTraversal(TreeNode root) {//递归法
//        List<Integer> ans=new ArrayList<Integer>();
//        if (root!=null)
//            preorder(root,ans);
//        return ans;
//    }
//    public void preorder(TreeNode node,List<Integer> ans){
//        ans.add(node.val);
//        if (node.left!=null) preorder(node.left,ans);
//        if (node.right!=null) preorder(node.right,ans);
//    }
//    public List<Integer> preorderTraversal(TreeNode root) {
//        List<Integer> ans=new ArrayList<>();
//        if (root==null)
//            return ans;
//        Stack<TreeNode> nodes=new Stack<TreeNode>();
//        nodes.push(root);
//        while (!nodes.isEmpty()){
//            TreeNode node=nodes.pop();
//            ans.add(node.val);
//            if (node.right!=null)
//                nodes.push(node.right);
//            if (node.left!=null)
//                nodes.push(node.left);
//        }
//        return ans;
//    }
    public List<Integer> preorderTraversal(TreeNode root) {//代码随想录的统一迭代法，方便记和理解
        List<Integer> result = new LinkedList<>();
        Stack<TreeNode> st = new Stack<>();
        if (root != null) st.push(root);
        while (!st.empty()) {
            TreeNode node = st.peek();
            if (node != null) {
                st.pop(); // 将该节点弹出，避免重复操作，下面再将右中左节点添加到栈中
                if (node.right!=null) st.push(node.right);  // 添加右节点（空节点不入栈）
                if (node.left!=null) st.push(node.left);    // 添加左节点（空节点不入栈）
                st.push(node);                          // 添加中节点
                st.push(null); // 中节点访问过，但是还没有处理，加入空节点做为标记。

            } else { // 只有遇到空节点的时候，才将下一个节点放进结果集
                st.pop();           // 将空节点弹出
                node = st.peek();    // 重新取出栈中元素
                st.pop();
                result.add(node.val); // 加入到结果集
            }
        }
        return result;
    }
}
