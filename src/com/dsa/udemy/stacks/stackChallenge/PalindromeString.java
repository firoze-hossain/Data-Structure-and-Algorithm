package com.dsa.udemy.stacks.stackChallenge;

import java.util.LinkedList;
import java.util.Locale;

public class PalindromeString {
    public static void main(String[] args) {
        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Don't nod"));

    }

    public static boolean checkForPalindrome(String s) {
        LinkedList<Character> stack = new LinkedList<Character>();
        StringBuilder noPunctuation = new StringBuilder(s.length());
        String lowercase = s.toLowerCase();
        for (int i = 0; i < lowercase.length(); i++) {
            char c = lowercase.charAt(i);
            if (c >= 'a' && c <= 'z') {
                noPunctuation.append(c);
                stack.push(c);
            }
        }
        StringBuilder reverseString = new StringBuilder(stack.size());
        while (!stack.isEmpty()) {
            reverseString.append(stack.pop());
        }
        return reverseString.toString().equals(noPunctuation.toString());
    }
}
