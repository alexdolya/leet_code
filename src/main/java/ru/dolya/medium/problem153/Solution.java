package ru.dolya.medium.problem153;

public class Solution {

    public static void main(String[] args) {
        System.out.println(findMin(new int[]{3, 4, 5, 1, 2}));
        System.out.println(findMin(new int[]{4, 5, 6, 7, 0, 1, 2}));
        System.out.println(findMin(new int[]{11, 13, 15, 17}));
        System.out.println(findMin(new int[]{2, 1}));
    }

    public static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int mid = (end - start) / 2;

        int result = nums[mid];
        while (start + 1 < end) {
            result = Math.min(result, nums[mid]);

            if (nums[mid] < nums[end]) {
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
