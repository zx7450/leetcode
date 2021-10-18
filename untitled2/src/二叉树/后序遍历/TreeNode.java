package 二叉树.后序遍历;

import java.util.*;

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
//    public List<Integer> postorderTraversal(TreeNode root) {//递归法
//        List<Integer> ans=new ArrayList<Integer>();
//        if (root!=null)
//            postorder(root,ans);
//        return ans;
//    }
//    public void postorder(TreeNode node,List<Integer> ans){
//        if (node.left!=null) postorder(node.left,ans);
//        if (node.right!=null) postorder(node.right,ans);
//        ans.add(node.val);
//    }
//    public List<Integer> postorderTraversal(TreeNode root) {//非递归法
//        List<Integer> ans=new ArrayList<Integer>();
//        if (root==null)
//            return ans;
//        Stack<TreeNode> nodes=new Stack<TreeNode>();
//        nodes.push(root);
//        while (!nodes.isEmpty()){//先得到中右左的序列，再进行反转即为后序遍历序列
//            TreeNode node=nodes.pop();
//            ans.add(node.val);
//            if (node.left!=null) nodes.push(node.left);
//            if (node.right!=null) nodes.push(node.right);
//        }
//        Collections.reverse(ans);
//        return ans;
//    }
//    public List<Integer> postorderTraversal(TreeNode root) {//官方非递归
//        List<Integer> res = new ArrayList<Integer>();
//        if (root == null) {
//            return res;
//        }
//
//        Deque<TreeNode> stack = new LinkedList<TreeNode>();
//        TreeNode prev = null;
//        while (root != null || !stack.isEmpty()) {
//            while (root != null) {
//                stack.push(root);
//                root = root.left;
//            }
//            root = stack.pop();
//            if (root.right == null || root.right == prev) {
//                res.add(root.val);
//                prev = root;
//                root = null;
//            } else {
//                stack.push(root);
//                root = root.right;
//            }
//        }
//        return res;
//    }
    public List<Integer> postorderTraversal(TreeNode root) {//代码随想录的统一迭代法，方便记和理解
        List<Integer> result = new LinkedList<>();
        Stack<TreeNode> st = new Stack<>();
        if (root != null) st.push(root);
        while (!st.empty()) {
            TreeNode node = st.peek();
            if (node != null) {
                st.pop(); // 将该节点弹出，避免重复操作，下面再将右中左节点添加到栈中
                st.push(node);                          // 添加中节点
                st.push(null); // 中节点访问过，但是还没有处理，加入空节点做为标记。
                if (node.right!=null) st.push(node.right);  // 添加右节点（空节点不入栈）
                if (node.left!=null) st.push(node.left);    // 添加左节点（空节点不入栈）

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
