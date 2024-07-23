package org.example.medium;

/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
public class AddTwoNumbers {

    public static void main(String[] args) {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode l1 = addTwoNumbers.new ListNode(2, addTwoNumbers.new ListNode(4, addTwoNumbers.new ListNode(3)));
        ListNode l2 = addTwoNumbers.new ListNode(5, addTwoNumbers.new ListNode(6, addTwoNumbers.new ListNode(4)));
        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode resultList = new ListNode(0);

        ListNode pointerL1 = l1;
        ListNode pointerL2 = l2;
        ListNode pointerResult = resultList;

        int carry = 0;

        while (pointerL1 != null || pointerL2 != null) {
            int x = (pointerL1 != null) ? pointerL1.val : 0;
            int y = (pointerL2 != null) ? pointerL2.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            pointerResult.next = new ListNode(sum % 10);
            pointerResult = pointerResult.next;
            if (pointerL1 != null) pointerL1 = pointerL1.next;
            if (pointerL2 != null) pointerL2 = pointerL2.next;
        }

        if (carry > 0) {
            pointerResult.next = new ListNode(carry);
        }

        return resultList.next;
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
