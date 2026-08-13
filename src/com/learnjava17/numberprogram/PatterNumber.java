package com.learnjava17.numberprogram;

public class PatterNumber {

    public static void main(String[] args) {
        int n = 5;
        patternNumber(n);
    }

    private static void patternNumber(int n) {
        for (int i = 1; i <= n; i++) {
            int num = i;
            System.out.print(num + " ");
            for (int j = 1; j < i; j++) {
                num += (n - j);
                System.out.print(num + " ");
            }
            System.out.println(" ");
        }
    }
}

