package ru.dolya.medium.problem1833;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(maxIceCream(new int[]{10, 6, 8, 7, 7, 8}, 5));
    }

    public static int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int totalCount = 0;
        long totalCost = 0;
        for (int cost : costs) {
            totalCost += cost;
            if (totalCost <= coins) {
                totalCount++;
            }
        }
        return totalCount;
    }
}
