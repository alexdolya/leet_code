package ru.dolya.easy.problem27;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] testArray = new int[]{3, 2, 2, 3};
        int[] testArray2 = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(removeElement(testArray2, 2));
        System.out.println(Arrays.toString(testArray2));
    }


    public static int removeElement(int[] nums, int val) {
        int result = 0;
        int[] temp = new int[nums.length];
        int j = 0;
        for (int num : nums) {
            if (num != val) {
                result++;
                temp[j] = num;
                j++;
            }
        }
        System.arraycopy(temp, 0, nums, 0, temp.length);
        return result;
    }

}