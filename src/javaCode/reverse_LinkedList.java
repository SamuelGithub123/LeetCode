package javaCode;

import headers.ListNode;

public class reverse_LinkedList {

    public ListNode reverseList(ListNode head) {

        if (head == null) {
            return null;
        }

        ListNode prev = null;

        ListNode next;

        ListNode current;

        current = head;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;


        return head;
    }
}
