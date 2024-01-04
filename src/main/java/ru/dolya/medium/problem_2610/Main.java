package ru.dolya.medium.problem_2610;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] input = {1, 3, 4, 1, 2, 3, 1};
        System.out.println(findMatrix(input));
    }

    public static List<List<Integer>> findMatrix(int[] nums) {
        Map<Integer, Integer> frequencyMap = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toMap(
                        number -> number,
                        number -> 1,
                        Integer::sum
                ));
        List<List<Integer>> result = new ArrayList<>();
        boolean isMapOver = false;
        while (!isMapOver) {
            isMapOver = true;
            List<Integer> list = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {

                if (!entry.getValue().equals(0)) {
                    list.add(entry.getKey());
                    frequencyMap.compute(entry.getKey(), (key, value) -> value - 1);
                    isMapOver = false;
                }

            }
            if (!isMapOver) {
                result.add(list);
            }
        }
        return result;
    }


}
