package ru.dolya.medium.problem2130;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int pairSum(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        int left = 0;
        int right = list.size() - 1;

        int result = 0;
        while (left < right) {
            result = Math.max(result, list.get(left) + list.get(right));
            left++;
            right--;
        }

        return result;
    }

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
