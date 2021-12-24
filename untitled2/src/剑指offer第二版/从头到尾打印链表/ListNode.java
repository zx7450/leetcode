package 剑指offer第二版.从头到尾打印链表;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author zx
 * @date 2021/12/24 10:34
 */
public class ListNode {//Quiz06
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

//    public int[] reversePrint(ListNode head) {
//        if (head==null)
//            return new int[0];
//        else if (head.next==null)
//            return new int[]{head.val};
//        List<Integer> nodeval=new ArrayList<>();
//        while (head!=null){
//            nodeval.add(head.val);
//            head=head.next;
//        }
//        int size= nodeval.size();
//        int[] ans=new int[size];
//        for (int i=size-1;i>=0;i--) {
//            ans[size-1-i]=nodeval.get(i);
//        }
//        return ans;
//    }

    public int[] reversePrint(ListNode head) {
        if (head==null)
            return new int[0];
        else if (head.next==null)
            return new int[]{head.val};
        Stack<Integer> nodestack=new Stack<>();
        while (head!=null) {
            nodestack.push(head.val);
            head=head.next;
        }
        int size= nodestack.size();
        int[] ans=new int[size];
        for (int i = 0; i < size; i++) {
            ans[i]=nodestack.pop();
        }
        return ans;
    }
}
