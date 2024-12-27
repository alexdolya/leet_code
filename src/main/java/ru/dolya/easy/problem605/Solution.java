package ru.dolya.easy.problem605;

public class Solution {

    public static void main(String[] args) {
        int[] flowers = {1, 0, 0, 0, 1};
        System.out.println(canPlaceFlowers(flowers, 1));
        System.out.println(canPlaceFlowers(flowers, 2));

        int[] flowers2 = {0, 0, 0, 0, 1};
        System.out.println(canPlaceFlowers(flowers2, 2));

        int[] flowers3 = {1, 0, 1, 0, 1, 0, 1};
        System.out.println(canPlaceFlowers(flowers3, 1));

        int[] flowers4 = {1, 0, 0, 0, 0, 0, 1};
        System.out.println(canPlaceFlowers(flowers4, 2));

    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                if ((i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }
        return n <= 0;
    }
}
