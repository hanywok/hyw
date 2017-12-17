package com.vince.interview.linkedlist;

/**
 * Created by Vincent Han
 * on Date: 2017/12/10
 * on Time: 18:38
 **/
public class PrintCommon {
    public void printCommonPart(Node head1, Node head2) {
        while (head1 != null && head2 != null) {
            if (head1.value > head2.value) {
                head2 = head2.next;
            } else if (head1.value < head2.value) {
                head1 = head1.next;
            } else {
                System.out.println(head1.value);
            }

        }
    }

    class Node {
        public int value;
        public Node next;

        public Node(int val) {
            value = val;
        }
    }
}
