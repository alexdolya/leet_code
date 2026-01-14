package ru.dolya.medium.problem3350;

import java.util.List;

public class Solution {

    public static void main(String[] args) {
        System.out.println(maxIncreasingSubarrays(List.of(2, 5, 7, 8, 9, 2, 3, 4, 3, 1)));

        System.out.println(maxIncreasingSubarrays(List.of(1, 2, 3, 4, 4, 4, 4, 5, 6, 7)));

        System.out.println(maxIncreasingSubarrays(List.of(5, 8, -2, -1)));
    }

    public static int maxIncreasingSubarrays(List<Integer> nums) {
        int[] db = new int[nums.size() - 1];
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > nums.get(i - 1)) {
                db[i - 1] = 1;
            } else {
                db[i - 1] = 0;
            }
        }
        return processResult(db);
    }

    public static int processResult(int[] result) {
        if (result.length == 1) {
            return 1;
        }
        int trueCounter = 0;
        int maxTrueCounter = 0;
        int secondCounter = 0;
        for (int i : result) {
            if (i == 1) {
                trueCounter++;
            } else {
                secondCounter++;
                if (secondCounter > 1) {
                    maxTrueCounter = Math.max(maxTrueCounter, trueCounter);
                    trueCounter = 0;
                    secondCounter = 0;
                }
            }
        }
        maxTrueCounter = Math.max(maxTrueCounter, trueCounter);

        int res = (maxTrueCounter) / 2;
        return res == 0 ? 1 : res;
    }
}
