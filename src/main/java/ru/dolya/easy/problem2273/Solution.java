package ru.dolya.easy.problem2273;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        System.out.println(isAnagram("abba", "baba"));
        System.out.println(isAnagram("abba", "bbaa"));
        System.out.println(isAnagram("abba", "cd"));

        String[] array = new String[] {"abba","baba","bbaa","cd","cd"};
        System.out.println(removeAnagrams(array));

        String[] array2 = new String[] {"nelduncd","dcnndeul","uendlcnd","nluncedd","fozlsvr","osfvrlz","vozsrfl","dm","md","md","dm","md","dm","md","md","dm","dm","dm","dm","md","eatzkewuyx","a","wulzacir"};
        System.out.println(removeAnagrams(array2));

    }

    public static List<String> removeAnagrams(String[] words) {
        List<String> result = new ArrayList<>();
        result.add(words[0]);
        for (int i = 1; i < words.length; i++) {
            if (!isAnagram(words[i], words[i - 1])) {
                result.add(words[i]);
            }
        }
        return result;
    }

    public static boolean isAnagram(String word1, String word2) {
        char[] charArray1= word1.toCharArray();
        Arrays.sort(charArray1);
        char[] charArray2= word2.toCharArray();
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }

    public static boolean isAnagram2(String word1, String word2) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < word1.length(); i++) {
            char letter = word1.charAt(i);
            map.put(letter, map.getOrDefault(letter, 0) + 1);
        }
        for (int i = 0; i < word2.length(); i++) {
            char letter = word2.charAt(i);
            if (map.containsKey(letter)) {
                map.put(letter, map.get(letter) - 1);
            } else {
                return false;
            }
        }
        return map.values().stream()
                .filter(count -> count != 0)
                .toList().isEmpty();
    }
}
