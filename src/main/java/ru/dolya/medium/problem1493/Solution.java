package ru.dolya.medium.problem1493;

public class Solution {

    public static void main(String[] args) {

    }

    public static int longestSubarray(int[] nums) {
        int left = 0;
        int right = left;
        int unusedFlips = 1;
        int result = 0;
        int currentResult = 0;
        while (right < nums.length) {
            if (nums[right] == 1) {
                currentResult++;
                right++;
            } else {
                if (unusedFlips != 0) {
                    unusedFlips--;
                    currentResult++;
                    right++;
                } else {
                    while (unusedFlips == 0 && left < nums.length) {
                        if (nums[left] == 0) {
                            unusedFlips++;
                        }
                        currentResult--;
                        left++;
                    }

                }
            }
            result = Math.max(result, currentResult);
        }
        return result - 1;
    }
}
