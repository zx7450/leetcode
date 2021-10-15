package 链表.设计链表;


public class ListNode {//Quiz707
    int val;
    ListNode next;
    ListNode pre;
    ListNode(int x){
        val=x;
    }
}
class MyLinkedList {
    int size;
    ListNode head;
    ListNode tail;


    public MyLinkedList() {
        size=0;
        head=new ListNode(0);
        tail=new ListNode(0);
        head.next=tail;
        tail.pre=head;
    }

    public int get(int index) {
        if (index<0||index>=size)
            return -1;
        int ans;
        // 通过判断 index < size - index 来决定是从头结点还是尾节点遍历，提高效率
        if (index +1< size - index){
            ListNode now=head.next;
            for (int i = 0; i < index; i++) {
                now = now.next;
            }
            ans=now.val;
        } else {
            ListNode now=tail.pre;
            for (int i = this.size-1; i > index; i--) {
                now=now.pre;
            }
            ans=now.val;
        }
        return ans;
    }

    public void addAtHead(int val) {
        ListNode node=new ListNode(val);
        ListNode pr=head;
        ListNode nex=head.next;
        node.pre=pr;
        node.next=nex;
        pr.next=node;
        nex.pre=node;
        size++;
    }

    public void addAtTail(int val) {
        ListNode node=new ListNode(val);
        ListNode pr=tail.pre;
        ListNode nex=tail;
        node.pre=pr;
        node.next=nex;
        pr.next=node;
        nex.pre=node;
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index>this.size)
            return;
        else if (index<=0){
            this.addAtHead(val);
            return;
        }
        ListNode pr,nex;//pr为插入结点的前一结点，nex为插入结点的后一结点（即原索引为index的结点）
        if (index<size-index){
            pr=head;
            for (int i = 0; i < index; i++) {
                pr=pr.next;
            }
            nex=pr.next;
        } else {
            nex=tail;
            for (int i = 0; i < size - index; ++i) {
                nex=nex.pre;
            }
            pr=nex.pre;
        }
        ListNode node=new ListNode(val);
        node.pre=pr;
        node.next=nex;
        pr.next=node;
        nex.pre=node;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index<0||index>=this.size)
            return;
        ListNode now;//需要删除的结点
        ListNode nex;
        if (index+1<size-index){
            now=head.next;
            for (int i = 0; i < index; i++) {
                now=now.next;
            }
        } else {
            now=tail.pre;
            for (int i=this.size-1;i>index;i--){
                now=now.pre;
            }
        }
        nex=now.next;
        nex.pre=now.pre;
        now.pre.next=nex;
        size--;
    }
}