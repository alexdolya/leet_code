package ru.dolya.medium.problem648;

import java.util.Arrays;
import java.util.List;

/*
In English, we have a concept called root, which can be followed by some other word to form another longer word
- let's call this word derivative. For example, when the root "help" is followed by the word "ful", we can form a derivative "helpful".
Given a dictionary consisting of many roots and a sentence consisting of words separated by spaces,
replace all the derivatives in the sentence with the root forming it. If a derivative can be replaced by more than one root,
replace it with the root that has the shortest length.

Return the sentence after the replacement.

Example 1:

Input: dictionary = ["cat","bat","rat"], sentence = "the cattle was rattled by the battery"
Output: "the cat was rat by the bat"
Example 2:

Input: dictionary = ["a","b","c"], sentence = "aadsfasf absbs bbab cadsfafs"
Output: "a a b c"

 */

public class Solution {

    public static void main(String[] args) {
        List<String> dict1 = Arrays.asList("cat", "bat", "rat");
        String sent1 = "the cattle was rattled by the battery";
        System.out.println(replaceWords(dict1, sent1));

        List<String> dict2 = Arrays.asList("a", "b", "c");
        String sent2 = "aadsfasf absbs bbab cadsfafs";
        System.out.println(replaceWords(dict2, sent2));

        List<String> dict3 = Arrays.asList("catt", "cat", "bat", "rat");
        String sent3 = "the cattle was rattled by the battery";
        System.out.println(replaceWords(dict3, sent3));
    }

    public static String replaceWords(List<String> dictionary, String sentence) {
        String[] wordsInSentence = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : wordsInSentence) {
            boolean found = false;
            String wordForAppend = "";
            int lessSize = Integer.MAX_VALUE;
            for (String dictWord : dictionary) {
                if (word.startsWith(dictWord)) {
                    if (lessSize > dictWord.length()) {
                        lessSize = dictWord.length();
                        wordForAppend = dictWord;
                    }
                    found = true;
                }
            }
            if (found) {
                sb.append(wordForAppend);
            } else {
                sb.append(word);
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }

}




















