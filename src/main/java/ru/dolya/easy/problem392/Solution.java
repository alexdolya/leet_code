package ru.dolya.easy.problem392;

public class Solution {

    public static void main(String[] args) {
//        System.out.println(isSubsequence("abc", "ahbgdc"));
//        System.out.println(isSubsequence("acb", "ahbgdc"));
//        System.out.println(isSubsequence("b", "c"));
        System.out.println(isSubsequence("b", "abc"));


    }

    public static boolean isSubsequence(String s, String t) {
        if (s.isBlank()) {
            return true;
        }
        if (t.isBlank()) {
            return false;
        }
        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();

        int sCur = 0;
        int answerInc = 0;
        for (char tChar : arrT) {
            if (sCur == arrS.length) {
                break;
            }
            if (tChar == arrS[sCur]) {
                answerInc++;
                sCur++;
            }
        }
        return answerInc == arrS.length;
    }
}
