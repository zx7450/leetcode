package 程序员面试金典.特定深度节点链表;

import java.util.*;

/**
 * @author zx
 * @date 2022/4/16 10:14
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Quiz04_03 {
    public ListNode[] listOfDepth(TreeNode tree) {
        if (tree==null)
            return new ListNode[0];
        List<ListNode> listNodes=new ArrayList<>();
        Queue<TreeNode> treeNodeQueue=new LinkedList<>();
        treeNodeQueue.add(tree);
        while (!treeNodeQueue.isEmpty()) {
            int size=treeNodeQueue.size();
            ListNode head=new ListNode(0);
            ListNode curr=head;
            for (int i = 0; i < size; i++) {
                TreeNode treeNode=treeNodeQueue.poll();
                if (treeNode.left!=null)
                    treeNodeQueue.add(treeNode.left);
                if (treeNode.right!=null)
                    treeNodeQueue.add(treeNode.right);
                curr.next=new ListNode(treeNode.val);
                curr=curr.next;
            }
            listNodes.add(head.next);
        }
        return listNodes.toArray(new ListNode[listNodes.size()]);
    }
}
