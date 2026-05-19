package ru.dolya.easy.problem2540;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getCommon(
                new int[]{34, 225, 328, 530, 823, 834, 902, 989},
                new int[]{24, 30, 115, 121, 160, 173, 239, 265, 335, 362, 449, 557, 597, 624, 697, 766, 775, 881, 898, 919})
        );
    }

    public static int getCommon(int[] nums1, int[] nums2) {
        if (nums1[nums1.length - 1] < nums2[0] || nums2[nums2.length - 1] < nums1[0]) {
            return -1;
        }
        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                return nums1[i];
            }
            if (i == nums1.length - 1 && j == nums2.length - 1) {
                break;
            }
            if (nums1[i] < nums2[j]) {
                if (i != nums1.length - 1) {
                    i++;
                }
            } else {
                if (j != nums2.length - 1) {
                    j++;
                }
            }

        }

        return -1;
    }
}
