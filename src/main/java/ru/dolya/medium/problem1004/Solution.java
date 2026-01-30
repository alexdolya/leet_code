package ru.dolya.medium.problem1004;

public class Solution {

    public static void main(String[] args) {
        System.out.println(longestOnes(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2));
    }

    public static int longestOnes(int[] nums, int k) {
        int left = 0;
        int right = left;
        int unusedFlips = k;
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
        return result;
    }
}
