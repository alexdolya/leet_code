package ru.dolya.utility;

public class ListNodeUtils {

    public static ListNode createLinkedList(int[] values) {
        ListNode head = new ListNode(values[0]);
        ListNode current = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }

        return head;
    }

}
