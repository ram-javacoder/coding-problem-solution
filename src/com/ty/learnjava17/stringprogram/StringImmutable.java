package com.ty.learnjava17.stringprogram;

public class StringImmutable {

    public static void main(String[] args) {
        String str1 = "Hello";
        int initialHash = System.identityHashCode(str1);

        // Attempting to modify str1 via concat
        String str2 = str1.concat(" World");

        System.out.println("Original String: " + str1); // Output: Hello
        System.out.println("New String:      " + str2); // Output: Hello World

        System.out.println("str1 Memory Hash: " + initialHash);
        System.out.println("str2 Memory Hash: " + System.identityHashCode(str2));

        // Attempting to reassign str1
        str1 = str1 + " World";
        System.out.println("str1 Hash after re-assignment: " + System.identityHashCode(str1));
    }
}

