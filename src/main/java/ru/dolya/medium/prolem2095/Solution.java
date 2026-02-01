package ru.dolya.medium.prolem2095;

public class Solution {

    public static void main(String[] args) {
        ListNode first = new ListNode(1);
        first.next = new ListNode(3);
        first.next.next = new ListNode(4);
        first.next.next.next = new ListNode(7);
        first.next.next.next.next = new ListNode(1);
        first.next.next.next.next.next = new ListNode(2);
        first.next.next.next.next.next.next = new ListNode(6);

        ListNode listNode = deleteMiddle(first);
        System.out.println();
    }

    public static ListNode deleteMiddle(ListNode head) {
        if (head.next == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode preMiddle = null;
        while (fast != null && fast.next != null) {
            preMiddle = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        preMiddle.next = slow.next;

        return head;
    }

    public static class ListNode {
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
