package ru.dolya.easy.problem3349;

import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(hasIncreasingSubarrays(List.of(2, 5, 7, 8, 9, 2, 3, 4, 3, 1), 3));

        System.out.println(hasIncreasingSubarrays(List.of(1, 2, 3, 4, 4, 4, 4, 5, 6, 7), 5));

        System.out.println(hasIncreasingSubarrays(List.of(-15, 9), 1));

    }

    public static boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        if (nums.size() < k * 2) {
            return false;
        }

        int prevLeft = nums.getFirst();
        int prevRight = nums.get(k);

        int counter = 1;
        for (int i = 0; i + k < nums.size(); i++) {
            Integer currentLeft = nums.get(i);
            Integer currentRight = nums.get(i + k);
            if (currentLeft > prevLeft && currentRight > prevRight) {
                counter++;
            } else {
                counter = 1;
            }
            if (counter == k) {
                return true;
            }
            prevLeft = currentLeft;
            prevRight = currentRight;
        }
        return false;
    }
}
