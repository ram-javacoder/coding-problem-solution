package com.ty.learnjava17.stringprogram;

//This program has been followed efficient approach

import java.util.HashSet;
import java.util.Set;

public class FindLongesSubString2 {

    public static void main(String[] args) {

        String str = "pwpkew";

        String result = findLongestSubString(str);

        System.out.println("Original String : " + str);
        System.out.println("Longest SubString : " + result
                + " Length : " + result.length());

    }

    private static String findLongestSubString(String str) {

        Set<Character> set = new HashSet<>();

        int left = 0;
        int maxLen = 0;
        int start = 0;

        for (int right = 0; right < str.length(); right++) {

            char ch = str.charAt(right);

            while (set.contains(ch)) {
                set.remove(str.charAt(left));
                left++;
            }
            set.add(ch);
            if (right - left + 1 > maxLen) {
                maxLen = right - left + 1;
                start = left;
            }
        }

        return str.substring(start, start + maxLen);
    }
}
