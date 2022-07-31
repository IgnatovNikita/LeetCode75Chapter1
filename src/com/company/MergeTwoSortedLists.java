package com.company;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode res = new ListNode();
    ListNode head = res;
    while (list1 != null || list2 != null) {
        if (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                res.next = new ListNode(list1.val);
                list1 = list1.next;
            } else{
                res.next = new ListNode(list2.val);
                list2 = list2.next;
            }
        }else if (list1 != null){
            res.next = new ListNode(list1.val);
            list1 = list1.next;
        }else {
            res.next = new ListNode(list2.val);
            list2 = list2.next;
        }
        res = res.next;
    }
       // System.out.println(head.next.val);
    return head.next;
    }
}
