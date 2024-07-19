package org.example.easy;

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode preHead = new ListNode(-1);
        ListNode prev = preHead;

        while (list1 != null  && list2 != null){
            if (list1.val <= list2.val ) {
                prev.next = list1;
                list1 = list1.next;
            } else {
                prev.next = list2;
                list2 = list2.next;
            }
            prev = prev.next;
        }

        prev.next = (list1 == null) ? list2 : list1;

        return preHead.next;
    }

    public static void main(String[] args) {
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        ListNode list1 = mergeTwoSortedLists.new ListNode(1, mergeTwoSortedLists.new ListNode(2, mergeTwoSortedLists.new ListNode(4)));
        ListNode list2 = mergeTwoSortedLists.new ListNode(1, mergeTwoSortedLists.new ListNode(3, mergeTwoSortedLists.new ListNode(4)));
        ListNode result = mergeTwoSortedLists.mergeTwoLists(list1, list2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    /**
     * Definition for singly-linked list.
     */
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
