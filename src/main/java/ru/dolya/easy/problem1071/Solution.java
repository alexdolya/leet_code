package ru.dolya.easy.problem1071;

public class Solution {

    public static void main(String[] args) {
        String str1 = "ABABAB";
        String str2 = "ABAB";
        System.out.println(gcdOfStrings(str1, str2));
    }

    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1+str2).equals(str2+str1)) {
            return "";
        }
        int nod = Math.min(str1.length(), str2.length());
        while (str1.length() % nod != 0 || str2.length() % nod != 0) {
            nod--;
        }
        return str1.substring(0, nod);
    }

}
