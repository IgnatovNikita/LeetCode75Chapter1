package com.company;

import java.util.Collections;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head != null) {
            ListNode res = null;
            while (head != null) {
                if (res == null){
                    res = new ListNode(head.val);
                }else {
                    res = new ListNode(head.val, res);
                }
                head = head.next;
            }
            return res;
        }
        return null;
    }
}
