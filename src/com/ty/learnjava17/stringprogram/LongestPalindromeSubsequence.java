package com.ty.learnjava17.stringprogram;

public class LongestPalindromeSubsequence {

    public static void main(String[] args) {

        String str = "bcba";
        int result = longestPalindromeSubseq(str);

        System.out.println("Output: " + result);
    }

    private static int longestPalindromeSubseq(String s) {


        int n = s.length();

        int[][] memo = new int[n][n];

        return lps(s, 0, n - 1, memo);
    }

    private static int lps(String s, int left, int right, int[][] memo) {

        // No characters
        if (left > right) {
            return 0;
        }

        // One character
        if (left == right) {
            return 1;
        }

        // Already calculated
        if (memo[left][right] != 0) {
            return memo[left][right];
        }

        // First and last characters are same
        if (s.charAt(left) == s.charAt(right)) {

            memo[left][right] =
                    2 + lps(s, left + 1, right - 1, memo);

        } else {

            // First and last characters are different
            memo[left][right] = Math.max(
                    lps(s, left + 1, right, memo),
                    lps(s, left, right - 1, memo)
            );
        }

        return memo[left][right];
    }

}

