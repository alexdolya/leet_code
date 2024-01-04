package ru.dolya.medium.problem_2870;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        int[] input = {2, 3, 3, 2, 2, 4, 2, 3, 4};
        System.out.println(minOperations(input));
        int[] input2 = {2, 1, 2, 2, 3, 3};
        System.out.println(minOperations(input2));
        int[] input3 = {14, 12, 14, 14, 12, 14, 14, 12, 12, 12, 12, 14, 14, 12, 14, 14, 14, 12, 12};
        System.out.println(minOperations(input3));
    }

    public static int minOperations(int[] nums) {
        int operationCount = 0;
        Map<Integer, Integer> groupedMap = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toMap(
                        number -> number,
                        number -> 1,
                        Integer::sum
                ));
        for (Integer value : groupedMap.values()) {
          if (value == 1){
              return -1;
          }
          operationCount += (value + 2) / 3;
        }
        return operationCount;
    }
}
