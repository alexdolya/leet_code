package ru.dolya.easy.problem2037;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] seats1 = new int[]{3, 1, 5};
        int[] students1 = new int[]{2, 7, 4};
        System.out.println(minMovesToSeat(seats1, students1)); //4

        int[] seats2 = new int[]{4, 1, 5, 9};
        int[] students2 = new int[]{1, 3, 2, 6};
        System.out.println(minMovesToSeat(seats2, students2)); //7

        int[] seats3 = new int[]{2, 2, 6, 6};
        int[] students3 = new int[]{1, 3, 2, 6};
        System.out.println(minMovesToSeat(seats3, students3)); //4
    }


    public static int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int result = 0;
        for (int i = 0; i < seats.length; i++) {
            result += Math.abs(seats[i] - students[i]);
        }
        return result;
    }
}
