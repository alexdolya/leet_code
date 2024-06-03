package ru.dolya.medium.problem2486;

public class Solution {

    public static void main(String[] args) {
        System.out.println(appendCharacters("coaching", "coding")); //4
        System.out.println(appendCharacters("abcde", "a")); //0
        System.out.println(appendCharacters("z", "abcde")); //5
        System.out.println(appendCharacters("vrykt", "rkge")); //2
    }


    public static int appendCharacters(String s, String t) {
        int sPointer = 0;
        int tPointer = 0;

        while (sPointer < s.length() && tPointer < t.length()) {
            if (s.charAt(sPointer) == t.charAt(tPointer)){
                tPointer++;
            }
            sPointer++;
        }
        return t.length() - tPointer;
    }

}
