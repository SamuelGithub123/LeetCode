package javaCode;

import headers.ListNode;

public class removeDuplicatesList {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode actual = head;
        if (actual == null) {
            return null;
        }

        if (actual.next == null) {
            return actual;
        }

        while (actual.next != null) {
            if (actual.val == actual.next.val) {
                actual.next = actual.next.next;
            }
            else {
                actual = actual.next;
            }
        }

        return head;
    }
}
