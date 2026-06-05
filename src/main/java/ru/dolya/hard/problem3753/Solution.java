package ru.dolya.hard.problem3753;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(totalWaviness(2549294942L, 5067104447L));
        System.out.println("Exec time - " + (System.currentTimeMillis() - start));
    }

    private static final int[] waves;

    static {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            int r = i % 10;
            int m = (i / 10) % 10;
            int l = i / 100;
            if (m > Math.max(l, r) || m < Math.min(l, r)) {
                list.add(i);
            }
        }
        waves = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static long totalWaviness(long A, long B) {
        return (waveCount(B) - waveCount(A - 1));
    }

    private static long waveCount(long num) {
        if (num < 100) return 0;
        long total = 0;
        for (long pattern : waves) {
            total += countWays(num, pattern);
        }
        return total;
    }

    private static long countWays(long num, long pattern) {
        String s = Long.toString(num);
        int n = s.length();
        boolean t = pattern < 100;
        long count = 0;

        for (int i = 0; i <= n - 3; i++) {
            long pre = (i == 0) ? 0 : Long.parseLong(s.substring(0, i));
            int cur = Integer.parseInt(s.substring(i, i + 3));
            long suf = (i + 3 == n) ? 0 : Long.parseLong(s.substring(i + 3));

            long mult = 1;
            for (int k = 0; k < n - i - 3; k++)
                mult *= 10;

            long ways;
            long edge = 0;

            if (cur > pattern) {
                ways = pre - (t ? 1 : 0) + 1;
            } else if (cur == pattern) {
                ways = Math.max(0, pre - (t ? 1 : 0));
                edge = (pre >= (t ? 1 : 0) ? 1 : 0) * (suf + 1);
            } else { // cur < pattern
                ways = Math.max(0, pre - (t ? 1 : 0));
            }

            count += ways * mult + edge;
        }
        return count;
    }
}