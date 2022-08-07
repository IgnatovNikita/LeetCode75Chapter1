package com.company;
//Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.
//
//There is a cycle in a linked list if there is some node in the list that can be reached again by continuously
// following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer
// is connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.
//
//Do not modify the linked list.
public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        if (head == null) return null;
        if (head.next == null || head.next.next == null) return null;
        ListNode slow = head.next;
        ListNode fast = head.next.next;

        while (slow != fast){
            if (slow.next == null || fast.next == null || fast.next.next == null) return null;

            slow = slow.next;
            fast = fast.next.next;
        }

        slow = head;
        while (true){
            if (slow == fast) return slow;
            slow = slow.next;
            fast = fast.next;
        }
    }

}
