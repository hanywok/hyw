package com.vince.interview.linkedlist;

/**
 * Created by Vincent Han
 * on Date: 2017/12/10
 * on Time: 19:02
 **/
public class DeleteLastKNodeForDoubleLink {

    public DoubleNode removeLastKth(DoubleNode head, int lastKth){
        if(head==null||lastKth<1){
            return head;
        }
        DoubleNode cur=head;
        while(cur.next!=null){
            cur=cur.next;
            lastKth--;
        }
        if(lastKth==0){
             head=head.next;
             head.last=null;
        }
        if(lastKth<0){
            cur=head;
            while ((++lastKth!=0)){
                cur=cur.next;
            }
            DoubleNode newNext=cur.next.next;
            cur.next=newNext;
            if(newNext!=null){
                newNext.last=cur;
            }
        }
        return head;
    }




    public class DoubleNode{
        public int value;
        public DoubleNode last;
        public DoubleNode next;

        public DoubleNode(int val) {
            value=val;
        }
    }
}
