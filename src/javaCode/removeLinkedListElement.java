package javaCode;

import headers.ListNode;

public class removeLinkedListElement {

    public ListNode removeElements(ListNode head, int val) {

        ListNode actual = head;

        if (actual == null) {
            return null;
        }

        while (actual.next != null) {

            if (actual.next.val == val) {
                actual.next = actual.next.next;
            }
            else {
                actual = actual.next;
            }
        }
        if (head.val == val) {
            head = head.next;
        }

        return head;
    }
}
