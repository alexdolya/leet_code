package ru.dolya.medium.problem328;

public class Solution {

    public static void main(String[] args) {
        ListNode first = new ListNode(1);
        first.next = new ListNode(2);
        first.next.next = new ListNode(3);
        first.next.next.next = new ListNode(4);
        first.next.next.next.next = new ListNode(5);

        ListNode listNode = oddEvenList(first);
        System.out.println();
    }

    public static ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode odd = head;
        if (head.next == null) {
            return odd;
        }
        ListNode even = head.next;
        ListNode firstEven = head.next;

        while (odd.next != null && even.next != null) {
            ListNode oddNext = odd.next.next;
            ListNode evenNext = even.next.next;
            odd.next = oddNext;
            odd = oddNext;
            even.next = evenNext;
            even = evenNext;
        }
        odd.next = firstEven;

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
