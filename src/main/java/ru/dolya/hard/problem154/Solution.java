package ru.dolya.hard.problem154;

public class Solution {


    public static void main(String[] args) {
        System.out.println(findMin(new int[]{3, 3, 1, 3}));
    }

    public static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int mid = (end - start) / 2;

        int result = nums[mid];
        while (start + 1 < end) {
            result = Math.min(result, nums[mid]);

            if (nums[mid] <= nums[end]) {
                end = mid;
            } else {
                start = mid;
            }
            mid = (end - start) / 2 + start;

        }
        result = Math.min(result, nums[start]);
        result = Math.min(result, nums[end]);

        return result;
    }
}
