package ru.dolya.medium.problem1052;

public class Solution {
    public static void main(String[] args) {

        int[] customers = new int[]{1, 0, 1, 2, 1, 1, 7, 5};
        int[] grumpy =    new int[]{0, 1, 0, 1, 0, 1, 0, 1};
        int minutes = 3;
        System.out.println(maxSatisfied(customers, grumpy, minutes)); //16

        int[] customers2 = new int[]{9, 10, 4, 5};
        int[] grumpy2 = new int[]{1, 0, 1, 1};
        int minutes2 = 1;
        System.out.println(maxSatisfied(customers2, grumpy2, minutes2)); //19
    }

    public static int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int maxSat = 0;
        int maxSatPos = 0;
        for (int i = 0; i <= customers.length - minutes; i++) {
            int currentMaxSat = 0;
            for (int j = i; j < i + minutes; j++) {
                if (grumpy[j] != 0) {
                    currentMaxSat += customers[j];
                }
            }
            if (currentMaxSat > maxSat) {
                maxSat = currentMaxSat;
                maxSatPos = i;
            }
        }
        for (int i = maxSatPos; i < maxSatPos + minutes; i++) {
            grumpy[i] = 0;
        }
        int result = 0;
        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0){
                result += customers[i];
            }
        }
        return result;
    }
}
