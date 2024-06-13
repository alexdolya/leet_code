package ru.dolya.medium.problem2;

import ru.dolya.utility.ListNode;
import ru.dolya.utility.ListNodeUtils;

public class Solution {

    public static void main(String[] args) {
        int[] l11 = {2, 4, 3};
        int[] l12 = {5, 6, 4};
        int[] l21 = {0};
        int[] l22 = {0};
        int[] l31 = {9, 9, 9, 9, 9, 9, 9};
        int[] l32 = {9, 9, 9, 9};

        ListNode list1 = ListNodeUtils.createLinkedList(l11);
        ListNode list2 = ListNodeUtils.createLinkedList(l12);
        ListNode list3 = ListNodeUtils.createLinkedList(l21);
        ListNode list4 = ListNodeUtils.createLinkedList(l22);
        ListNode list5 = ListNodeUtils.createLinkedList(l31);
        ListNode list6 = ListNodeUtils.createLinkedList(l32);

        ListNode node = addTwoNumbers(list1, list2);
        ListNode node1 = addTwoNumbers(list3, list4);
        ListNode node2 = addTwoNumbers(list5, list6);

        System.out.println();
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = new ListNode();
        node.val = (l1.val + l2.val) % 10;
        if ((l1.val + l2.val) / 10 > 0) {
            node.next = getNode(l1.next, l2.next, true);
        } else {
            node.next = getNode(l1.next, l2.next, false);
        }
        return node;
    }

    private static ListNode getNode(ListNode first, ListNode second, boolean isNeedPlusOne) {
        if (first == null && second == null && isNeedPlusOne) {
            return new ListNode(1, null);
        }
        if (first == null && second == null) {
            return null;
        }
        ListNode node = new ListNode();
        int firstVal = 0;
        int secondVal = 0;
        ListNode firstNext = null;
        ListNode secondNext = null;
        if (first != null) {
            firstNext = first.next;
            firstVal = first.val;
        }
        if (second != null) {
            secondNext = second.next;
            secondVal = second.val;
        }
        node.val = (firstVal + secondVal + (isNeedPlusOne ? 1 : 0)) % 10;
        if ((firstVal + secondVal + (isNeedPlusOne ? 1 : 0)) / 10 > 0) {
            node.next = getNode(firstNext, secondNext, true);
        } else {
            node.next = getNode(firstNext, secondNext, false);
        }

        return node;
    }


}

