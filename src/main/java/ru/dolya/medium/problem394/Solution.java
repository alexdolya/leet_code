package ru.dolya.medium.problem394;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {

    public static void main(String[] args) {
        System.out.println(decodeString("3[a2[bc]]"));
    }

    public static String decodeString(String s) {
        Deque<Character> charStack = new ArrayDeque<>();

        for (char currentChar : s.toCharArray()) {
            if (currentChar != ']') {
                charStack.push(currentChar);
            } else {
                // Build substring inside brackets
                String decodedSegment = "";
                while (charStack.peek() != '[') {
                    decodedSegment = charStack.pop() + decodedSegment;
                }
                charStack.pop(); // remove '['

                // Build number before '['
                String repeatCountStr = "";
                while (!charStack.isEmpty() && Character.isDigit(charStack.peek())) {
                    repeatCountStr = charStack.pop() + repeatCountStr;
                }

                int repeatCount = repeatCountStr.isEmpty()
                        ? 1
                        : Integer.parseInt(repeatCountStr);

                // Push repeated substring back to stack
                String expandedSegment = decodedSegment.repeat(repeatCount);
                for (char ch : expandedSegment.toCharArray()) {
                    charStack.push(ch);
                }
            }
        }

        // Build final result
        StringBuilder result = new StringBuilder();
        while (!charStack.isEmpty()) {
            result.append(charStack.pollLast());
        }
        return result.toString();
    }
}
