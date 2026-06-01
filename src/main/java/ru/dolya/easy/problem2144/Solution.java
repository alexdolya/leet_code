package ru.dolya.easy.problem2144;

import java.util.Arrays;

public class Solution {

    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int result = 0;
        int counter = 1;
        for (int i = cost.length - 1; i >= 0; i--) {
            if (counter != 3) {
                result += cost[i];
                counter++;
            } else {
                counter = 1;
            }
        }
        return result;
    }

}
