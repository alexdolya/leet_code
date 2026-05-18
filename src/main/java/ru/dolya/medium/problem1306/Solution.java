package ru.dolya.medium.problem1306;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        System.out.println(canReach(new int[]{3, 0, 2, 1, 2}, 2));
    }

    private static final Set<Integer> visitedPosition = new HashSet();

    public static boolean canReach(int[] arr, int start) {
        if (visitedPosition.contains(start)) {
            return false;
        }
        int val = arr[start];
        if (val == 0) {
            return true;
        }
        visitedPosition.add(start);
        boolean right = false;
        if (start + val < arr.length) {
            right = canReach(arr, start + val);
        }
        boolean left = false;
        if (start - val >= 0) {
            left = canReach(arr, start - val);
        }
        return right || left;
    }
}
