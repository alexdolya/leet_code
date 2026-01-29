package ru.dolya.medium.problem11;

public class Solution {

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{8, 7, 2, 1}));
    }

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int result = 0;

        while (left < right) {
            int currentResult = (right - left) * Math.min(height[left], height[right]);
            result = Math.max(result, currentResult);
            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }

}
