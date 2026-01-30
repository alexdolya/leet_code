package ru.dolya.medium.problem2352;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        int[][] array = {
                {3, 2, 1},
                {1, 7, 6},
                {2, 7, 7}
        };
        System.out.println(equalPairs(array));

        int[][] array2 = {
                {3, 1, 2, 2},
                {1, 4, 4, 5},
                {2, 4, 2, 2},
                {2, 4, 2, 2}
        };
        System.out.println(equalPairs(array2));

        int[][] array3 = {
                {11, 1},
                {1, 11}
        };
        System.out.println(equalPairs(array3));
    }

    public static int equalPairs(int[][] grid) {
        Map<String, Integer> rows = new HashMap<>();

        for (int[] ints : grid) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int anInt : ints) {
                stringBuilder.append(anInt);
                stringBuilder.append(" ");
            }
            String rowString = stringBuilder.toString().trim();
            rows.put(rowString, rows.getOrDefault(rowString, 0) + 1);
        }

        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < grid[i].length; j++) {
                stringBuilder.append(grid[j][i]);
                stringBuilder.append(" ");
            }
            String columnString = stringBuilder.toString().trim();
            if (rows.containsKey(columnString)) {
                result += rows.get(columnString);
            }
        }
        return result;
    }
}
