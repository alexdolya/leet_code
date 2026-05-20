package ru.dolya.hard.problem2657;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] result = new int[A.length];

        Set<Integer> aContains = new HashSet<>();
        Set<Integer> bContains = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            aContains.add(A[i]);
            bContains.add(B[i]);
            Set<Integer> aContains2 = new HashSet<>(aContains);
            aContains2.retainAll(bContains);
            result[i] = aContains2.size();
        }

        return result;
    }
}
