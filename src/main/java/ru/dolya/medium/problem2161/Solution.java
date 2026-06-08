package ru.dolya.medium.problem2161;

public class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] result = new int[nums.length];
        int pivotCounter = 0;
        int i = 0;
        for (int num : nums) {
            if (num < pivot) {
                result[i] = num;
                i++;
            }
            if (num == pivot) {
                pivotCounter++;
            }
        }

        while (pivotCounter > 0) {
            result[i] = pivot;
            pivotCounter--;
            i++;
        }

        for (int num : nums) {
            if (num > pivot) {
                result[i] = num;
                i++;
            }
        }
        return result;
    }
}
