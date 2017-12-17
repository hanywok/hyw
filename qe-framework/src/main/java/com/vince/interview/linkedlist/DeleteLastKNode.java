package com.vince.interview.linkedlist;

/**
 * Created by Vincent Han
 * on Date: 2017/12/10
 * on Time: 18:51
 **/
public class DeleteLastKNode {

    public Node removeLastKNode(Node head, int lastKth){
        if(head==null||lastKth<1)
            return head;
        Node cur=head;
        while(cur!=null){
            lastKth--;
            cur=cur.next;
        }
        if(lastKth==0){
             head=head.next;
        }
        if(lastKth<0){
            cur=head;
            while (++lastKth!=0){
                cur=cur.next;
            }
            cur.next=cur.next.next;
        }
        return head;

    }


    public class Node{
        public int value;
        public Node next;
        public Node(int val){
            value=val;
        }
    }

}
