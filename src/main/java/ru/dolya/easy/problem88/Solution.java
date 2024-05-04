package ru.dolya.easy.problem88;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int currentP = m + n - 1;

        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[currentP] = nums1[p1];
                currentP--;
                p1--;
            } else {
                nums1[currentP] = nums2[p2];
                currentP--;
                p2--;
            }
        }
        while (p2 >= 0) {
            nums1[currentP] = nums2[p2];
            currentP--;
            p2--;
        }
    }
}
