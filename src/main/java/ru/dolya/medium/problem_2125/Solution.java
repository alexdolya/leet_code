package ru.dolya.medium.problem_2125;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(numberOfBeams(new String[]{"011001", "000000", "010100", "001000"}));
        System.out.println(numberOfBeams(new String[]{"000", "111", "000"}));

    }

    public static int numberOfBeams(String[] bank) {
        List<Integer> countArr = new ArrayList<>();
        int count;
        for (String s : bank) {
            count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '1') {
                    count++;
                }
            }
            if (count > 0) {
                countArr.add(count);
            }
        }
        int beams = 0;
        for (int i = 1; i < countArr.size(); i++) {
            beams += countArr.get(i) * countArr.get(i - 1);
        }
        return beams;
    }
}
